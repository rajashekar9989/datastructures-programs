package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotate {
	
	
	
	public static void bruteForceLeftRotate(int a[], int r) {
		
		int i,j,temp,prev;
		
		r=r%a.length;
		

		
		for(i=0;i<r;i++) {
			  
			prev=a[0];
					
					
			for(j=a.length-1;j>=0;j--) {
				
				
				temp=a[j];
				
				a[j]=prev;
				
				prev=temp;
						
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
		
		
		int a[]= {1,2,3,4,5};
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Number of Rotates :");
		
		int r = scan.nextInt();
		
		bruteForceLeftRotate(a,r);
		
		System.out.println(Arrays.toString(a));

	}

}
