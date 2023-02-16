package dataStructuresExamples;

import java.util.Scanner;

class F {
	
	// logic 1: by using loops
	
	 static int fact1(int n) {
		 
		int  f =1;
		 
		 for(int i=1;i<=n;i++) 
			 
			 f =f*i;
		 
		 return f;
		 
	}
	 
	 
	 // logic 2  by using Recursion
	 
	 
	 static int fact2(int n) {
		 
		 
		 if(n==0) 
			 
			 return 1;
		 
		 
		 else return n*fact2(n-1);
	 }
}


public class FindFactorial {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n =scan.nextInt();
		System.out.println(F.fact1(n));
		
		System.out.println(F.fact2(n));
		

	}

}
