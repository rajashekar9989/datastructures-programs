package dsaBitManipulation;

public class EvenOddApplicationByBitOperands {
	
	
	/*
	 *06. even or odd number application
	 *
	 *
	 *even or odd number application
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
	 *
	 *
	 *
	 *
	 *
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
	 * 
	 * 
	 * 
	 */

	
	
		
		
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


