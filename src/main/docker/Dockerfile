FROM davidcaste/alpine-java-unlimited-jce
VOLUME /tmp
ADD predictor-config-server-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "/app.jar"]
