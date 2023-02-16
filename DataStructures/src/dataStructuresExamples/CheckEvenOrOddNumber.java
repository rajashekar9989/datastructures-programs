package dataStructuresExamples;

// Implement a program to gievn number is even or odd

/*
 * Algorithm
 * 
 * 1.read n value from user
 * 2.apply business logic.
 * 
 * 3. print result
 * 
 */

public class CheckEvenOrOddNumber {
	
 static String evenOrOdd(int n) {
	 
	 return (n%2==0)?"even":"odd";
 }

	public static void main(String[] args) {
		
		// 3 ways to print out put
		
		CheckEvenOrOddNumber  eo = new CheckEvenOrOddNumber();
		
		System.out.println(eo.evenOrOdd(10));// even
		System.out.println(eo.evenOrOdd(11));// odd
		
		System.out.println(CheckEvenOrOddNumber.evenOrOdd(12));//even
		System.out.println(CheckEvenOrOddNumber.evenOrOdd(13));// odd
		
		System.out.println(evenOrOdd(14));//even
		
		System.out.println(evenOrOdd(15));// odd
		
		
		

		
		
		

	}

}
