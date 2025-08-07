FROM eclipse-temurin:17
COPY target/github-jenkins-docker-1.0.0.jar github-jenkins-docker-1.0.0.jar
CMD ["java", "-jar", "github-jenkins-docker-1.0.0.jar"]
