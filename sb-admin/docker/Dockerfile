FROM adoptopenjdk:11-jre-hotspot
ENV SERVICE_NAME=sb-admin
ENV SERVICE_PORT=9990
EXPOSE 9990
EXPOSE 9993

ADD build/libs/sb-admin*.jar sb-admin.jar
RUN bash -c 'touch /sb-admin.jar'
CMD  ["java", "-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9993", "-Djava.security.egd=file:/dev/./urandom", "-jar", "sb-admin.jar"]

