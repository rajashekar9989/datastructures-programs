package arrayRotations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRightRotate {
	
	
	public static void bruceForceRight(int b[], int r) {
		
		
		int i,j,temp,prev;
		
		for(i=0;i<r;i++) {
			
			prev= b[b.length-1];
		
		
		for(j=0;j<b.length;j++) {
			
			
			temp=b[j];
			b[j]=prev;
			
			prev=temp;
			
			
		}
			
		}
	}

	public static void main(String[] args) {
	
		
		int b[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(b));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter numberof Roatations :");
		
		int r =scan.nextInt();
		
		
		bruceForceRight(b,r);
		
		System.out.println(Arrays.toString(b));

	}

}
