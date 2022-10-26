# cinema-app
## Description
### A few words about this project:
This is a cinema web application made on java with Spring framework. You can register a new user choosing a role. After authorization, you can add a movie, movie session, add ticket to the shopping cart and complete an order.
### Here are a few features of the Cinema web application project:
*Register a new user in the database choosing his role*

*Login to the system*

*Add a movie*

*Add a movie session*

*Add a ticket to the shopping cart*

*Add, update or delete a movie session*

*Get user by email*

### Project structure:
**This Cinema-app project based on an N-Tier Architecture:**

**DAO** - layer, that works with the DB.

**Service** - layer, where are all business logic based on.

**Controller** - layer, that works with clients requests.

### Technologies:
Java 11

Spring MVC

Spring Security

Hibernate

Apache Tomcat 9.0.50

Apache Maven 3.8.0

MySQL 8.0.30

### To run the Cinema-app project you need to:
1. Make a fork of this project to your repository.
2. Copy link from your repository and create a new project in your IDE.
3. Configure file ***db.properties*** with your own parameters:
```
    db.driver= "Write path to your JDBC driver";
    db.url= "Write URL to your database";
    db.user= "Write your username";
    db.password= "Write your password";
     
    hibernate.show_sql= "Write your property";
    hibernate.hbm2ddl.auto= "Write a property for your database";
    hibernate.dialect= "Write a dilaect for you DBMS"; 
```
5. Install Tomcat 9.0.50.
6. Configure Tomcat Server.
7. Run your code.