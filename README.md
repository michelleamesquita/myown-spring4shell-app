# Example of a spring4shell vulnerable Tomcat application

![spring4shellapplication](spring4shellapplication.png)

You can build docker image, but you can also modify this project to create your own vulnerable application.
To do that, don't forget to use this version of Java Spring 2.6.3
Also, you need some commands to create your own build:

``` 
mvn clean package
```

To run the application in your local machine, whithout Docker, don't forget to use:
```
mvn spring-boot:run
```

After that, you need to add spring-form.war to you root folder and add in Dockerfile

To build your own image:

```
docker build -t vulnerable-tomcat .
```

To run you application:

```
docker run -it --rm -p 8888:8080 vulnerable-tomcat
```

To check the vulnerability, just run:

````
http://127.0.0.1:8888/tomcatwar.jsp?pwd=j&cmd=pwd
