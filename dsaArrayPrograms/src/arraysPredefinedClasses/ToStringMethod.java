package arraysPredefinedClasses;

import java.util.Arrays;

public class ToStringMethod {
	/* toString()  : this method returns String representation of content of the specified array.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int a[] = {11,12,99,88 ,55};
		
		System.out.println(Arrays.toString(a));
		
		// another way using foe each loop
		
		for(int item :a) {
			
			System.out.println(item);
		}
		
		String s []= {"raj","ravi","shekar","swamy"};
		
		System.out.println(Arrays.toString(s));
		
		
		
	

	}

}
