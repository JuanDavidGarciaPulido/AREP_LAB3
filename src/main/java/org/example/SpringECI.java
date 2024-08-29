package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SpringECI {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException, InvocationTargetException, IllegalAccessException {
        Class c = Class.forName(args[0]);
        Map<String, Method> services = new HashMap<>();

        //Cargar Componentes
        if(c.isAnnotationPresent(RestController.class)){
            Method[] methods = c.getDeclaredMethods();
            for(Method m:methods){
                if(m.isAnnotationPresent(GetMapping.class)){
                    String key = m.getAnnotation(GetMapping.class).value();
                    services.put(key,m);
                }
            }
        }
        //Codigo quemado para ejemplo
        URL serviceurl = new URL("htpp://localhost:8080/App/Hello");
        String path = serviceurl.getPath();
        System.out.println("Path" + path);
        String servicename = path.substring(4);
        System.out.println("Service name " + servicename);

        Method ms = services.get(servicename);
        System.out.println("Respuesta servicio " + ms.invoke(null));



    }
}