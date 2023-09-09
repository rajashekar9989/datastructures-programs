package twoDArrayPrograms;

import java.util.Scanner;

public class ReadAndWrite2dArray {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int i,j,a[][]=new int[3][3];
		
		System.out.println("enter a 3*3 Array");
		
		// reading
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j]=scan.nextInt();
				
				
			}
		}
		
		//write 
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

		
	}

}
