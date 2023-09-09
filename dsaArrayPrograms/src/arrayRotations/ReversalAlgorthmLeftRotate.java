package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class ReversalAlgorthmLeftRotate {
	
	public static void reverse(int a[], int left,int right) {
		
		int temp;
		
		while(left<right) {
			
			temp=a[left];
			a[left] =a[right];
			
			a[right] =temp;
			
			left++;
			right--;
			
			
		}
		
	}
	
	
	public static void reversalLeftRotate(int a[], int r) {
		
		int n=a.length;		
		
	     r = r%n;
	     
	     
	     reverse(a,0,r-1);
	     reverse(a,r,n-1);
	     reverse(a,0,n-1);
		
		
}
	
	

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(a));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter No Of Rotations :");
		
		
		int r =scan.nextInt();
		
		
		
		reversalLeftRotate(a,r);
		
		
		System.out.println(Arrays.toString(a));

	}

}
