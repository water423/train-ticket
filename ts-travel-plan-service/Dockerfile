FROM java:8-jre

ENV APP_NAME=ts-travel-plan-service-1.0.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

COPY ./jacocoagent.jar /app/
ADD ./target/ts-travel-plan-service-1.0.jar /app/
#CMD ["java", "-Xmx200m",  "-jar", "/app/ts-travel-plan-service-1.0.jar"]

ENTRYPOINT exec java -javaagent:/app/jacocoagent.jar=includes=*,output=tcpserver,port=6339,address=0.0.0.0 -Xmx200m -jar /app/${APP_NAME}.jar

EXPOSE 6339
EXPOSE 14322