FROM java:8-alpine

ARG JAR_FILE

ADD target/${JAR_FILE} appender.jar

ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /appender.jar