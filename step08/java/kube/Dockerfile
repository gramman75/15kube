FROM openjdk:11.0-jdk-slim-buster
VOLUME /tmp
EXPOSE 9990
COPY target/java-server-2.0.jar java-server.jar
ENTRYPOINT ["java","-jar","java-server.jar"]