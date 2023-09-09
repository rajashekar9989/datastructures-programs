package twoDArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SortRowElementsInDsc {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a 3*3 matrix");

		int i, j, a[][] = new int[3][3];
		

		// read
		for(i=0;i<3;i++)
		{

			for (j = 0; j < 3; j++) {

				a[i][j] = scan.nextInt();
			}
		}

		System.out.println("given  A Matrix is :");

		for(i=0;i<3;i++)
		{

			for (j = 0; j < 3; j++) {

				System.out.print(a[i][j] + " ");
			}

			System.out.println();

		}
		
		for(i=0;i<3;i++) {
			
			Arrays.sort(a[i]);
			
		}

		System.out.println("Updated Matrix ");
		for(i=0;i<3;i++) {
		
			for (j = 3-1; j>= 0; j-- ) {
				
				System.out.print(a[i][j]+" ");

				
			}
			
			System.out.println();

		}
		
		for(i=0;i<3;i++) {
			
			System.out.println(Arrays.toString(a[i]));
		}



	}
}
