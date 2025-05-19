# springboot-hazelcast
This repository shows the use of Hazelcast Cache in Springboot application with multicast true

This is a Spring Boot application that demonstrates the use of Hazelcast for caching.

Project Structure

The code begins with a description of the project's directory structure:

src/main/java/com/siddhu/ contains the main application code, including the controller (SiddhuController.java), service (SiddhuService.java), and the main application class (SpringbootHazelcastApplication.java).

src/main/resources/ holds configuration files, notably application.properties and hazelcast.yaml.

The pom.xml file is the Maven project configuration, defining dependencies and build settings.

Key Components

pom.xml:  This file configures the project's dependencies. It includes:

spring-boot-starter-cache: Provides Spring's caching abstractions.

hazelcast-all: The Hazelcast library, enabling distributed caching.

spring-boot-starter-web: For building web applications with Spring MVC. 

SpringbootHazelcastApplication.java: This is the main entry point of the Spring Boot application. The @EnableCaching annotation enables Spring's caching support.

SiddhuController.java:  This is a REST controller that handles requests to /siddhu/{siddhuname}. It autowires the SiddhuService to handle the business logic.

SiddhuService.java:  This service contains the getSiddhuNameService method, which is annotated with @Cacheable("siddhu"). This annotation tells Spring to cache the result of this method. The findNameInDatabase method simulates a database call (or other time-consuming operation) with a 4-second delay.

hazelcast.yaml:  This file configures Hazelcast. In this case, it enables multicast for cluster discovery.

How Caching Works

When a request comes in for /siddhu/{siddhuname}, the getSiddhuName method in SiddhuController calls getSiddhuNameService in SiddhuService.

The first time getSiddhuNameService is called for a given siddhuname, it executes the findNameInDatabase method (simulating a slow call), and the result is stored in the "siddhu" cache.

Subsequent calls to getSiddhuNameService with the same siddhuname will retrieve the result from the cache, bypassing the findNameInDatabase method and significantly speeding up the response.

Maven Wrapper

The mvnw and mvnw.cmd files are the Maven Wrapper. They allow you to build the project without having Maven installed globally. The wrapper will automatically download the correct Maven version if it's not already present
