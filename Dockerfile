FROM eclipse-temurin:17
COPY target/github_jenkins_docker.jar github_jenkins_docker.jar
CMD ["java", "-jar", "github_jenkins_docker.jar"]
