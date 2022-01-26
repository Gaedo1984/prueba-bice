FROM openjdk:11
ADD target/devops-api-test-0.0.1-SNAPSHOT.jar aws-ecs-springboot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "aws-ecs-springboot.jar"]