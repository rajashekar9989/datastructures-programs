package arraysPredefinedClasses;

import java.util.Arrays;
import java.util.List;

public class AsList {
	
	/* Arrays.asList() method : it returns a fixed size list for the given array elements.
	 * 
	 * List asList(array or elements)
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		
		String  [] s= {"chiranjeevi","nagarjuna","BalaKrishna"};
		
		
		//System.out.println(Arrays.asList(s));
		
		List l1 = Arrays.asList(s);
		
		List l2 = Arrays.asList(10,20,30);
		
		System.out.println(Arrays.asList(l1));
		
		System.out.println(Arrays.asList(l2));
		

	}

}
