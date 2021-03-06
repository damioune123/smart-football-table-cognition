#!/bin/sh

DOCKER_IMAGE=arm32v7/maven
PRJ_NAME=$(basename $PWD)

docker run -it --rm -u "$(id -u)" \
-v "$(pwd)":/usr/src/$PRJ_NAME \
-w /usr/src/$PRJ_NAME \
$DOCKER_IMAGE \
mvn clean package jib:buildTar && cat target/jib-image.tar | docker image load

