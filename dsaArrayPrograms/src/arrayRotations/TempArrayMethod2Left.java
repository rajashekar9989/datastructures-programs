package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class TempArrayMethod2Left {
	
	
	
	public static void tempArrayMethod2Left(int a[],int r) {
		
		int i,n=a.length;
		
		r=r%n;
		
		int temp[] =new int [n];
		
		for(i=0;i<n;i++) 
			
			temp[i] =a[(i+r)%n];
			
			for(i=0;i<n;i++) 
				
				a[i]=temp[i];
			
			
		}
	
	
	
public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number of Rotations :");
		
		
		int r =scan.nextInt();
		
		tempArrayMethod2Left(a,r);
		
		System.out.println(Arrays.toString(a));
		
}


}
