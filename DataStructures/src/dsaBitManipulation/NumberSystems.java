package dsaBitManipulation;

import java.util.Scanner;

public class NumberSystems {
	
	
	/*
	 * bit manipulations
~~~~~~~~~~~~~~~~~

01. introduction to number systems
02. types of number systems
03. decimal to binary conversion
04. binary to decimal conversion



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

*/

	public static void main(String[] args) {
		
		
		

	}

}
