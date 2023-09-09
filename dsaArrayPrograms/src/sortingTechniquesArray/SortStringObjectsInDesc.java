package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Collections;

public class SortStringObjectsInDesc {

	
public static void main(String[] args) {
	
		
		String a[]= {"ccc","zzz","www","bbb","yyy"};
		
		System.out.println(Arrays.toString(a));
		
		
		Arrays.sort(a,Collections.reverseOrder());
		
		  System.out.println("After sorting Descending  order");
		System.out.println(Arrays.toString(a));

	}

}


