FROM openjdk:14
LABEL version="1.0.0" description="Api de Gerenciamento de Transações" maintainer="Squad"
CMD ["mkdir", "app"]
WORKDIR app/
COPY target/BlueBank-0.0.1-SNAPSHOT.jar app/blueBank.jar
ENV DB_USER=root
ENV DB_HOSTNAME=localhost
ENV DB_PORT=3306
ENV DB_DATABASE=blueBank
ENV DB_PASS=root
EXPOSE 8080
CMD ["java", "-jar", "-Dspring.profiles.active=docker", "app/blueBank.jar"]