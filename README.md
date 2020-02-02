# Demo project for Spring Framework and Web services using Apache CXF

A demo project to show how to integrate Apache CXF to a Spring Framework application in order to publish web services
from WSDL files. Optimised for JBoss EAP 7.1.

## Technologies

- Apache CXF 3.1.12
- Apache CXF Code generation plugin (cxf-codegen-plugin) 3.1.12
- Spring Framework 4.3.19
- JBoss EAP 7.1

## JBoss configuration

In order tu run this app on JBoss EAP 7.1 you must install Spring Framework 4.3.19 as a module by following [this guide](https://access.redhat.com/solutions/168093)
or by copying the module file dedicated to JBoss in the folder <code>misc/jboss</code> and the JAR files mentioned in it
from your local Maven repository.

## Build and run

Use Maven 3.3 or superior to build the project by typing:

$ mvn clean install

Then deploy the WAR file cxf-spring-demo.war in your Web server and check the following [link](http://localhost:8080/services/) in your Web navigator:

You should see the list of available SOAP services.
