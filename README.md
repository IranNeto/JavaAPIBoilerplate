# Java API Boilerplate

✅

This project ~~as the name suggest~~ is a java API boilerplate built with some good practices that I find good to use.

_Feel free to discord or discuss about it_ :)

> Disclaimer: Doesn't mean that everything that the project set up is mandatory for every microservice.
> Feel free to remove or add anything you might (don't) find necessary.

* [General Specifications](#general-specs)
* [Modules](#modules)
    * [Client modules](#client-module)
    * [Core modules](#core-module)
    * [Service modules](#service-module)
* [Changes coming soon](#changes-coming-soon)

## General Specs

- Java 11
- Gradle version 6.7
- 3 modules: Client, Core, Service. Read more below.
- 1 SB2 Admin server for microservices registration.
- Spring Boot version 2.2.4 in service module
- Liquibase setup
- PostgreSQL setup as database
- pgadmin 4 as database administration platform
- Docker and docker-compose setup with 4 basic containers
    - Service module: example-service
    - Registration module: sb-admin
    - Database: db
    - Database platform: pgadmin4

## Modules

This API model is composed by 3 different modules to separate concerns and provide better practices
in a microservice architecture.

> Why separate in modules? 
>> Separating in modules allow the dev to publish artifacts that contains only the client interface, 
>> core domain or the service. It can be beneficial with DDD architectures where the separation and reuse
>> of concerns can allow a more cohesive microservice structure. 

### Client module 

Client module concern interfaces and configuration to communicate with other services
In an microservice infrastructure is a common thing 2 services communicating with each other.
This interface of communication and other components related to it are being hold in this module.

`Feign client setup coming soon`

### Core module

This module is going to be used to hold our domain classes and other core components that the application
is going to use.

### Service module

Service module contains all domain and business logic routines 
such as: Controllers, adapters, components, repositories, among others. It uses the port 8080 but is also open to debugger or 
socket connections in 8083.

## Registry module (sb-admin)

This module is a spring admin server application to registre other spring clients. It uses the port 8080 but is also open to debugger or 
socket connections in 9993

# Docker

Docker is already setup to run the project. Just follow the steps below.

1 - Bring up the database container in order to be updated with liquibase changesets
```shell script
docker-compose up -d db
```

2 - Build the jar from gradle. The project has configs to build the sb-admin and
the example-service module.
```shell script
gradle clean build
```
3 - Build the images with docker-compose. The project has also configurations to build
both images with this command. Look at docker-compose file and the Dockerfiles inside
docker folder in each module to more information.
```shell script
docker-compose build
```
4 - Bring up the example-service. With it will come together the register service (sb-admin) and 
database platform (pgadmin4)

```shell script
docker-compose up example-service
```

If everything worked out you should be able to see example-service registered in
`http://locahost:9990/applications` and also be able to enter in pgadmin 4 through `http://localhost:16543/`

# Pgadmin 4

You'll be able to see the database, schemas and tables created at `http://localhost:16543/`.
To connect into the db container just follow the steps below:

1 - Go in _Add a new server_ and just give to it the name you want

2 - On connection tab the make sure these configs are setup like this:
```
Hostname/Address: db
Port: 5432
Maintanance database: postgres
Username: postgres
Password: freedev
```
3 - Save and you should be connected to it

## Documentation

`swagger.yml` is provided with the api documentation

## Changes coming soon

- ~~Endpoints~~
- ~~Database connection~~
- ~~Docker setup~~
- ~~Documentation~~
