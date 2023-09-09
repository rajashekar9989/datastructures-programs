package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfFirstAndLastElements {
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);

		int i, j,n;

		System.out.println("enter size of the array : ");

		n = scan.nextInt();

		int[] a = new int[n];

		System.out.println("enter" + " " + n + "elements: ");

		for (i = 0; i < n; i++)
			a[i] = scan.nextInt();

  System.out.println(Arrays.toString(a));
  
  // implementation of our business logic
  
  int low=0, high =a.length-1;
  
  while(low<=high) {
	  System.out.print((a[low]+a[high])+" ");
	  
	  low++;
	  high--;
	  
  }
  System.out.println();
}
}
