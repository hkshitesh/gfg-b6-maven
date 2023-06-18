FROM openjdk:11
ADD target/gfg-sample.jar	gfg-sample.jar
ENTRYPOINT ["java","-jar","/gfg-sample.jar"]