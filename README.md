# springboot2-swagger
Swagger integration with Spring Boot 2.0.1.BUILD-SNAPSHOT and Spring Cloud Finchley.BUILD-SNAPSHOT

In this application Swagger Integrated with Spring Boot 2, project up as WebApplicationType.SERVLET, but accessible also endpoints with Mono and Flux. I hope soon I will change application from WebApplicationType.SERVLET to Reactive and instead of Tomcat we will have Netty under Spring Cloud.

Run it as Spring boot application and access http://localhost:4545/swagger-ui.html and enjoy.

# Build and run

To get up in a few lines, just :

```
git clone https://github.com/armdev/springboot2-swagger.git
cd springboot2-swagger.git
mvn spring-boot:run
firefox localhost:4545/swagger-ui.html
```
