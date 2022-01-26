FROM gcr.io/distroless/java:11
VOLUME /tmp
ADD target/devops-api-test-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 5000
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]