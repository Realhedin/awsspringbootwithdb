# Getting Started

## Usage

### Run application
Before starting app, we need MySql server.
If you have locally - use it,
but you can use docker container 
(docker run --name aws-eb-mysql -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql:8.0.11)
Just to check, that application works, 
you can build it with maven and start via jar file. 
Or just run from IDE BootwithdatabaseApplication class.

### Deploy and run into AWS
Open AWS console and choose AWS Elastic beanstalk. 
There you need to choose Java environment and upload jar file (build with maven). 
After that in settings, choose DB appropriate connection params.
When environment is created, 
update env_variables for DB to:
MYSQL_HOST=[the endpoint of the database without the port]
MYSQL_DB=ebdb (this is a fix value for EB databases)
MYSQL_USER=[the username you provided]
MYSQL_PASSWORD=[the password you provided]
After everything is done, 
open EC2 console and use link from there. (p.s. port: 5000 because Nginx proxy map it to this port in AWS by default)

### Run with docker
Before starting application, docker images with MySql needs to be started (see above)
Application contains Dockerfile to be able to create an image and run container via docker. You can build your own image based on Dockerfile or just use already created: realhedin/simpleec2foraws (docker run -dp 5000:5000 realhedin/bootwithdb)
Plus, repo contains docker-compose.yml to run both app and DB.
(it uses restart-onfailure, so app with restart 1 or 2 times, 
waiting for MySql will be in working state)


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

