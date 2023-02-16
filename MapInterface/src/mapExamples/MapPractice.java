package mapExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPractice {

	public static void main(String[] args) {
		
		// creation of map
		
		Map<Integer,String> m = new Hashtable();
//		Map<Integer,String> m = new HashMap();
//		Map<Integer,String> m = new LinkedHashMap();
//		Map<Integer,String> m = new TreeMap();
		
	     //Addition of elements into map
		
		m.put(502278, "Gajwel");
		m.put(502279,"Wargal");
		m.put(500072, "Kukatpally");
		m.put(500085, "Kphb");
		
		//Retrieval of keys from the map
		
		  Set<Integer> keys=m.keySet();
		  
		 for(Integer key :keys) {
			 
			 System.out.println(key);
		 }
		 
		 System.out.println();
		 
		 
		 //Retrieval of values from the map
		 
		   Collection<String> values =m.values();
		   
		   for(String value : values) {
			   
			   System.out.println(value);
		   }
		   
		   System.out.println();
		
		 
		   //Retrieval of value from the map  based on the key
		   
		   System.out.println(m.get(502278));
		   
		   
		   for(Integer key : keys) {
			   
			   System.out.println(key+">>>>>>"+m.get(key));
		   }
        
		   System.out.println(m);
		   
		   
		   //Deletion of elements from the map
		   
		   m.remove(502278);
		   
		  // m.remove(502278, "Gajwel");
		   
		   System.out.println(m);
		   
		   //verification key and values from the map
		   
		   System.out.println(m.containsKey(502279));
		   System.out.println(m.containsKey(503672));
		   
		   System.out.println(m.containsValue("Kukatpally"));
		   System.out.println(m.containsValue("Chennai"));
		   
		   
		   // updation  of elements in the map
		   
		   System.out.println(m);
		   m.put(500085,"JNTUH");
		   
		   System.out.println(m);
		   
		   m.putIfAbsent(502279, "Mulugu");
		   
		   System.out.println(m);
		   
		   m.replace(500085, "HitechCity");
		   
		   System.out.println(m);
		   
		   
		   // to check the elements of the map
		   
		   System.out.println(m.size());
		   
		   
		   // delete the all elements in the map
		   
		   System.out.println(m);
		   //m.clear();
		   System.out.println(m);
		   
		   
		   //iteration of map
		   
		   Set<java.util.Map.Entry<Integer, String>> entries =m.entrySet();
		   
		   for (java.util.Map.Entry<Integer, String> entry :entries ) {
			   
			   Integer key =entry.getKey();
			   
			   String value =entry.getValue();
			   
			   System.out.println(key+">>>"+ value);
			   
			   
			   
			   
		   }
	}

}
