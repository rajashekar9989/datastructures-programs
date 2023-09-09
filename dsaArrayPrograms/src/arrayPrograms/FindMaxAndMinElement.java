package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i, j,n;

		System.out.println("enter size of the array : ");

		n = scan.nextInt();

		int[] a = new int[n];

		System.out.println("enter" + " " + n + "elements: ");

		for (i = 0; i < n; i++)
			a[i] = scan.nextInt();

		

		System.out.println("Before Sorting "+Arrays.toString(a));
        
		
      // implementation  of our business logic
		
		for(i =0;i<a.length;i++) {
			
			for(j=i+1;j<n;j++) {
				
				if(a[i]>a[j]) {
					
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
					
				}
			
		}
		}
		
		System.out.println("After sorting "+ Arrays.toString(a));
		
		System.out.println("Max element in Array :"+a[n-1]);
		
		System.out.println("Min element in Array :"+a[0]);
		

}


	}


