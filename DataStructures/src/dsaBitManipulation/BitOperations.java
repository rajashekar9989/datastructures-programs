package dsaBitManipulation;

public class BitOperations {
	
	/*
	 * 
	 * 05. bitwise operators

	 * bitwise operators
~~~~~~~~~~~~~~~~~
The operators which works with binary numbers are called as bitwise operators. the following are the various bitwise operators supported by java.

1) bitwise and &
2) bitwise or |
3) bitwise x-or ^
4) bitwise left shift <<
5) bitwise right shift >>
6) bitwise complement ~

bitwise and &
-------------
it returns 1 if both bits are 1 else 0

1 & 1 = 1
1 & 0 = 0
0 & 1 = 0
0 & 0 = 0

Ex:
---
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 5;//0101
		int b = 9;//1001
		System.out.println(a&b);//0001=>1
	}
}

bitwise or |
------------
return 1 if any one bit is 1 else 0

1 | 1 = 1
1 | 0 = 1
0 | 1 = 1
0 | 0 = 0

Ex:
---
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 5;//0101
		int b = 9;//1001
		System.out.println(a|b);//1101=>13
	}
}

bitwise x-or (^)
----------------
returns 1 if both bits are in different directions else 0

1 ^ 0 = 1
0 ^ 1 = 1
1 ^ 1 = 0
0 ^ 0 = 0

Ex:
---
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 5;//0101
		int b = 9;//1001
		System.out.println(a^b);//1100-->12
	}
}

bitwise left shift <<
---------------------
it shifts the bits towards left direction or n*n

a<<b ----> a*2^b

import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a<<1);//5*2 = 10
		System.out.println(a<<2);//5*4 = 20
		System.out.println(a<<3);//5*8 = 40
	}
}
	 * 
	 * bitwise right shift >>
---------------------
it shifts the bits towards right direction 

a>>b ----> a/2^b

import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a>>1);//5/2 = 2
		System.out.println(a>>2);//5/4 = 1
		System.out.println(a>>3);//5/8 = 0
	}
}

bitwise complement (~)
----------------------
it is represented as ~, i.e. all the bits are inverted. every 0 is converted into 1 and every 1 is converted into 0.

formula: ~n = -(n+1)

Ex:
---
import java.util.*;
class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(~5);//-(5+1)=-6
		System.out.println(~-5);//-(-5+1) = -(-4) = 4
	}
}

advantages :
------------
1) speed
2) space optimization
3) bit manipulations 
4) code simplication
5) readability and performance will be improved
6) encryptions etc

1010101010 -------> 1010101110 -------> 1010101010




	 * 
	 * 
	 */
	 
	 
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
