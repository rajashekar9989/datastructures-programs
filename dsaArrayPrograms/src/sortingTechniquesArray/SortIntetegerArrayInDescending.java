package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Collections;

public class SortIntetegerArrayInDescending {

	public static void main(String[] args) {
	
		
		Integer a[]= {10,40,50,30,20,90,80,70};
		
		System.out.println(Arrays.toString(a));
		
		
		Arrays.sort(a,Collections.reverseOrder());
		
		  System.out.println("After sorting decending order");
		System.out.println(Arrays.toString(a));

	}

}
