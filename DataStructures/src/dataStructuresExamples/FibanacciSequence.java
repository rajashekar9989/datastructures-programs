package dataStructuresExamples;

import java.util.ArrayList;
import java.util.Scanner;

//9. Implement a program to generate fibanacci sequence

/*
 * 
 * Ex: 0,1,1,2,3,5,8,13,21,34 and so on....
 * 
 * Logic 
 * 
 * 1. create ArrayList object to hold all the generated values.
 * 2.apply logic
 * 3.print ArrayList object
 * 
 * a=0;
 * b=1;
 * add a value into arraylist
 * add b value into arraylist
 * 
 * for(int i =1;i,=10;i++){
 *  c= a+b;
 *  
 *  add 'c' value into ArrayList
 *  
 *  a=b;
 *  b=c;
 * }
 */


class Fibanacci{
	
	
	static ArrayList fibseq(int n) {
		
		int a,b,c;
		
	ArrayList list = new ArrayList();
			
	      a=0;
	      b=1;
	   
	   list.add(a);
	   list.add(b);
		for( int i=1;i<=n-2;i++) {
			
			c=a+b;
			
			list.add(c);
			a=b;
			b=c;
		}
			return list;
			
			
		
	}
}
public class FibanacciSequence {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enete any number");
		
		int n =scan.nextInt();
		
		System.out.println(Fibanacci.fibseq(n));

	}

}
