# Use OpenJDK 13 as the base image
FROM openjdk:13-jdk

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/java_springboot_crud_example-3.0.1.jar app.jar

# Expose the application port
EXPOSE 9191

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
