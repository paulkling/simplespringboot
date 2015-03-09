FROM dockerfile/java:oracle-java8

ENV PATH $PATH:/usr/bin

WORKDIR /app
ADD build/libs/*.jar app.jar
ADD start.sh start.sh
RUN chmod +x *.sh

EXPOSE 8080

CMD ["./start.sh"]
