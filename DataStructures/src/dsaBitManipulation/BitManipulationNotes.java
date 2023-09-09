package dsaBitManipulation;

public class BitManipulationNotes {
	
	
	/* Date:5-04-2023
	 * 
	 * bit manipulations
~~~~~~~~~~~~~~~~~

01. introduction to number systems
02. types of number systems
03. decimal to binary conversion
04. binary to decimal conversion
05. bitwise operators
06. even or odd number application
07. swaping of two numbers
08. bitlevel operations (get, set, clear and update)
09. clearing of last i bits
10. cleaning of range of bits (from i to j)
11. number is power of 2 or not
12. count set bits application
13. fast exponetiation calculation
14. increment a value by one unit
15. conversion from lower case to upper case
16. conversion from upper case to lower case


introduction to number systems
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
a digital system can understand the digits by using the following components.

1) The digit
2) The position of the digit
3) The base of number system

types of number systems
~~~~~~~~~~~~~~~~~~~~~~~
The purpose of number systems are used to represent the number in digital system.

1) binary number system
2) decimal number system
3) octal number system
4) hexadecimal number system

binary number system:
---------------------
digits:		0 and 1
base:		2

decimal number system:
----------------------
digits:		0,1,2,3,4,5,6,7,8,9
base:		10

octal number system:
--------------------
digits:		0, 1, 2, 3, 4, 5, 6, 7
base: 		8

hexadecimal number system:
--------------------------
digits:		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f
base:		16

decimal number 		binary number 		octal number 		hexadecimal number
------------------------------------------------------------------------------
0 					0000 				0 					0
1 					0001 				1 					1
2 					0010 				2 					2
3 					0011				3 					3
4 					0100				4 					4
5 					0101				5 					5
6 					0110 				6 					6
7 					0111 				7 					7
8 					1000 				10 					8
9 					1001 				11 					9
10 					1010 				12 					a
11 					1011 				13 					b
and so on...

decimal to binary conversion
-----------------------------
Method1:
--------
1) divide the given decimal number by 2, where it gives result along with remainder.
2) we have to store thse remainders in a container.(array)
3) we have to print the list values which are stored in reverse order.

Ex:
---
		13

		13/2 -----> 6 -----> 1
		6/2 ------> 3 -----> 0
		3/2 ------> 1 -----> 1
		1/2 ------> 0 -----> 1

ans: 1101

Method2:
--------
Find the binary equalent for the given number by using 8-4-2-1 code.

Ex:
			  8-4-2-1
	15 -----> 1111
	13 -----> 1101
	10 -----> 1010

2^n....2^3 2^2 2^1 2^0


binary to decimal conversion
----------------------------
Method1:
--------
1) read the digits or symbols one by one from right to left.
2) multiply each bit with 2 power x where x = 0,1,2,3,4......
3) sum of these expression is the decimal number

Ex:
	1010

	0x2^0 = 0
	1x2^1 = 2
	0x2^2 = 0
	1x2^3 = 8
	----------
			10
	-----------

Method2:
--------
by using 8-4-2-1

Ex:
	1010 ----> 8+2= 10
	1011 ----> 8+2+1 = 11

bitwise operators
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

bitwise right shift >>
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

even or odd number application
------------------------------
0 		0000
1 		0001
2 		0010
3       0011
4 		0100
5 		0101
6 		0110
7       0111

import java.util.*;
class Test 
{
	public static String evenOrOdd(int n){
		int bitMask = 1;
		if((n&bitMask)==0)
			return "even";
		else
			return "odd";
	}
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
			System.out.println(i+"\t"+evenOrOdd(i));		
	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
0       even
1       odd
2       even
3       odd
4       even
5       odd
6       even
7       odd
8       even
9       odd
10      even

swaping of two numbers
----------------------
a=a^b
b=a^b
a=a^b

bitlevel operations (get, set, clear and update)
------------------------------------------------
getting ith bit from a binary number
setting ith bit in a binary number
clear i th bit in a binary number
update ith bit in a binary number

getting ith bit from a binary number
------------------------------------
Ex:
	10 -----> 1010

	0th location -----> 0
	1st location -----> 1
	2nd location -----> 0
	3rd location -----> 1


bitmask ------> 1<<i
formula ------> if n & bm ==0 then 0 else 1

import java.util.*;
class Test 
{
	static int getIthBit(int n,int i){
		int bm = 1<<i;
		return ((bm&n)==0)?0:1;
	}
	public static void main(String[] args) 
	{
		System.out.println(getIthBit(10,0));//0
		System.out.println(getIthBit(10,1));//1
		System.out.println(getIthBit(10,2));//0
		System.out.println(getIthBit(10,3));//1		
	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
0
1
0
1

setting ith bit in a binary number
----------------------------------
if 0 is there set to 1
if 1 is there set to 0

Ex:
			  16-8-4-2-1
	19 ------> 10011

	set 0th bit -----> 10010 -> 18
	set 1st bit -----> 10001 -> 17
	set 2nd bit -----> 10111 -> 23
	set 3rd bit -----> 11011 -> 27
	set 4th bit -----> 00011 -> 3

bitmask -------> 1<<i
formula -------> bm ^ n

import java.util.*;
class Test 
{
	static int getIthBit(int n,int i){
		int bm = 1<<i;
		return ((bm&n)==0)?0:1;
	}
	static int setIthBit(int n,int i){
		int bm = 1<<i;
		return (bm^n);
	}
	public static void main(String[] args) 
	{
		System.out.println(setIthBit(19,0));//18
		System.out.println(setIthBit(19,1));//17
		System.out.println(setIthBit(19,2));//23
		System.out.println(setIthBit(19,3));//27
		System.out.println(setIthBit(19,4));//13	
	}
}

clear i th bit in a binary number
---------------------------------
Ex:
	19 ----> 10011

	clear 0th bit -----> 10010 ---> 18
	clear 1st bit -----> 10001 ---> 17
	clear 2nd bit -----> 10011 ---> 19
	clear 3rd bit -----> 10011 ---> 19
	clear 4th bit -----> 00011 ---> 3

bitmask ------> ~(1<<i)
formula ------> n & bm

import java.util.*;
class Test 
{
	static int getIthBit(int n,int i){
		int bm = 1<<i;
		return ((bm&n)==0)?0:1;
	}
	static int setIthBit(int n,int i){
		int bm = 1<<i;
		return (bm^n);
	}
	static int clearIthBit(int n,int i){
		int bm = ~(1<<i);
		return (bm & n);
	}
	public static void main(String[] args) 
	{
		System.out.println(clearIthBit(19,0));//18
		System.out.println(clearIthBit(19,1));//17
		System.out.println(clearIthBit(19,2));//19
		System.out.println(clearIthBit(19,3));//19
		System.out.println(clearIthBit(19,4));//3	
	}
}


C:\9pm>javac Test.java

C:\9pm>java Test
18
17
19
19
3

update ith bit in a binary number
---------------------------------
Ex: 19 -----> 10011

update 0th bit 0 -----> 10010 ----> 18
update 0th bit 1 -----> 10011 ----> 19

update 1st bit 0 -----> 10001 ----> 17
update 1st bit 1 -----> 10011 ----> 19

update 2nd bit 0 -----> 10011 ----> 19
update 2nd bit 1 -----> 10111 ----> 21

if newbit == 0 then call clearithbit(n,i) else setithbit(n,i)

import java.util.*;
class Test 
{
	static int getIthBit(int n,int i){
		int bm = 1<<i;
		return ((bm&n)==0)?0:1;
	}
	static int setIthBit(int n,int i){
		int bm = 1<<i;
		return (bm^n);
	}
	static int clearIthBit(int n,int i){
		int bm = ~(1<<i);
		return (bm & n);
	}
	static int updateIthBit(int n,int i,int nb){
		if(nb==0)
			return clearIthBit(n,i);
		else
			return n;
	}
	public static void main(String[] args) 
	{
		//19 ---> 10011
		System.out.println(updateIthBit(19,0,0));//10010 --> 18
		System.out.println(updateIthBit(19,0,1));//10011 --> 19
		System.out.println(updateIthBit(19,1,0));//10001 --> 17
		System.out.println(updateIthBit(19,1,1));//10011 --> 19
		System.out.println(updateIthBit(19,2,0));//10011 --> 19
		System.out.println(updateIthBit(19,2,1));//10111 --> 23
	}
}

clearing of last i bits
------------------------
Ex:
	19 -----> 10011

	clear 1 ----> 10010 --> 18
	clear 2 ----> 10000 --> 16
	clear 3 ----> 10000 --> 16
	clear 4 ----> 10000 --> 16
	clear 5 ----> 00000 --> 0



bitmask : (-1)<<i
formula: n & bm

import java.util.*;
class Test 
{
	static int getIthBit(int n,int i){
		int bm = 1<<i;
		return ((bm&n)==0)?0:1;
	}
	static int setIthBit(int n,int i){
		int bm = 1<<i;
		return (bm^n);
	}
	static int clearIthBit(int n,int i){
		int bm = ~(1<<i);
		return (bm & n);
	}
	static int updateIthBit(int n,int i,int nb){
		if(nb==0)
			return clearIthBit(n,i);
		else
			return n;
	}
	static int clearLastIBits(int n,int i){
		int bm = (-1)<<i;
		return n & bm;
	}
	public static void main(String[] args) 
	{
		//19 ---> 10011
		System.out.println(clearLastIBits(19,1));//10010 --> 18
		System.out.println(clearLastIBits(19,2));//10000 --> 16
		System.out.println(clearLastIBits(19,3));//10000 --> 16
		System.out.println(clearLastIBits(19,4));//10000 --> 16
		System.out.println(clearLastIBits(19,5));//00000 --> 0

	}
}

C:\9pm>javac Test.java

C:\9pm>java Test
18
16
16
16
0



10. clearing of range of bits (from i to j)
11. number is power of 2 or not
12. count set bits application
13. fast exponetiation calculation
14. increment a value by one unit
15. conversion from lower case to upper case
16. conversion from upper case to lower case
	 * 
	 
	 
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
