FROM openjdk:11
VOLUME /tmp
COPY target/*.war service-time.war
EXPOSE 8080
CMD ["java", "-jar", "/example-service-time.war"]