FROM java:8
MAINTAINER funnyboy
VOLUME /tmp
RUN mkdir /app
ADD docker-eureka-0.0.1-SNAPSHOT.jar /app/eureka.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/eureka.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 8763

CMD /app/runboot.sh
