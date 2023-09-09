package arraysPredefinedClasses;

import java.util.Arrays;

public class RangeOfBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {1,3,4,6,7};
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 1,3,3));//1
		
		System.out.println(Arrays.binarySearch(a, 1,3,2));//-2
		
		System.out.println(Arrays.binarySearch(a, 1,3,4));//2
		
		System.out.println(Arrays.binarySearch(a, 1,3,6));//-4
		
	}

}
