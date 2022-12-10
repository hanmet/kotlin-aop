## Spring Boot Kotlin Aspect Project

This is a small playground project to test a spring boot project with Kotlin using aspects 
(see [aspect oriented programming](https://docs.spring.io/spring-framework/docs/3.0.x/spring-framework-reference/html/aop.html))

### Test Aspects
Start the project and call one of the endpoints (localhost:8080/first or localhost:8080/second).
Depending on which endpoint got called, either one or multiple methods in the aspect get executed (and produce log messages).
