# spring-dependency-injection
A simple java web application created to learn spring dependency injection both annotation based and XML based.

XML based DI uses `applicationContext.xml` to inject the dependencies. (See method `com.di.sample.DIMain.DrawUsingXML()`)

Annotation based DI uses `com.di.sample.config.AppConfig.java` and `@Autowired` annotation to inject the dependencies.  (See method `com.di.sample.DIMain.DrawUsingAnnotation()`)

### prerequisites
1. Java 1.8
2. Maven 3.5.2
3. A proper JavaEE IDE (I'm using Eclipse Luna)

### setup
1. Clone this project
2. Open as maven project
3. Update maven dependencies
4. Run `com.di.sample.DIMain.java`


### code style formatter
[Spring Boot Java Conventions](https://gist.github.com/jyotsnasanthosh/e2fb456f0ff91aa42ad8203e148bff79)
Save this as xml and import intto eclipse -> window -> preferences -> java -> code style -> formatter