package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class InsertingElementsInAtFirst {
	
	/* case  1 : Inserting elements into an array  at first location
	 * 
	 * case  2 : Inserting elements into an array  at last location
	 * 
	 * case  3 : Inserting elements into an array  at specified location
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	
	// Insert elements at First position
	static int[] insertAtFirst(int a[], int element) {
		
		int i, b[] = new int [a.length+1];
		
		b[0]=element;
		
		for(i=0;i<a.length;i++)
			
			b[i+1]=a[i];
		
		return b;
		
		
	}
	
	

		
		
		
	public static void main(String[] args) {
		
		
		int [] a = {111,222,333,444};
		
		System.out.println(Arrays.toString(a));
		
		
		a=insertAtFirst(a,999);
		
		System.out.println(Arrays.toString(a));

	}

}
