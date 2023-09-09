package recursionPorgrams;


/*
 * Chapter: RECURSION AND ITS APPLICATIONS
---------------------------------------
introduction:
-------------
=> A recursion is a process of calling a method/function by itself.

Ex:
	fun()
	{
		---------------
		---------------
	}

=> code readability and reusability.

Ex:
	fun()
	{
		---------------
		---------------
	}

	fun();

Ex:
	fun()
	{
		---------------
		---------------
		fun();
	}

=> The function/method which is involved in this process is called as recursive function
=> this process is called as recursion
=> there are two types of recursions are existed.

1) finate recursion ----> stop at a particular instruction
2) infinate recursion --> keep on executing never stops

Ex:
---
import java.util.*;

class Demo{
	void m(){
		System.out.println("Good Evening");
		m();
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.m();
	}
}

Good Evening
Good Evening
Good Evening
Good Evening
Exception in thread "main" java.lang.StackOverflowError

finate recursion:
----------------
a method which is called by itself, and terminates at a finate number of steps is called as finate recursion. we can make this infinate recursion into finate recursion by using one special condition "BASE CONDITION".

base condition:
--------------
it is a special condition, we have to create inside recursive calls so that our recursion should terminate at a finate steps.

Ex:
---
import java.util.*;

class Demo{
	static int c;
	void m(){
		if(c>10)//base condition
			return;
		else{
			System.out.println("Good Evening");
			c++;
			m();
		}
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.m();
	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening
Good Evening

Why we need recursion?
----------------------
some times, if we have a problem, we need to divided that big problem into small small sub problems, and find the solutions for those sub problems, which intern caculate sol for that given problem.

Ex:
	Binary search
	quick sort
	merge sort
	factorial
	prime number
	trees **
	graphs **
	lists **
	etc

Properties of recursion:
------------------------
1) same operations with multiple inputs.
2) we will divide the entire problem into small problems.
3) base condition is very very important in the recursion, else it leads to infinate.

iterations vs recursion
-----------------------
recursion:
----------
=> terminates when base condition is true.
=> functional concept.
=> extra space required (stack space)
=> smaller code

iteration:
-----------
=> terminates when condition is false.
=> looping concept
=> extra space is not required
=> bigger code

Ex1: Print 'N' natural numbers from n to 1
------------------------------------------
import java.util.*;

class Demo{
	static void m(int n){
		if(n>=1)//base condition
		{
			System.out.print(n+" ");
			m(n-1);
		}
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Demo.m(5);
	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
5 4 3 2 1

Ex2: Print 'N' natural numbers from 1 to n
------------------------------------------
import java.util.*;

class Demo{
	static void m(int n){
		if(n>=1)//base condition
		{
			m(n-1);
			System.out.print(n+" ");
		}
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		Demo.m(5);
	}
}

C:\9pm>java Test
1 2 3 4 5


Ex3: sum of n natural numbers
-----------------------------
import java.util.*;

class Demo{
	static int sum(int n){
		if(n==0)
			return 0;
		else
			return n+sum(n-1);
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.sum(5));//15
	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
15


Ex4: factorial of the given number
----------------------------------
import java.util.*;

class Demo{
	static int fact(int n){
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.fact(5));//120
	}
}

Ex6: sum of digits present in the given number
----------------------------------------------
import java.util.*;

class Demo{
	static int sumofdigits(int n){
		if(n==0)
			return 0;
		else
			return n%10 + sumofdigits(n/10);
	}
}

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.sumofdigits(1234));//1+2+3+4=10
	}
}




 * 
 * 
 */

class Demo{
	void m(){
		System.out.println("Good Evening");
		m();
	}
}

public class RecursionDemo {
	
	 

		public static void main(String[] args) 
		{
			Demo obj = new Demo();
			obj.m();
		}
	


	}


