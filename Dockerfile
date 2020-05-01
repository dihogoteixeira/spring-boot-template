## alpine linux with JRE
FROM openjdk:8-jre-alpine

## copy the spring jar
COPY target/*.jar /opt/app.jar

#COPY .auth_stdin.json /root/.auth_stdin.json

CMD ["/usr/bin/java", "-jar", "/opt/app.jar"]
