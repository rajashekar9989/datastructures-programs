package searchingAlgoritnmInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * searching is the process of of finding an item on a collection of items. the item may be a keyword in a file.
 * 
 * a record in the db, a node in a tree ,element in array.
 * 
 * the following are the two types of searching methods existed in data structures.
 * 
 * 1.linear search
 * 
 * 2. binary search
 * 
 */
 
 public class LienarSearch{
	
	
	static int LienarSearchFirstOccurence(int []a ,int key) {
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==key)
				
				return i;
		}
		return -1;
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		Random r = new Random();
		
		int [] a= new int [10];
		
		for(int i=0;i<10;i++)
			
			a[i]=r.nextInt(10);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("enter element to search : ");
		
		int key=obj.nextInt();
		
		
		System.out.println("search element index position :" +LienarSearchFirstOccurence(a,key));
			
			

	}

}
