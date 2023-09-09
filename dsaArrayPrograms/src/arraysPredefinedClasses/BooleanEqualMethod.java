package arraysPredefinedClasses;

import java.util.Arrays;

public class BooleanEqualMethod {
	
	/*it returns true if both arrays are having same content else false.
	 * 
	 * if both arrays length and elements order both  should be same.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,22,33};
		
		int  b[]= {11,22,33};
		
		int c[]= {11,22,33,44};
		
		int d[] = {22,11,33};
		
		System.out.println(Arrays.equals(a, b));// true
		
		System.out.println(Arrays.equals(a, c));//false
		
		System.out.println(Arrays.equals(a, d));//false
		
		

	}

}
