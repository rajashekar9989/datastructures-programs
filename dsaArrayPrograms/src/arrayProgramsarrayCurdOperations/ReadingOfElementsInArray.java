package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

/* CRUD operations on Arrays
 * 
 * 
 *1.Insert values into array
 *2.Read values From An array
 *3.update values in an Array
 *4.delete values from an aArray
 *
 *
 *selecting / Reading elements from an array
 *
 * case 1: by using index concept
 * case 2: by using while loop
 * 
 * case 3 : by using for loop
 * 
 * case 4 : by using for each loop
 * 
 * case 5 : by using tostring() methods. 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ReadingOfElementsInArray {

	public static void main(String[] args) {
	
		
		int[] a = {10,11,12,13,14,15,16};
		
		// by using index 
		
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
//		System.out.println(a[5]);
//		System.out.println(a[6]);
		
		
		// by using while loop
		int index =0;
		
//		while(index<a.length)
//			
//			System.out.println(a[index++]);
		
		// by using for loop
		
		
//		for( index =0;index<a.length;index++) 
//			
//			System.out.println(a[index]);
		
		// by using for each loop
		
		
//		for(int item : a) {
//			
//			System.out.println(item+" ");
//		}
		
		
		// by using to string() method.
		
		System.out.println(Arrays.toString(a));
		

	}

}
