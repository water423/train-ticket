FROM java:8-jre

ENV APP_NAME=ts-execute-service-1.0.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY ./jacocoagent.jar /app/
ADD ./target/ts-execute-service-1.0.jar /app/
#CMD ["java", "-Xmx200m",  "-jar", "/app/ts-execute-service-1.0.jar"]

ENTRYPOINT exec java -javaagent:/app/jacocoagent.jar=includes=*,output=tcpserver,port=6319,address=0.0.0.0 -Xmx200m -jar /app/${APP_NAME}.jar

EXPOSE 6319
EXPOSE 12386