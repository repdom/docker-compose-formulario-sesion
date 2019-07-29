FROM adoptopenjdk/openjdk8:alpine-jre

VOLUME /app

COPY build/libs/cornelia-0.0.1-SNAPSHOT.jar app.jar

#RUN chmod +x entrypoint.sh

ENTRYPOINT ["java", "-jar", "app.jar"]