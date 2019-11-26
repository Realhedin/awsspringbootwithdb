# start from base
FROM openjdk:latest

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 5000 available to the world outside this container
EXPOSE 5000

# The application's jar file
ARG JAR_FILE=target/bootwithdatabase-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} bootwithdatabase.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/bootwithdatabase.jar"]
