package arraysPredefinedClasses;

import java.util.Arrays;

public class CopyOfRange {
	
	/*Arrays.copyOfRange() : this method  copies specified  range of values from old array to new Array.
	 * 
	 * 
	 * int copyOfRange(int[],int from index,int to lndex);
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {11,22,33,44,55,66,77,88,99};
		
		
		
		int b[]=Arrays.copyOfRange(a, 3, 8);
		
		System.out.println(Arrays.toString(b));
		
		
		int c[]=Arrays.copyOfRange(a, 0, 12);
		
		System.out.println(Arrays.toString(c));

	}

}
