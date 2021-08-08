FROM openjdk:11
ADD target/demoOfimatica.jar demoOfimatica.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","demoOfimatica.jar"]
