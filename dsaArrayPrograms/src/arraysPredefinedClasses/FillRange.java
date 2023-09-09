package arraysPredefinedClasses;

import java.util.Arrays;

public class FillRange {
	
	/*
	 * 
	 * this method assigns values to all elements with the given range of indexes.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 1,5,9);
		
		System.out.println(Arrays.toString(a));
		
		
		int b[]= {34,45,56,78,98,12,32};
		
		Arrays.fill(b, 0,3,9);//{9,9,9,78,98,12,32};// to index-1
		
		System.out.println(Arrays.toString(b));
		
		

	}

}
