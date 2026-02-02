# Stage 1: Build stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime stage
FROM openjdk:17-jdk-slim
WORKDIR /app
# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

# Requirement: Ensure port exposure matches application configuration
EXPOSE 8081

# Set the environment variable to force Spring to run on 8081
ENV SERVER_PORT=8081

# Run the application
ENTRYPOINT ["java", "-Dserver.port=8081", "-jar", "app.jar"]
