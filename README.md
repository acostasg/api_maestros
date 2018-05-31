# API Proxy for Master Data 

Project created with "Spring Boot" for the API proxy to get master data, the key objective is to centralized information.

### Create container and deploy
```
docker-compose up -d
```

This action create the container from image with Open JAVA 1.8 and Gradle 4.5, and run server (jar) in port 80

Requeriments:

* Docker
* Docker-compose


### Development

Run:
```
gradle bootRun
```

Execute test:
```
gradle test
```
Requeriments:

* Java sdk 1.8
* Gradle 4.0 or +

### Database

The database connection (SQLServer o SQLServerExpress) options add in:
* api_maestros/src/main/resources/application.properties

#TODO 
Add container with development database SQLServerExpress in docker-compose.yml
* https://docs.microsoft.com/en-us/sql/linux/quickstart-install-connect-docker?view=sql-server-linux-2017

#TODO
Parameterize resource path to image server for ImageController proxy
