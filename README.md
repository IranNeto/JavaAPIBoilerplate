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
- 3 modules: Client, Core, Service. Read more on 
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

This module are going to be used to hold our domain classes and other core components that the application
is going to use.

### Service module

Service module contains all the domain and business logic routines as: Controllers, adapters, components
, repositories, among others.

## Changes coming soon

- Endpoints
- Database connection
- Docker setup
- Unit testing
- Integration testing
- Security
- Cloud configuration
- Documentation