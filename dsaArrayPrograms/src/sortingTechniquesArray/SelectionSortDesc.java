package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortDesc {

	
	/*
	 * 1. Selection sort traversed the unsorted Array and put largest value at the end.
	 * 
	 * 2.this process is repeated for n-1 number of times.
	 * 
	 * 3.it is better then bubble and insertion sort.
	 * 
	 * 4. it requires less number of swaps.
	 * 
	 * 
	 */
		
		
		public static void selectionSortAsc(int a[]) {
			
	         int i,j,temp,max;
			
			    for(i=0;i<a.length-1;i++) {
			    	
			    	max =0;
			    	
			    	for(j=1;j<a.length-i;j++) {
			    		
			    		if(a[j] < a[max])
			    			
			    			max=j;
			    		
			    		
			    	}
			    	
			    	temp =a[a.length-1-i];
			    	
			    	a[a.length-1-i]= a[max];
			    	
			    	a[max] =temp;
			    }
			
			
		}
		

		public static void main(String[] args) {
		
			
			
			Random r = new Random();
			
			int a[] = new int[10];
			
			for(int i =0;i<a.length;i++) {
				
				a[i]= r.nextInt(100);
			}
			
			System.out.println(Arrays.toString(a));
			
			selectionSortAsc(a);
			
			System.out.println(Arrays.toString(a));
			

		}

}
