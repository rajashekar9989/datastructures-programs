package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class TempArrayMethod1Right {
	
	
	public static void tempArrayMethod1(int a[],int r) {
		
		int i,n=a.length;
		
		r=r%n;
		
		int [] temp =new int [r];
		
		for(i=0;i<r;i++) 
			
			temp[i] =a[n-r+i];
			
			for(i=n-r-1;i>=0;i--) 
				
				a[i+r]=a[i];
			
			for(i=0;i<r;i++)
				a[i] =temp[i];
			
			
		
		
	}
	
	
	
public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number of Rotations :");
		
		
		int r =scan.nextInt();
		
		tempArrayMethod1(a,r);
		
		System.out.println(Arrays.toString(a));
		
}


}
