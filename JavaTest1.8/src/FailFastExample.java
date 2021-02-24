import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

	public class FailFastExample { 
	    public static void main(String[] args) 
	    { 
	  
	        // Creating a ConcurrentHashMap 
	        Map<String, Integer> map 
	            = new Hashtable<String, Integer>(); 
	  
	        map.put("ONE", 1); 
	        map.put("TWO", 2); 
	        map.put("THREE", 3); 
	        map.put("FOUR", 4); 
	  
	        // Getting an Iterator from map 
	        java.util.Iterator<String> it = map.keySet().iterator(); 
	  
	        while (it.hasNext()) { 
	            String key = (String)it.next(); 
	            System.out.println(key + " : " + map.get(key)); 
	  
	            // This will reflect in iterator. 
	            // Hence, it has not created separate copy 
	            map.put("SEVEN", 7); 
	        } 
	    } 
	}