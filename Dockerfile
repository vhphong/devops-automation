FROM maven:3.8.8-amazoncorretto-21 AS build
EXPOSE 8090
ADD target/devops-automation-integration.jar devops-automation-integration.jar
ENTRYPOINT ["java","-jar","/devops-automation-integration.jar"]