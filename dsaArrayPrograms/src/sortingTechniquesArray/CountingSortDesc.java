package sortingTechniquesArray;

import java.util.Arrays;

public class CountingSortDesc {
	
	/*  1.it is based on keys between specific range.
	 * 
	 *   2. it works by counting  number of objects.
	 * 
	 * 	
	 */
		
public static void countingSortDesc(int a[], int lowerRange, int upperRange) {
			
			int size = a.length;
			
			int range = upperRange - lowerRange;
			
			int [] count = new int [range];
			
			int i,j=0;
			
			for(i=0;i<size;i++)
				
				count[upperRange-a[i]]++;
			
			for(i=0;i<range;i++) {
				
				for(;count[i]>0;(count[i])--)
					
					a[j++] = upperRange-i;
			}
			
		}
		

		public static void main(String[] args) {
			
			
			int a[] = {23,24,22,21,26,25,27,28,21,21};
			
			System.out.println(Arrays.toString(a));
			
			countingSortDesc(a,20,30);
			
			System.out.println(Arrays.toString(a));
			

		}

}
