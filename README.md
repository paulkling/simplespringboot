# simplespringboot


### Run app
* gradlew bootRun
* ./gradlew bootRun

## Webrowser
* http://localhost:8080/
* http://localhost:8080/api


##Docker
docker build -t java .

##Run docker image
docker run -p 8080:8080 java

docker run --name javaspring -d -p 8080:8080 javaspring

##remove old
docker rm `docker ps --no-trunc -aq`
