FROM openjdk:18
COPY build/libs/api-gw-0.0.1-SNAPSHOT.jar api-gw.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/api-gw.jar"]