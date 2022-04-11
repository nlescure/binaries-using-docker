#!/bin/bash
sudo docker run --name=java --rm -v $(pwd):/app -w /app -p 8080:8080 --net=host openjdk:17-jdk-oracle java $@
