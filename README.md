# CZ3002 Assignment 2
This is the repository used for the development of a sample login function using struts 2.

## 1. Dependencies
This project requires the following dependencies:
* Maven
* MySQL

Also, the MySQL database needs to be pre-filled with a database, table and users. Execute the queries in the [mysqlScript.txt](mysqlScript.txt) for the webapp to be working properly.

## 2. Deployment
To deploy, execute the following command:
```
mvn jetty:run
```
Following which, the webapp can be accessed at
```
http://localhost:8080/login
```
