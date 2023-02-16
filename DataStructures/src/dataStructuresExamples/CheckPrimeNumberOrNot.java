package dataStructuresExamples;

import java.util.Scanner;

// implement a program to check whether the given number is prime number or not

/*if it is prime number return true or if not return false.
 * 
 * Algorithm:
 * 
 * read n value from the user
 * 
 * apply the business logic
 *  print the result
 *  
 *  Logic 1: by using loops ;
 *  
 *  logic 2 : by using Recursion
 * 
 
 * 
 */

class P{
	
	// logic 1 by using loops
	static boolean isPrime1(int n) {
		int i,factors=0;
		for(i =1; i<=n;i++) {
			
			if(n%i ==0)
				
				factors++;
		}
		return factors ==2;
		
	}
	// logic 2 by using recursion
	static boolean isPrime2(int n, int i){
		
		if(i==1)
			return true;
		
		else if(n%i==0)
			
			return false;
		
		else
			return isPrime2(n,--i);
		
	}
}

public class CheckPrimeNumberOrNot {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter a number");
		
		//int n =scan.nextInt();
		
		for(int i =2;i<=20;i++) {
		System.out.println(i+"\t"+P.isPrime1(i)+"\t"+P.isPrime2(i, i/2));
			
			
		}
		
		

	}

}
