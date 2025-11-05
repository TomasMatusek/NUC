# --------------------------
# Stage 1: Build the app
# --------------------------
FROM eclipse-temurin:21-jdk AS build

# Set working directory inside container
WORKDIR /app

# Copy Gradle wrapper and build files
COPY gradlew .
COPY gradle/ gradle/
COPY build.gradle .
COPY settings.gradle .

# Copy the rest of the source code
COPY src/ src/

# Make gradlew executable
RUN chmod +x ./gradlew

# Build the Spring Boot app (produces fat jar)
RUN ./gradlew clean build -x test

# --------------------------
# Stage 2: Run the app
# --------------------------
FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose port the Spring Boot app will run on
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
