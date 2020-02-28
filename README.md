# Car-Rental asys-core
## Description
This Repository holds the parent POM `core` of the Car-Rental microservices. This `core` POM defines all the external
dependencies (e.g. Spring or Lombok) most or all microservices of the Car-Rental depend on.

The parent POM has a module called `dependencies`, which contains all the classes which are common among all or most
of the microservices of the Car-Rental (e.g. models and DTOs).

## Usage
To use the parent POM `core` as the parent for a new microservice just add the following to your POM:
```
<parent>
  <groupId>com.asys1920</groupId>
  <artifactId>core</artifactId>
  <version>1.0.0</version>
</parent>
```
This adds the `core` POM as parent to your project, which means your project inherits all dependencies and variables
(like the Java version) of the `core` POM.

To use the models and DTOs in the `dependencies` module just add 
```
<dependency>
    <groupId>com.asys1920</groupId>
    <artifactId>dependencies</artifactId>
    <version>1.0.0</version>
</dependency>
```
to the `<dependencies> ... </dependencies>` section of your POM.