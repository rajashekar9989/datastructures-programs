package sortingTechniquesArray;

import java.util.Arrays;

/* 1. linear Sorting Algorithm.
 * 
 * 2.sorting is based on digits in the given Number.
 * 
 * 3.Least significant Digit followed by Most significant digit.
 * 
 * like sorting names:
 * 
 *  Raju
 *  Ravi
 *  
 *  first j and then v come
 *  
 *  Raju, Ravi
 *  
 *  Strings--------------> left to Right
 *  
 *  Numbers-------------->right to left
 *  
 *  --> internally it uses counting sort algorithm.
 * 
 * 
 */

public class RadixSort {
	
	
	public static int getMax(int a[]) {
		
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
				max=a[i];
		}
		
		return max;
	}
	
	
	static void radixSort(int [] a) {
		int max = getMax(a);
		
		for(int place =1;max/place>0;place =place*10)
			
			countingSort(a,place);
		
	}
	
	static void countingSort(int []a, int place) {
		
		
		int i, n =a.length;
		
		int [] b = new int [n];
		
		int count [] = new int [10];
		
		for(i=0;i<n;i++) 
			
			count[(a[i]/place)%10]++;
			
			for(i=1;i<count.length;i++)
				
				
				count[i]=count[i]+count[i-1];
			
			for(i=n-1;i>=0;i--)
				
				b[--count[(a[i]/place)%10]]=a[i];
			
			for(i=0;i<n;i++)
				
				a[i]=b[i];
			
			
	}
	
	

	public static void main(String[] args) {
		
		
		
		int [] a = {432,8,530,90,88,231,11,45,677,199};
		
		
		System.out.println(Arrays.toString(a));
		
		
		radixSort(a);
		
		
		
		System.out.println(Arrays.toString(a));

	}

}
