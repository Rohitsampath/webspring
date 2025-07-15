FROM tomcat:9-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file into Tomcat webapps
COPY target/Spring_mvc1-1.0.war /usr/local/tomcat/webapps/ROOT.war


# Expose the port (Railway will assign the port dynamically, but Tomcat by default runs on 8080)
EXPOSE 8080

CMD ["catalina.sh", "run"]
