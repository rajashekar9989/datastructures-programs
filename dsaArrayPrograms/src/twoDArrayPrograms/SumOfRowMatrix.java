package twoDArrayPrograms;

import java.util.Scanner;

public class SumOfRowMatrix {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a 3*3 matrix");
		
		
		int i,j, a[][] = new int [3][3];
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("given Matrix is :");
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		int sum;
		
		for(i=0;i<3;i++) {
			 sum=0;
			for(j=0;j<3;j++) {
				
				sum=sum+a[i][j];
				
				
			}
			
			System.out.println("row = "+i +"and its sum = "+sum);
		}
		
		
		

	}

}
