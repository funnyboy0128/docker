FROM java:8
MAINTAINER funnyboy
VOLUME /tmp
RUN mkdir /app
ADD docker-app-0.0.1-SNAPSHOT.jar /app/app.jar
ADD runboot.sh /app/
RUN bash -c 'touch /app/app.jar'
WORKDIR /app
RUN chmod a+x runboot.sh
EXPOSE 5678

CMD /app/runboot.sh
