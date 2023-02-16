package dataStructuresExamples;

public class SwapTwoNumbers {

	/*
	 * swaping is the concept of interchanging values between the variables.
	 * 
	 * Ex: a = 111 b = 222 print a and b ----> 111 and 222 swaping logic print a and
	 * b ----> 222 and 111
	 * 
	 * total 5 logics are there to implement this algorithm
	 * 
	 * logic1: by using temp variable logic2: by using addition and subtraction
	 * logic3: by using multiplication and division logic4: by using bitwise
	 * operators logic5: by using single line statement
	 */

	public static void main(String[] args) {

		// logic 1 :by using temp variable

//		      int a,b,t;
//				a = 3;
//				b = 4;
//				System.out.println("before swaping a: "+a+" and b: "+b);
//				t = a;
//				a = b;
//				b = t;
//				System.out.println("after swaping a: "+a+" and b: "+b);
//			}

		/*
		 * by using addition and subtraction ------------------------------------ a =
		 * a+b b = a-b a = a-b
		 */

//				int a,b;
//				a = 10;
//				b = 20;
//				System.out.println("before swaping a: "+a+" and b: "+b);
//				a = a+b;
//		        b = a-b;
//		        a = a-b;
//				System.out.println("after swaping a: "+a+" and b: "+b);
//			}
//		}

		/*
		 * by using multiplication and division ------------------------------------ a =
		 * a*b b = a/b a = a/b
		 */

//			int a,b;
//			a = 5;
//			b = 6;
//			System.out.println("before swaping a: "+a+" and b: "+b);
//			a = a*b;
//			b = a/b;
//			a = a/b;
//			System.out.println("after swaping a: "+a+" and b: "+b);
//		}
//	}

//by using bitwise operator

//int a,b;
//a = 50;
//b = 60;
//System.out.println("before swaping a: "+a+" and b: "+b);
//a = a^b;
//b = a^b;
//a = a^b;
//System.out.println("after swaping a: "+a+" and b: "+b);
//}
//}

// by using single line 

		int a, b;
		a = 30;
		b = 40;
		System.out.println("before swaping a: " + a + " and b: " + b);
		a = a + b - (b = a);
		System.out.println("after swaping a: " + a + " and b: " + b);
	}
}
