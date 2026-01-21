# Estágio de Build
FROM maven:3.9-eclipse-temurin-21 AS build
# Nota: Usando JDK 21 LTS por compatibilidade, a menos que features do 25 sejam estritas.
# Se precisar estritamente do 25, procure uma imagem base 'eclipse-temurin:25-jdk' se disponível ou use openjdk:25-ea
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Estágio de Execução
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]