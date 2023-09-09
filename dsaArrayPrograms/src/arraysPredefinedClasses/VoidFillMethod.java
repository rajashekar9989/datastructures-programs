package arraysPredefinedClasses;

import java.util.Arrays;

public class VoidFillMethod {
	
	/* it fill the values to all elements in an array.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[3];
		
		int b[] = new int[4];
		
		int c[]= new int[6];
		
		Arrays.fill(a, 9);//9 9 9
		
		Arrays.fill(b, 1);// 1 1 1 1
		
		Arrays.fill(c, 4);// 4 4 4 4 4 4
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
		
		
		
	}

}
