FROM openjdk:8
COPY ./target/	calcSpe-1.0-SNAPSHOT-jar-with-dependencies.jar	./
WORKDIR ./
CMD ["java", "-jar", "calcSpe-1.0-SNAPSHOT-jar-with-dependencies.jar"]