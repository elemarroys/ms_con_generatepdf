FROM openjdk
ADD ms_con_generatepdf-0.0.1-SNAPSHOT.jar ms_con_generatepdf-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/ms_con_generatepdf-0.0.1-SNAPSHOT.jar"]