FROM adoptopenjdk:11-jre-hotspot
ENV SERVICE_NAME=javaAPIBoilerplate
ENV SERVICE_PORT=8080
EXPOSE 8080
EXPOSE 8083

ADD build/libs/example-service*.jar example-service.jar
RUN bash -c 'touch /example-service.jar'
CMD  ["java", "-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8083", "-Djava.security.egd=file:/dev/./urandom", "-jar", "example-service.jar"]

