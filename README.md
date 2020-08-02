# Spring Boot Gradle MultiModule 


This is a Gradle MultiModule Spring Boot Project example. 
The project has two modules, common module which holds the model class and a Core module which hold the controller,service,dao layers. 
The application is based on REST architecture exposing a common -`api/v1/person` endpoint which supports POST/GET/PUT/DELETE endpoint to perform operations to add, retrieve, modify, remove a person object stored in a DataSource. 
