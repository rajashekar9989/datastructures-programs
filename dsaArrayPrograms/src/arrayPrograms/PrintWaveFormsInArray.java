package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintWaveFormsInArray {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		int i,n,a[];
		
		System.out.println("enter a size of array");
		
		n =scan.nextInt();
		a=new int[n];
		
		System.out.println("enter"+n+"elements");
		
		for(i=0;i<n;i++)
			
		a[i]= scan.nextInt();
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int temp;
		for(i=1;i<n-1;i+=2) {
			
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
