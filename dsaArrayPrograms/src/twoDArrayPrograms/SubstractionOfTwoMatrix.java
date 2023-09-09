package twoDArrayPrograms;

import java.util.Scanner;

public class SubstractionOfTwoMatrix {
	
public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int i,j;
		int a[][] = new int [3][3];
		int b[][] = new int [3][3];
		int c[][] = new int [3][3];
		
		//System.out.println("enter a 3*3 matrix elements");
		
		// reading
		
		System.out.println("enter A matrix elements");
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j]=scan.nextInt();
			}
		}
		
	System.out.println("enter B matrix elements :");
		// reading
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				b[i][j]=scan.nextInt();
			}
		}
		
		// logic
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				c[i][j]= a[i][j] - b[i][j];
			}
		}
		
         //  write
		
		System.out.println("Matrix A is : ");
		
		for(i=0;i<3;i++) {
			
			for(j =0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
 //  write
		
		System.out.println("Matrix B is : ");
		
		for(i=0;i<3;i++) {
			
			for(j =0;j<3;j++) {
				
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
 //  write
		
		System.out.println("Matrix c is : ");
		
		for(i=0;i<3;i++) {
			
			for(j =0;j<3;j++) {
				
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
		}
	}


}
