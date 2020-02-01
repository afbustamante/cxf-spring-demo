# Demo project for Spring Framework and Web services using Apache CXF

A demo project to show how to integrate Apache CXF to a Spring Framework application in order to publish web services
from WSDL files. Optimised for JBoss EAP 7.0 and Apache Tomcat 8.5

## Technologies

- Apache CXF 3.1.4
- Apache CXF Code generation plugin (cxf-codegen-plugin) 3.1.4
- Spring Framework 4.2.5

## Build and run

Use Maven 3.3 or superior to build the project by typing:

$ mvn clean install

Then deploy the WAR file cxf-spring-demo.war in your Web server and check the following [link](http://localhost:8080/services/) in your Web navigator:

You should see the list of available SOAP services.
