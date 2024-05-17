# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the source code to the container
COPY . .

# Run Gradle build to create the JAR file
RUN ./gradlew build --no-daemon

# Use a second stage to create a smaller image
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/build/libs/RoleBaseAccessApplication.jar app.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]