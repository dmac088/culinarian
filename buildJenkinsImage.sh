#!/bin/bash
docker build -t jenkins-demo . && \
docker run -d jenkins-demo 
#ID=`docker container ls  | grep 'jenkins-demo' | awk '{print $1}'` 
#docker exec -it --user root $ID sh -c "chmod 666 /var/run/docker.sock && exit" && \
#exit
