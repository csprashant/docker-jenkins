FROM openjdk:11
EXPOSE 8080
ADD target/docker-example.jar docker-example.jar
ENTRYPOINT ["java","-jar","/docker-example.jar"]