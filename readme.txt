


https://github.com/dstar55/docker-hello-world-spring-boot



Build Docker image
$ docker build -t="hello-world-java" .


Run Docker image
$ docker run -p 8080:8080 -it --rm hello-world-java
Test application
first you need to find ContainerId of the running Docker image

$ docker ps




