# ---- Build stage
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -DskipTests package

# ---- Run stage
FROM eclipse-temurin:21-jre
WORKDIR /app
RUN adduser --system --group spring
COPY --from=build /app/target/*-SNAPSHOT.jar /app/app.jar
USER spring
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
