package streamsExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/*(s1,s2)-->s1.compareTo(s2)===> Natural sorting order.
 * 
 * (s1,s2)-->s2.compareTo(s1)===> customized sorting order.
 * 
 * (s1,s2)---> -s1.compareTo(s2)===> customized sorting order.
 * 
 * 
 * 
 */
public class StreamDemo4 {

	public static void main(String[] args) {
		
		ArrayList names =new ArrayList();
		
		names.add("Sunny");
		names.add("Kajal");
		names.add("Prabhas");
		names.add("Anushka");
		names.add("Mallika");
		
		System.out.println(names);
		
		
		
		List<String> naturalsorted =(List<String>) names.stream().sorted().collect(Collectors.toList());
		
		
		System.out.println("natural sorting order"+naturalsorted);
		
		
		List<String> customizedorder = (List<String>)names.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		
		System.out.println("Customized order"+customizedorder);
		
		//sorted((i1,i2)->i2.compareTo(i1))
	}

}
