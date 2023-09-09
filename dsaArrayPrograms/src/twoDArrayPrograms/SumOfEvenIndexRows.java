package twoDArrayPrograms;

import java.util.Scanner;

public class SumOfEvenIndexRows {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a  3*3 matrix ");
		
		int i, j, a[][] = new int[3][3];
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j] = scan.nextInt() ;
			}
		}
		
		
		System.out.println("The given Matrix");
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		// logic 
		
		int sum=0;
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				if(i%2==0)
					
					sum= sum+a[i][j];
			}
			
			
	}
		System.out.println("Sum of even index row " +sum);

}
}
