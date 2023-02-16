package dataStructuresExamples;

import java.util.Scanner;

// implement a program to find max of three numbers

/*Example:
 * 1,2,3 ----->3;
 * 
 * 1,2,-3......2;
 * 
 * -1,-2,-3---->-1
 * 
 * 1,-2,-3----->1;
 * 
 * Algorithm:
 * 
 * 1.read three values from the user as a, b, c.
 * 
 * 2.apply business logic
 * 
 * logic1 : by using conditional operator
 * 
 * logic2 : by using else if 
 * 
 * logic2: by using predifined methods
 * 
 * then print result.
 * 
 * 
 * logic 1: by using conditional operator
 * (condition)?trueblock:falseblock
 * (a>b && a>c)?a:(b>c?b:c)
 * 
 * 
 * logic 2 : by using else if
 * 
 * if a>b and a>c then print a as big.
 * else if b>c then print b as big
 * 
 * else c as big.
 * 
 *  
 *  logic 3 : by using predefined methods
 *  
 *  Math.max(Math.max(first_arg, second_arg),third_arg)
 * 
 * 
 */

class Three{
	
	// logic 1
	static int Max_version1(int a , int b, int c) {
		
		return (a>b && a>c ?a :(b>c)?b:c);
	}
	// logic 2 
	
static int Max_version2(int a , int b, int c) {
		
	
	if(a>b && a>c)
		
		return a;
	
	else if (b>c)
		
		return b;
	
	else
		
		return c;
		
	}

    // logic 3 

static int Max_version3(int a , int b, int c) {
	
	 return Math.max(Math.max(a, b), c);
}
}
public class FindMaximumOfThreeNumbers {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		
		System.out.println("enete a value");
		
	int a=	obj.nextInt();
	System.out.println("enter b value");
	
	int b = obj.nextInt();
	
	System.out.println("enter c value");
	
	int c = obj.nextInt();
	
	System.out.println(Three.Max_version1(a, b, c));
	System.out.println(Three.Max_version2(a, b, c));
	System.out.println(Three.Max_version3(a, b, c));
	
	
				

	}

}
