package dataStructuresExamples;

import java.util.Scanner;

class T{
	
	 static int add(int a, int b) {
		 
		 return a+b;
	 }
	
	
	
}

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		int a =scan.nextInt();
		
		System.out.println("enter b value");
		
		int b = scan.nextInt();
		
      System.out.println("the Addition of two numbers is :" +T.add(a,b));
	}

}
