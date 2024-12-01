FROM openjdk:21-jdk
COPY target/GreeterApp.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
