FROM openjdk:17
LABEL author="decagon"
WORKDIR /app
EXPOSE 8080
COPY target/Docker_Practice-0.0.1-SNAPSHOT.jar /app/Docker_Practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/Docker_Practice-0.0.1-SNAPSHOT.jar"]
