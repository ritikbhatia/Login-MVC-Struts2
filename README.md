# CZ3002 Assignment 2

This is the repository used for the development of a sample login function using struts 2.

## 1. Dependencies

This project requires the following dependencies:

- Maven
- Java (JDK 11)
- MySQL

Also, the MySQL database needs to be pre-filled with a table and corresponding users. Execute the queries provided in the [userDB.sql](userDB.sql), in a MySQl shell, for the webapp to be working properly.

The MySQL script for database population can be found in the file named **userDB.sql** in the root directory

## 2. Deployment

To deploy, execute the following command:

```
mvn jetty:run
```

Following which, the webapp can be accessed at

```
http://localhost:8080/login
```
