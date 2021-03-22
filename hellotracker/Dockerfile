FROM centos
# FROM you specify a base image (background environment) 
# create an environment that has centos in it

COPY . /workspace
# copy everything in the current directory of this docker file  .
# put it in the virtual environment under the root directory /workspace
# on you pc the root directory C: in this environment we are creating it /workspace

WORKDIR /workspace
# when you write commands what directory they will execute in

RUN yum install -y maven
#Any commands you need to run while building the image

WORKDIR /workspace/build/libs

EXPOSE 8080
# this allows the container to be accessed on that port
# this should be the port your application runs on

ENTRYPOINT ["java", "-jar", "hellotracker-0.0.1-SNAPSHOT.jar"]
#The command that will execute when you create an instance of this image
#Usually this would be the command to start the application

