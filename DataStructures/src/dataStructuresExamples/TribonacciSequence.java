package dataStructuresExamples;

import java.util.ArrayList;
import java.util.Scanner;

// 10. implement a program to find tribanacci sequence.
/*
 * 
 *  Ex: 0,1,2,3,6,11,20,37, and so on....
 * 
 * Logic 
 * 
 * 1. create ArrayList object to hold all the generated values.
 * 2.apply logic
 * 3.print ArrayList object
 * 
 * a=0;
 * b=1;
 * c=2
 * add a value into arraylist
 * add b value into arraylist
 * add 2 value into arraylist
 * 
 * for(int i =1;i<=10;i++){
 *  d= a+b+c;
 *  
 *  add 'd' value into ArrayList
 *  
 *  a=b;
 *  b=c;
 *  c=d;
 * }
 */

 

class Tribanacci{
	
	
static ArrayList fibseq(int n) {
		
		int a,b,c,d;
		
	ArrayList list = new ArrayList();
			
	      a=0;
	      b=1;
	      c=2;
	   
	   list.add(a);
	   list.add(b);
	   list.add(c);
		for( int i=1;i<=n-3;i++) {
			
			d=a+b+c;
			
			list.add(d);
			a=b;
			b=c;
			c=d;
		}
			return list;
			
			
		
	}
}

public class TribonacciSequence {

	public static void main(String[] args) {
	 
Scanner scan = new Scanner(System.in);
		
		System.out.println("enete any number");
		
		int n =scan.nextInt();
		
		System.out.println(Tribanacci.fibseq(n));

	}

	}


