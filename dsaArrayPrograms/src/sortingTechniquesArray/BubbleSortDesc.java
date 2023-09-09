package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortDesc {

	
	/* 1. when the input size is very small then we can use bubble sort
	 * 
	 * 2.simple and easy sort by bubbling the elements
	 * 
	 * 3.if the second value is less than first value,then swapping is required else no,
	 * 
	 * 4.at first pass largest element will move to the end 
	 * 
	 * 5.at second pass second largest element will move the last before position and so on.
	 * 
	 * 6. all the data will be arranged in  ascending order---> a[j]>a[j+1] then  swap.
	 * 
	 * 7. all the  data  will be arranged in descending oder--->a[j]<a[j+1] then swap.
	 * 
	 * 
	 *
	 * 
	 * 
	 */
		
		public static  void bubbleSortAsc(int a[]) {
			
			
			
			int i,j,t;
			
			for(i=0;i<a.length-1;i++) {
				
				
				for(j=0;j<a.length-1;j++) {
					
					if(a[j]<a[j+1]) {
						
						t=a[j];
						
						a[j]=a[j+1];
						
						a[j+1]=t;
					}
				}
			}
		}
		

		public static void main(String[] args) {
		
			Random r = new Random();
			
			
			int a[]= new int[10];
			
			for(int i=0;i<a.length;i++) 
			
			  a[i]=r.nextInt(100);
			
			
			System.out.println(Arrays.toString(a));
			
			
			bubbleSortAsc(a);
			
			
			System.out.println(Arrays.toString(a));
		

	}
}
