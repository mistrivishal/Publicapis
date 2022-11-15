# Publicapis
This application will create and entry with particular title, discerption and category and also persist it in to database;

# Installation & Run

- Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, MySQL database username and password as per your local database configuration.

```
    server.port=8080

    #db specific properties
    spring.datasource.url=jdbc:mysql://localhost:3306/entriesDB
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```

# API Root Endpoint
```
https://localhost:8080/
```
