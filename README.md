Manufacturer Search API


Overview
The Manufacturer Search API is a proof of concept developed for Makersharks. It allows buyers to search for manufacturers based on customized
requirements such as location, nature of business, and manufacturing processes. This project is built using Spring Boot and MySQL.

Features
* Search Manufacturers: Filter manufacturers by location, nature of business (e.g., small_scale, medium_scale, large_scale),
and specific manufacturing processes (e.g., moulding, 3D printing, casting, coating).

* RESTful API: A simple and clean API design using Spring Boot.
Input Validation: Basic input validation to ensure the correctness of data.


Technologies Used
* Java 17 
* Spring Boot
* Spring Data JPA
* MySQL
* Lombok 
* Spring Boot DevTools


To run your Spring Boot application using an Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or Spring Tool Suite (STS), follow these steps:

Step 1: Import the Project into Your IDE
1.Open Your IDE:
* Launch your IDE (IntelliJ IDEA, Eclipse, or STS).
  
2.Import the Project:
* If you are using IntelliJ IDEA:
   > Select File > Open.
   > Navigate to the directory where your project is located and select the project folder.
   > Click Open.
* you are using Eclipse/STS:
   Select File > Import > Existing Maven Projects.
   Browse to your project directory, select it, and click Finish.
Wait for the Project to Load:

The IDE will automatically download the required dependencies by reading the pom.xml file.

Step 2: Configure the Database Connection
    1. Edit application.properties:
    * Open the src/main/resources/application.properties file.
    * Make sure your MySQL database connection settings are correctly configured
* Replace your_username and your_password with your actual MySQL credentials.

Step 3: Run The Application

***********i used Postman for testing api ******************

* input

{
  "location": "India",
  "natureOfBusiness": "small_scale",
  "manufacturingProcesses": ["moulding", "3d_printing"]
}


* output


  {
    "supplierId": 1,
    "companyName": "Chetan Manufacturing",
    "website": "http://chetanmanufacturing.com",
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": ["moulding", "3d_printing"]
  },
  {
    "supplierId": 2,
    "companyName": "makersharks Industries",
    "website": "http://makersharksindustries.com",
    "location": "India",
    "natureOfBusiness": "small_scale",
    "manufacturingProcesses": ["3d_printing"]
  }

  note - for giving proper response data is must avaliable on database first update data in database then run the application


    
