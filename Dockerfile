FROM eclipse-temurin:21-jre

WORKDIR /usr/app

COPY target/sb_dopcker_app.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"] 