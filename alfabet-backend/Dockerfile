FROM maven:3.8.5-openjdk-17
COPY . /project
WORKDIR /project
RUN mvn package -Dmaven.test.skip=true
ENTRYPOINT ["java", "-jar", "./target/demo-0.0.1-SNAPSHOT.jar"]
