package ie.gmit.sw.server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class DictServiceImpl extends UnicastRemoteObject implements DictionaryService {
	// enable compatibility when transferring files.
	private static final long serialVersionUID = 1L; 
	//Creating dictionary object
	Dictionary dictionaryMap;
	// initialising hashmap
	HashMap<String, String> map;
	
	//======= Constructor =========================================
	protected DictServiceImpl() throws Exception {
		super();
		//Passing in new dictionary object
		dictionaryMap = new Dictionary();
		//passing in loadDictionary method to parse in the dictionary
		dictionaryMap.loadDictionary();
		//passing in the dictionary hashmap and setting it to map to use later on..
		map = dictionaryMap.dictHashMap();
		
		
	}//contructor end
	
//========= Remote methods implementation ========================================================================================
	@Override
	public String lookup(String query) {		
		
		// If hashmap contains the key "word" (users query) then..
		if(map.containsKey(query)){
			
			//return the definition
			return map.get(query);
			
			//System.out.println(query + " : " + dictionary.get(query));
		}else {
			//if dictionary has not the query then return message
			return query + " not found";
		}
		
	}//lookup end
	
	// couldnt get delete and edit working in time.
	
	@Override
	public String delete(String word) throws RemoteException {
		
		map.remove(word);
		
		return word + " removed from dictionary.";
	}

	@Override
	public String edit(String word, String newWord) throws RemoteException {
		
		String def = map.get(word);
		map.remove(word);
		map.put(newWord, def);
		return newWord;
	}
	
	
	
} //class end
