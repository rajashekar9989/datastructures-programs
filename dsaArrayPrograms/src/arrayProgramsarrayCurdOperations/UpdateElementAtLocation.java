package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class UpdateElementAtLocation {
	
	
	public static void updateAtLoaction(int a[], int location,int element) {
		
		
		a[location] =element;
		
		
	}

	public static void main(String[] args) {
		
		
		int [] a = {11,22,33,44,55,66};
		
		System.out.println(Arrays.toString(a));//11,22,33,44,55,66
		
		updateAtLoaction(a,3,99);
		
		System.out.println(Arrays.toString(a));//11,22,33,99,55,66
		

	}

}
