# Use a base image with OpenJDK 21
FROM openjdk:21-slim

# Install Maven
RUN apt-get update && apt-get install -y maven && apt-get clean

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package && ls target  # Check that the jar file is created

# Set the command to run your app
CMD ["java", "-jar", "target/GreeterApp-1.0-SNAPSHOT.jar"]
