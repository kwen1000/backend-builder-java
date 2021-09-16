# backend-builder-java

You'll need an `application.properties` in the resources folder.

## Serverless

Your cloud provider should handle everything.

## Virtual Machine (AWS EC2, GCP Compute, etc.)

Not automated yet. Follow instructions for local deployment. Ubuntu 20+ image preferred.

## Local (Mac/Ubuntu preferred)

`git clone [repository URL]`
`sudo apt install maven`

To build and run, use either:
  - `mvn clean install && mvn spring-boot:run`
  - `mvn clean install && java -jar ./target/*.jar` (This might not work)

You can also just run `mvn spring-boot:run` by itself, but it won't delete the target folder nor rebuild.
