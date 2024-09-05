# AREP LAB3: Java Web Server and IoC Framework with POJO Support

A web server developed in Java, capable of serving HTML pages and PNG images. The server includes an IoC (Inversion of Control) framework, allowing the construction of web applications from POJOs. To demonstrate its functionality, a sample web application was built using this server. The server is designed to handle multiple non-concurrent requests.

Additionally, a minimal prototype was created to showcase Java's reflective capabilities. This prototype successfully loads a bean (POJO) and generates a web application based on it, highlighting the server's flexibility and extensibility.

## Project Architecture

1. **Annotations:**
   - `@GetMapping`: Defines HTTP GET request mappings for methods.
   - `@RequestParam`: Specifies request parameters for methods.
   - `@RestController`: Marks a class as a REST controller that handles HTTP requests.
     
2. **Components:**
   - **HelloService**: A REST controller that provides various endpoints for different functionalities (greeting, time, hello, bye).
   - **SimpleHTTPServer**: A basic HTTP server that listens for incoming requests, handles them, and serves static files or responses based on defined routes.
   - **SpringECI**: A utility class for invoking methods in a service class based on a URL, demonstrating parameter extraction from query strings.
   - **JUnitECI**: A simple testing framework that runs tests annotated with `@Test` and reports their outcomes.
   - **ClassToBeTested**: A class with methods annotated with `@Test` to be used for testing.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before install and run the project you will need:

1. **Java** (version 17)

2. **Maven**
    - Download Maven from [here](http://maven.apache.org/download.html)
    - Follow the installation instructions [here](http://maven.apache.org/download.html#Installation)

3. **Git**
    - Install Git by following the instructions [here](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

### Installing

1. **Clone the repository and navigate into the project directory**:
    ```sh
    git clone https://github.com/JuanDavidGarciaPulido/AREP_LAB3.git

    cd AREP_LAB3
    ```

2. **Compile the project**:
   ``` bash
   mvn clean install
   ```

3. **Run the test**:
   ``` bash
   java -cp target/lab03Arep-1.0-SNAPSHOT.jar edu.escuelaing.arep.app.MyOwnTest.JUnitECI edu.escuelaing.arep.app.MyOwnTest.ClassToBeTested
    ```

   <img width="1336" alt="Captura de pantalla 2024-09-04 a la(s) 11 49 36 p  m" src="https://github.com/user-attachments/assets/a705acb3-86f2-4b9b-bde7-eba9c31bee6c">


4. **Run the SpringECI Utility**:
    ``` bash
   java -cp target/lab03Arep-1.0-SNAPSHOT.jar edu.escuelaing.arep.app.SpringECI edu.escuelaing.arep.app.HelloService
   ```

   <img width="1178" alt="Captura de pantalla 2024-09-04 a la(s) 11 51 52 p  m" src="https://github.com/user-attachments/assets/c6ab4f5f-5bd1-4ce2-b3cd-5e7b9b852634">


5. **Run the HTTP Server**:
    ``` bash
   java -cp target/classes edu.escuelaing.arep.app.SimpleHTTPServer
   ```

   <img width="846" alt="Captura de pantalla 2024-09-04 a la(s) 11 52 41 p  m" src="https://github.com/user-attachments/assets/655a4b90-0361-4490-bccc-26933e6596da">

Access the Web Server:
- Open a web browser and navigate to `http://localhost:8080/index.html`.
- The server will serve files from the `src/main/resources` directory.

<img width="846" alt="image" src="https://github.com/user-attachments/assets/6910bbca-bb6f-4e13-aee7-bc717c96a47b">




## Configuration
- **Web Root Directory**: The server serves files from the `src/main/webroot/` directory by default.
- **Port**: The server listens on port `8080` by default.
- **Thread Pool**: The server uses a thread pool with a fixed size of 10 threads to handle concurrent requests.

## Project Structure
```
AREP_LAB3/
│
├───src/
│   ├───main/
│   │   ├───java/
│   │   │   └───edu/
│   │   │       └───escuelaing/
│   │   │           └───arep/
│   │   │               └───app/
│   │   │                   ├───MyOwnTest
│   │   │                   ├───MyOwnSpringboot
│   │   │                   
│   │   │                   
│   │   │                   
│   │   │               
│   │   │
│   │   │
│   │   └───resources    
│   │       
│   │      
│   │          
│   │      
│   │       
│   │    
│   │
│   │
│   │                 
│   └───test/
│       └───java/
│           └───edu/
│               └───escuelaing/
│                   └───arep/
│                       └───app/
│                            
│                            
│                           
│                           
│                   
```

## Running the tests
Run the command:
```sh
   mvn test
```

(FOTO)

### Test Descriptions
#### 1. AppTest
This class, AppTest, is a unit test for the App class using JUnit's TestCase. This serves as a minimal, placeholder test to ensure the test infrastructure is working correctly.

#### 2. HelloServiceTest
This class, HelloServiceTest, is a unit test for the HelloService class using JUnit 5. It contains several test methods that validate the behavior of different methods in HelloService.
- testHello() checks if the hello() method returns the expected "Hello World" string.
- testBye() verifies that the bye() method returns "Bye!".
- testGreeting() ensures the greeting() method correctly greets the provided name.
- testTime() tests if the time() method returns the current time in the correct format.
- testDayOfWeek() checks if the dayOfWeek() method correctly returns the current day of the week.

## Author
This project was developed by Juan David García Pulido.

## Date

Wednesday, September 4 - 2024

## License

This project is licensed under the GNU license; See the [LICENSE.txt](LICENSE.txt) file for details.

