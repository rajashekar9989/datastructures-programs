package arrayProgramsarrayCurdOperations;

import java.util.Arrays;
import java.util.Scanner;

public class RetrievingOfArrayElements {
	
/*  The following are the various methods to print array elements on the screen.
 * 
 * 1.index concept
 * 2.while loop
 * 3.for loop
 * 4.for each loop
 * 5.Arrays.toString();
 * 
 * 
 * 
 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[4];
		
		System.out.println("enter a  4 array elements");
		
		for(int i=0;i<a.length;i++)
			
			 a[i]=scan.nextInt();
		
			
			
		   
		
		//print array elements by using index 
		
		System.out.println("by using index ");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		
	//	 print array elements by using while loop
		
		System.out.println("by using while loop");
		
		int i=0;
		
		while(i<a.length)
			
			System.out.println(a[i++]);
		
		// by using for loop
		
		System.out.println("by using for loop");
		
		for(i =0;i<a.length;i++)
			
			System.out.println(a[i]);
		
		
		// by using for ecah loop
		
		System.out.println("by using for each loop");
		
		for(int x :a) {
			System.out.println(x);
		}
		
		// by suing Arrays.toString  method
		
		System.out.println("By using Arrays.toSting()");
		
		System.out.println(Arrays.toString(a));

	}

}
