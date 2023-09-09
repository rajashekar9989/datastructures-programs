package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;

public class InsertionSortAsc {
	
/*  1. its time complexity is same as bubble sort
 * 
 * 2.same as bubble sort but gives more performance
 * 
 * 3.it is way we arrange our playing cards.
 * 
 * 4.each value is inserted into its proper position left to the element.
 * 
 * 
 * 	
 */
	
	
	public static void insertionSortAsc(int a[]) {
		
int i,j,temp;
		
		for(i=1;i<a.length;i++) {
			
			temp = a[i];
			
			for(j=1;j>0 && a[j-1]>temp;j--)
				
				a[j]=a[j-1];
			
			a[j]= temp;
			
			
			
		}

		
		
		
	}

	public static void main(String[] args) {
		
		
	Random r = new Random();
	
	int a[]= new int[10];
	
	for(int i=0;i<a.length;i++) {
		
		a[i]=r.nextInt(100);
	
	}
	
	System.out.println(Arrays.toString(a));
	
	insertionSortAsc(a);
	
	System.out.println(Arrays.toString(a));
	
	
	}

}
