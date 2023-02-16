package dataStructuresExamples;

import java.util.Scanner;

//implement a program to find max/min of two numbers.

/*Example :
 * 2,3----> 3
 * 
 * 6,10--> 10;
 * 
 * Algorithm:
 *  1.read the value from the user
 *  apply business logic
 *  print Result
 *  
 *  
 *  logic 1: by using Ternary operator
 *   ex: (condition)?true:false
 *   
 *   logic2 : using java predfined methods
 *   
 *   lang package default package  ex:Math.max(); and Math.min();
 *  
 *  
 * 
 * 
 */

class Max{
	
	
	// logic 1 : by using ternary operator find max number
	
	static int max1(int a , int b) {
		
		
		return (a>b)?a:b;
	}
	
	// find min number
    static int min1(int a , int b) {
		
		
		return (a>b)?b:a;
	}
	
	
	
	// logic 2 : by using predefined method to find max number
	static int mathMax(int a,int b) {
		return Math.max(a, b);
		
	}
	
	
	  // find min number
	static int mathMin(int a, int b) {
		
		return Math.min(a, b);
	}
}
 
public class FindMinMaxNumbers {
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
				System.out.println("enter a first value");
				
			int a =	scan.nextInt();
			
			System.out.println("enter a second value");
			
			int b = scan.nextInt();
			
			
			System.out.println(Max.mathMax(a, b));
			//System.out.println(Max.mathMin(a, b));
			
			//System.out.println(Max.Min1(a, b));
			
			System.out.println(Max.max1(a, b));

	}

}
