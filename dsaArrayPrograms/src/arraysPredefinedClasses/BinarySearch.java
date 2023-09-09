package arraysPredefinedClasses;

import java.util.Arrays;

public class BinarySearch {

	/* BinarySerach :it is used to search an element in the given array
	 * 
	 * int binarySearch(int[],int key);
	 * 
	 * it returns index value if element is found 
	 * 
	 * returns -(insertion point)-1 if element is not found.
	 * 
	 * 
	 * Note: if we want to apply binary search operation, compulsory array must be sorted.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3,4,6};
// indexes        0,1,2,3
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 1));//0
		System.out.println(Arrays.binarySearch(a, 2));// -1-1=-2
		System.out.println(Arrays.binarySearch(a, 3));//1
		System.out.println(Arrays.binarySearch(a, 4));//2
		System.out.println(Arrays.binarySearch(a, 5));//-3-1=-4
		System.out.println(Arrays.binarySearch(a, 6));//3

	}

}
