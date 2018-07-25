FROM openjdk:8
ADD target/docker-authorities.jar docker-authorities.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "docker-authorities.jar"]