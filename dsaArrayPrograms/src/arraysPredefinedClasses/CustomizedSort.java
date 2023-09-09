package arraysPredefinedClasses;

import java.util.Arrays;

/* Arrays.sort() method : it is sort the given array from begin  index to end index-1;
 * 
 * it accepts three parameters  1.array  2.start index and 3.end index
 * 
 * 
 */

public class CustomizedSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,6,4,2,5};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a,2,4);// 2 is string position for sorting and 4 is ending position i.e 4-1=3
		
		System.out.println(Arrays.toString(a));//1,6,2,4,5
		
	}

}
