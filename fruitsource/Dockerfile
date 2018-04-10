FROM java:8-alpine

ARG JAR_FILE

ADD target/${JAR_FILE} fruitsource.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /fruitsource.jar