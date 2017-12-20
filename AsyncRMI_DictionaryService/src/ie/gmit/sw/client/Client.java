package ie.gmit.sw.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import ie.gmit.sw.server.DictionaryService;

/*
 * Request for remote object
 */

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		//Ask the registry running on localhost and listening in port 1099 for the instance of
		//the FileService object that is bound to the RMI registry with the name fileService.
		DictionaryService ds = (DictionaryService) Naming.lookup("rmi://127.0.0.1:1099/dictionaryService");
		
		try {
			
			
		} catch (Exception e) {
			System.err.println("Client error: " + e.toString());
			e.printStackTrace();
		}
		
	}

}