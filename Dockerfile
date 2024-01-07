FROM eclipse-temurin:17.0.9_9-jre

EXPOSE 11000

COPY target/ragsdocker1-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]