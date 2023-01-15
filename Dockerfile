FROM amazoncorretto:11-alpine-jkd
MAINTAINER Matias Irusta
COPY target/Matias-0.0.1-SNAPSHOT.jar  Matias-app.jar
ENTRYPOINT ["java","-jar","/Matias-app.jar"]
