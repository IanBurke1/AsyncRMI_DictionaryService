# An Asynchronous RMI Dictionary Service
#### *Distributed Systems Module - Lecturer: [Patrick Mannion]() - 4th Year Software Development*
For my project in Distributed Systems, I am required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary lookup service. A JSP page should provide users with the ability to specify a string which will be checked against the dictionary. The HTML form information should be dispatched to a servlet that adds the client request to an in-queue and then returns a job ID to the web client. The web client should poll the web server periodically (every 10 seconds) and query if the request has been processed. Client requests in the inQueue should be periodically removed and processed (every 10 seconds). 
The processing of a client request will require a RMI method invocation to a remote object which implements an interface called DictionaryService. The remote object which implements DictionaryService should check if the string received exists in the dictionary, and return the dictionary definition of the string if it does exist in the dictionary, or “String not found” if it does not exist in the dictionary. Once the result of the dictionary lookup has been computed by the remote object, the returned response should be added to the outQueue on the Tomcat server and returned to the original web client when they next poll the server. 

## How to download project
- Click [here](https://github.com/ianburkeixiv/AsyncRMI_DictionaryService/archive/master.zip) to download the project zip.
- Unzip/extract the project to preferred directory.

**or**
- Open command prompt with git and enter:
```bash
git clone https://github.com/ianburkeixiv/AsyncRMI_DictionaryService.git
```

## How to Run
1. Open up the project in eclipse Jee.
2. Go to src/ie/gmit/sw/server and run the Server.java as java application.
3. Then right click on the project itself and run on server.

## Architecture
![](https://user-images.githubusercontent.com/22341150/34322891-9e8e3bc2-e82b-11e7-9887-cb5cdea72a0e.PNG)

### JSP
A JSP page is a text document that contains two types of text: static data, which can be expressed in any text-based format (such as HTML, SVG, WML, and XML). Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases.

### RMI (Remote Method Innovation)
The Java Remote Method Invocation (Java RMI) is a Java API that performs remote method invocation, the object-oriented equivalent of remote procedure calls (RPC), with support for direct transfer of serialized Java classes and distributed garbage-collection. The RMI allows an object to invoke methods on an object running in another JVM. The RMI provides remote communication between the applications using two objects stub and skeleton. 

### Apache Tomcat Server
Tomcat Server v7 is used in this project.

![](https://user-images.githubusercontent.com/22341150/34322893-b1083690-e82b-11e7-9d1b-051f74e38cd2.png)

Apache Tomcat is used to deploy your Java Servlets and JSPs. So in your Java project you can build your WAR (short for Web ARchive) file, and just drop it in the deploy directory in Tomcat. So basically Apache is an HTTP Server, serving HTTP. Tomcat is a Servlet and JSP Server serving Java technologies.


### Servlet
A Java servlet is a Java program that extends the capabilities of a server. Although servlets can respond to any types of requests, they most commonly implement applications hosted on Web servers.






