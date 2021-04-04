# Java API Boilerplate

This project ~~as the name suggest~~ is a java API boilerplate built with some good practices that I find good to use.

_Feel free to discord or discuss about it_ :)

* [General Specifications](#general-specs)
* [Modules](#modules)
    * [Client modules](#client-module)
    * [Core modules](#core-module)
    * [Service modules](#service-module)
* [Changes coming soon](#changes-coming-soon)

## General Specs

- Gradle version 6.7
- 3 modules: Client, Core, Service. Read more below.
- 1 SB2 Admin server to registre.
- Spring Boot version 2.2.4 in service module
- Java 11

## Modules

This API model is composed by 3 different modules in order to separate the concerns

### Client module 

CLient module concern to the interfaces and configuration to communicate with other services
In an microservice infrastructure is a common thing having 2 services communicating with each other.
This interface of communication and other components related to it are being hold in this module.

`Feign client setup coming soon`

### Core module

This module is going to be used to hold our domain classes and other core components that the application
is going to use.

### Service module

Service module contains all domain and business logic routines 
such as: Controllers, adapters, components, repositories, among others.


## Registry module (sb-admin)

This module is a spring admin server application to registre other spring clients.

# Docker

Docker already is setup to run the project. Just follow the steps below.

1 - Build the jar from gradle. The project is configured to build the sb-admin and
 the example-service module.
```shell script
gw cb
```
2 - Build the images with docker-compose. The project is also configured to build
both images with this command. Look at docker-compose file and the Dockerfiles inside
docker folder in each module to more information.
```shell script
docker-compose build
```
3 - Bring up the example-service. With it will come together the register service (sb-admin)
```shell script
docker-compose up example-service
```

If everything worked out you should be able to see example-service registered in
`http://locahost:9990`

## Changes coming soon

- Endpoints
- Database connection
- ~~Docker setup~~
- Unit testing
- Integration testing
- Security
- Cloud configuration
- Documentation
