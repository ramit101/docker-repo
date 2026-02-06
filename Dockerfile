FROM eclipse-temurin:25
COPY target/demo-app.jar /opt/app
WORKDIR /opt/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo-app.jar"]