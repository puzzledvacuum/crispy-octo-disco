FROM openjdk:7
COPY . /usr
WORKDIR /usr/src/com/peterf/countdown
RUN javac *.java
WORKDIR /usr/src 
ENTRYPOINT java -classpath . com.peterf.countdown.CountdownGame
CMD []