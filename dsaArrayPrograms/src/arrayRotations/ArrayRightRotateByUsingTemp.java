package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotateByUsingTemp {
	
public static void arrayRotateByTemp(int a[], int r){
		
		int temp,i,j;
		
		r=r%a.length;
		
		for(i=0;i<r;i++) {
			
			temp=a[a.length-1];
			
		for(j=a.length-1;j>0;j--) 
			
			a[j]=a[j-1];
			
			a[0]=temp;
			
			
		
			
			
		}
		
}

	public static void main(String[] args) {
		
		
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a number of Rotations :");
		
		
		int r =scan.nextInt();
		
		arrayRotateByTemp(a,r);
		
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}


