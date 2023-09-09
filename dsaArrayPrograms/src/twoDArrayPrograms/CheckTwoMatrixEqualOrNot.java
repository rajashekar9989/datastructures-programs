package twoDArrayPrograms;

import java.util.Scanner;

public class CheckTwoMatrixEqualOrNot {

	public static void main(String[] args) {
	
		

			Scanner scan = new Scanner(System.in);

			System.out.println("enter a 3*3 matrix");

			int i, j, a[][] = new int[3][3], b[][] = new int [3][3];

			
			// read A matrix
			for (i = 0; i < 3; i++) {

				for (j = 0; j < 3; j++) {
					
					

					a[i][j] = scan.nextInt();
				}
			}
			
			System.out.println("enter B matrix");
			
			// read B matrix
						for (i = 0; i < 3; i++) {

							for (j = 0; j < 3; j++) {
								
								

								b[i][j] = scan.nextInt();
							}
						}

			System.out.println("given  A Matrix is :");

			for (i = 0; i < 3; i++) {

				for (j = 0; j < 3; j++) {

					System.out.print(a[i][j] + " ");
				}

				System.out.println();

			}
			
			
			System.out.println("given  B Matrix is :");

			for (i = 0; i < 3; i++) {

				for (j = 0; j < 3; j++) {

					System.out.print(b[i][j] + " ");
				}

				System.out.println();

			}

      // logic 
			
			boolean flag =true;
			
			for(i=0;i<3;i++) {
				
				for(j=0;j<3;j++) {
					
					if(a[i][j] != b[i][j]) {
						
						flag =false;
						
						break;
					}
				}
			}
			
			System.out.println((flag)?"Yes":"No");
			


	}
}


