FROM openjdk:21-jdk
COPY target/HeyApp.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
