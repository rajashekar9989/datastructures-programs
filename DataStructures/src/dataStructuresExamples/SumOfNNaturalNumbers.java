package dataStructuresExamples;


/*Implement a program to find sum of 'n' natural numbers
 * 
 * exmaple: 4---> 0+1+2+3+4=10;
 *           6-->0+1+2+3+4+5+6=21;
 *           2--->0+1+2=3;
 *           
 *Algorithm;
 *
 *1.read n value from the user.
 *
 *2.apply business logic.
 *
 *3.print the result.
 * 
 * Logics :
 * 
 * 1. by using loops.
 * 2. by using recursion.
 * 
 * 3.by using math formula.
 *  formula:  n*(n+1)/2
 * 
 * 
 */

class N{
	
	
	// logic 1 by using for loop
	
	static int sum1(int n) {
		
	int i, sum=0;	
		for(i=0;i<=n;i++)
			
			sum = sum+i;
		
		return sum;
	}
	
	// logic 2 by using recursion
	
	static int sum2(int n) {
		
		
		if(n==0)
			return 0;
		
		else 
			
			return n+sum2(n-1);
	}
	
	// logic 3 by using mathematical formula
	
	static int sum3 (int n) {
		
		return n*(n+1)/2;
		
	}
}

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
	
		
		for(int i=0;i<=10;i++) {
		System.out.println(i+"\t"+N.sum1(i)+"\t"+N.sum2(i)+"\t"+N.sum3(i));

	}
	}
}
