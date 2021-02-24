import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;


class TreeSet1{  
 public static void main(String args[]){  
  //Creating and adding elements  
	Map<String,String> al=new HashMap<String,String>();  
  al.put("Ravi","gh");  
  al.put("Vijay","ah");  
  al.put("Ravi","bh");  
  al.put("Ajay","ch");  
  al.put(null,"ch");  
  //Traversing elements  
  for(Map.Entry m:al.entrySet()){    
      System.out.println(m.getKey()+" "+m.getValue());    
     }   
  
Vector<String> list= new Vector<String>();
  list.add("shakeel");
  list.add("shakeel");
  list.add(null);
  System.out.println("----------"+list);
 }  
}