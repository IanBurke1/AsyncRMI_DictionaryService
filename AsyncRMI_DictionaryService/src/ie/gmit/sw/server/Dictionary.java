package ie.gmit.sw.server;

import java.io.BufferedReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Hashtable;

public class Dictionary {

	public static void main(String args[]) throws IOException, FileNotFoundException {
		
		BufferedReader bf = new BufferedReader(new FileReader(new File("Dictionary.txt")));
		
		String inputLine = null;
		Map dictionaryMap = new HashMap();
		
		while ((inputLine = bf.readLine()) != null) {

			// Here split the input line
			String[] words = inputLine.split("\\s+");
			
			// Ignore empty lines
			if (inputLine.equals(""))
				continue;
			
			for (String wordStr : words) {
				// Remove any commas and dots
				wordStr = wordStr.replace(".", "");
				wordStr = wordStr.replace(",", "");
				
				if (dictionaryMap.containsKey(wordStr)) {
					Integer val = (Integer)dictionaryMap.get(wordStr);
					dictionaryMap.put(wordStr, val + 1);
				} else
					dictionaryMap.put(wordStr, 1);
			}
		}
		// printing all words stored in the map
		for (Object key : dictionaryMap.keySet())
			System.out.println(key + ": " + dictionaryMap.get(key));
	}
}
