FROM openjdk:17-jdk-alpine

EXPOSE 8080

RUN mkdir -p /usr/app
COPY ./target/java-maven-app-*.jar /usr/app
WORKDIR /usr/app

CMD ["java", "-jar", "java-maven-app-*.jar"]
