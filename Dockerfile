FROM openjdk:11
VOLUME /tmp
COPY target/*.war example-service-time.war
EXPOSE 8080
CMD ["java", "-jar", "/example-service-time.war"]