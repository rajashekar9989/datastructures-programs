package searchingAlgoritnmInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchUsingLoops {
	
	
	/* 1. it divides the list into two parts, and we will search only in one part repeatedly.
	 * 
	 * 2.we can implement binary search algorithm by using loops and recursion(methods).
	 * 
	 * 3.constraint is compulsory list should be in order.
	 * 
	 * 
	 * Binary search implementation using loops.
	 */

	
	static int binarySearchLoops(int []a , int key) {
		
		int low, high,mid;
		
		low=0;
		
		high=a.length-1;
		
		while(low<=high) {
			
			
			mid =(low+high)/2;
			
			if(key==a[mid])
				
				return mid;
			
			else if(key<a[mid])
				
				high = mid-1;
			
			else
				
				low =mid+1;
		}
		
		return -1;
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Random r = new Random();
		
		
		int a[] = new int [10];
		
		for(int i=0;i<10;i++)
			
			a[i]=r.nextInt(100);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("eneter  element to search : ");
		
		int key =scan.nextInt();
		
		System.out.println(binarySearchLoops(a,key));
		

	}

}
