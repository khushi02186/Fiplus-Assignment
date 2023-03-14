# Fiplus-Assignment
#Assignment
create a REST API for a Car object, with POST, PUT, and GET calls:
1. Create a new Spring Boot project using Spring Initializr, with the following dependencies:
Spring Web
Spring Data JPA
Postgres database

Define a Car entity class with the following fields
1. Maker
2. Model
3. Year
4. Color

##Execution 
In the code MappingApplication is the main class which consists of the main method.
The Car class consists of id, maker, model, year and color as coloums and Car object is used as the entity here.
The CarController class consists of all the REST API functions that is POST, GET, PUT.
CarService class consists of all the methods that we will be using in the CarController class.
To run the application go to the MappingApplication class and then run the programm. After running the springBoot project will send the request to the localhost and using the postman one can manage all the 3 REST API's that are GET, POST, PUT.
