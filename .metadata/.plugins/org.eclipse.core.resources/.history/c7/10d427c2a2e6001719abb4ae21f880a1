package ie.gmit.sw.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DictServiceImpl extends UnicastRemoteObject implements DictionaryService {
	private static final long serialVersionUID = 1L; 
	private Dictionary dictionary;
	
	//======= Constructor =========================================
	protected DictServiceImpl() throws RemoteException {
		super();
		dictionary = new Dictionary();
		
	}//contructor end
	
	// ======= GET QUERY =========================================== 
	@Override
	public String lookup(String query) throws RemoteException {
		String result = null;
		
		//If dictionary contains the string then return the definition
		/*
		//if(dictionary.containsKey(s.toLowerCase())){
		
		return result;
		}
		*/
		return null;
	}//lookup end
	
} //class end
