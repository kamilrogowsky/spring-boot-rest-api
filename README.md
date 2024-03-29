# spring-boot-rest-api


REST API for CRUD operations using Spring Boot in version 2.1.8 and MySQL Workbench database. For servlet stack applications, the 
dependency spring-boot-starter-web includes Tomcat server. Application was building in Maven project. Because that we are using a server, 
MySQL Workbench database, a datasource, a db connection pool and hibernate, we should define parameters in file called 
application.properties.


Testing Api was done with Insomnia REST client tool which allows to examine 4 basic HTTP methods (GET, POST, PUT, DELETE)
Results were automatically saved in table in MySQL Workbench database.


**Endpoints**

| Method | URL | Description |
| :---: | :---: | :---: |
| POST | /rental/vehicle | add vehicle |
| GET | /rental/vehicle/{id} | get information about vehicle by id |
| GET | /rental/vehicles | get information about all vehicles |
| PUT | /rental/vehicle/{id} | update specified vehicle |
| DELETE | /rental/vehicle/{id} | remove vehicle by id |
