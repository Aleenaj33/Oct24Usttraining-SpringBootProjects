FROM openjdk:8
EXPOSE 8093
ADD ./target/bootdocker.jar bootdocker.jar
ENTRYPOINT ["java", "-jar", "bootdocker.jar"]