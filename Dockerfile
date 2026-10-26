# Use maven with jdk17 as build stage for compiling java source code
FROM maven:3.8-openjdk-17 AS builder
# Set working directory inside the build container
WORKDIR /app
# Copy pom.xml first for dependency cache optimization
COPY pom.xml .
# Pre-download all maven dependencies offline
RUN mvn dependency:go-offline
# Copy all source code into container
COPY src ./src
# Compile project, run unit tests and generate jar package
RUN mvn package -DskipTests=false

# Second stage: Amazon corretto jre as runtime
FROM amazoncorretto:17-al2-jre
# Set working directory for runtime container
WORKDIR /app
# Copy the built jar file from builder stage to runtime container
COPY --from=builder /app/target/calculator-1.0-SNAPSHOT.jar app.jar
# Command to start the calculator application
ENTRYPOINT ["java","-jar","app.jar"]

