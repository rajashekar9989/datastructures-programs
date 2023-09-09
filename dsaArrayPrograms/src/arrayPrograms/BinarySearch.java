package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
	
	
	Scanner scan = new Scanner(System.in);

	int i, j,n;

	System.out.println("enter size of the array : ");

	n = scan.nextInt();

	int[] a = new int[n];

	System.out.println("enter" + " " + n + "elements: ");

	for (i = 0; i < n; i++)
		a[i] = scan.nextInt();
	
	//Arrays.sort(a);

	

	//System.out.println("Before Sorting "+Arrays.toString(a));
    
	
  // implementation  of our business logic
	
	Arrays.sort(a);
	
	System.out.println("After sorting "+ Arrays.toString(a));
	
	System.out.println("Enter Key value");
	
	 int key  = scan.nextInt();
	 
	 int index =-1;
	 
	int low, mid, high;
	
	low=0;
	high=a.length-1;
	while(low<=high) {
		
		mid=(low+high)/2;
		
		if(key==a[mid]) {
			
			index=mid;
			break;
		}
		else if(key<a[mid])
			high =mid-1;
		
		else 
			low =mid+1;
		
		
	}
	 
	 System.out.println("Location = "+ index);

}

}
