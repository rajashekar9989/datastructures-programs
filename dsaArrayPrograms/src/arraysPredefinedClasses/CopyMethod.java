package arraysPredefinedClasses;

import java.util.Arrays;

public class CopyMethod {
	
	/* Arrays.copy() : this method is copies the specified array, with new elements as 0 and length as given size.
	 * 
	 * int [] copyOf(int[],int new length);
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int []a = {11,22,33};
		
		System.out.println(Arrays.toString(a));
		
		int b[] =Arrays.copyOf(a, 5);//{11,22,33,0,0};
		
		System.out.println(Arrays.toString(b));
		
		b[3]=88;
		b[4]=99;
		
		System.out.println(Arrays.toString(b));
		
		
		

	}

}
