#!/bin/bash

docker run -d --name my-jenkins-container \
	   -p 8080:8080 \
           --network my-net \
my-jenkins-img \


