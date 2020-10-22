FROM java:8
MAINTAINER jxk <1712203023@qq.com>
COPY myproject/UserService/target/*.jar /app.jar
CMD ["–server.port=8090"]
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]