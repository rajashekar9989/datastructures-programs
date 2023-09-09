package mergeSort;

import java.util.Arrays;
import java.util.Random;

public class MergeSortDesc {
	
	/*  Divide and  conquer
	 * 
	 * Dividing a big problem into a smaller sub-problem, later we will find the solution for those sub problems 
	 * and by add the result of these sub problems, will provide result for original pronlem.
	 * 
	 * 
	 * ex: Merge sort
	 * 
	 *     quick sort.
	 * 
	 * 
	 */
	
	public static void mergeSortDesc(int [] a, int n) {
		
		
		if(n<2)
			
			return;
		
		int i, mid=n/2;
		
		int []  l = new int [mid];
		
		int r[] = new int[n-mid];
		for(i=0;i<mid;i++)
			
			l[i]=a[i];
		
		for(i=mid;i<n;i++)
			
			r[i-mid]=a[i];
		
		mergeSortDesc(l,mid);
		mergeSortDesc(r,n-mid);
		merge(a,l,r,mid,n-mid);
		
		
	}
	
	
	public static void merge(int a[], int l[], int r[],int left,int right) {
		
		int i=0,j=0,k=0;
		
		while(i<left && j<right) {
			
			if(l[i]>=r[j])
				
				a[k++] =l[i++];
			
			else
				a[k++]=r[j++];
			
		}
		
		while(i<left)
			
			a[k++] =l[i++];
		
		while(j<right)
			
			a[k++]=r[j++];
	}

	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		int [] a = new int[10];
		
		for(int i=0;i<a.length;i++)
			
		 a[i] =r.nextInt(100);
		
		System.out.println(Arrays.toString(a));
		
		mergeSortDesc(a,a.length);
		
		System.out.println(Arrays.toString(a));
		

	}


}
