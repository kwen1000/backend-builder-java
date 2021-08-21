# backend-builder-java

You'll need an `application.properties` in the resources folder.

To build and run, use either:
  - `mvn clean install && mvn spring-boot:run`
  - `mvn clean install && java -jar ./target/*.jar` (This might not work)

You can also just run `mvn spring-boot:run` by itself, but it won't delete the target folder nor rebuild.
