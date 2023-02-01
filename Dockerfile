FROM openjdk
ADD ms_con_generatepdf-0.0.1-SNAPSHOT.jar ms_con_generatepdf-0.0.1-SNAPSHOT.jar
ADD img /usr/local/img
ADD reports /usr/local/reports
EXPOSE 8081
ENTRYPOINT ["java","-jar","/ms_con_generatepdf-0.0.1-SNAPSHOT.jar"]