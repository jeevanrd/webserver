Java Web Server
===============

A simple multi-threaded HTTP 1.1 Server implemented in Java based on W3C specifications (http://www.w3.org/Protocols/) (https://github.com/jeevanrd/webserver).


COMPILING
=========
Install Java SDK, Maven, Git.

To compile run below command
    $ mvn clean package

This will create a "target" folder containing the application jar file: java-webserver-1.0-jar-with-dependencies.jar


RUNNING
=======
Start the Java Web Server using the following command:
    $ java -cp target/java-webserver-0.1-jar-with-dependencies.jar WebServer <PORT_NUMBER>

To stop the Simple Web server, just press Cntr+C on the command line. (The parameter PORT_NUMBER is optional, default port is 8080)
