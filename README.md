# An Asynchronous RMI Dictionary Service
#### *Distributed Systems Module - Lecturer: [Patrick Mannion]() - 4th Year Software Development*
For my project in Distributed Systems, I am required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary lookup service. A JSP page should provide users with the ability to specify a string which will be checked against the dictionary. The HTML form information should be dispatched to a servlet that adds the client request to an in-queue and then returns a job ID to the web client. The web client should poll the web server periodically (every 10 seconds) and query if the request has been processed. Client requests in the inQueue should be periodically removed and processed (every 10 seconds). 

## Overview
I have the word definition look up working with the servlet calling the remote dictionary service to get the definition of the word the user enters. I have failed to get a blocking queue working, where the request from servlet goes into a queue and same with the response. I tried to add the delete and edit features but ran out of time.

## Github Repo
https://github.com/ianburkeixiv/AsyncRMI_DictionaryService

## How to Run
1. Open up the project in eclipse.
2. Go to src/ie/gmit/sw/server and run the Server.java as java application.
3. Then right click on the project itself and run on server.

## Architecture

### JSP
![]()

Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases.

### RMI (Remote Method Innovation)

### Apache Tomcat Server
Tomcat Server v7 is used in this project.


### Servlet




