FROM openjdk:8
ADD target/gfg-smaple.jar gfg-smaple.jar
ENTRYPOINT ["java","-jar","/gfg-smaple.jar"]