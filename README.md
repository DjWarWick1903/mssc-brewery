# SFG Beer Works - Brewery Microservice

Source code in this repository is to support my on line courses:
* [Spring Boot Microservices with Spring Cloud](https://www.udemy.com/spring-boot-microservices-with-spring-cloud-beginner-to-guru/?couponCode=GIT_HUB2)

Assignment 1:
* Create new DTO for Customer
  * UUID for ID, String for name
* Use Lombok for DTO
* Create Controller and get by ID URL
* Create Service and service implementation
* Test in Postman

Assignment 2:
* For the Customer object, create the following endpoints:
  * POST - Create new object
  * PUT - Update existing object
  * DELETE - Delete object
* Create service stubs similar to the BeerDto class

Assignment 3:
* Make the Name property of CustomerDTO
  * Non-null
  * min 3, max 100
* Add exception handler to Customer Controller
* Provide information back to consumer in error response

Assignment 4:
* Create a Customer class in domain package
* Implement MapStruct interface to:
  * Convert Customer to CustomerDto
  * Convert CustomerDTO to Customer