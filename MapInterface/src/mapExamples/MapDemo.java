package mapExamples;

import java.util.HashMap;

/*                                      map                                                         Dictionary
     * 
     * 
     * HashMap					weakedHashMap                        IdentityHashMap             Hashtable
     * 
     * 
     *  -																							----
     *  																						Properties
     *  -
     *  LimkedHashMap
     * 
     * 
     */


public class MapDemo {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put(1, "Rajashekar");
		
		m.put(2, "Ravi");
		
		m.put(3, "Ramesh");
		
		System.out.println(m);

	}

}
