package twoDArrayPrograms;

import java.util.Scanner;

public class SumOfOppositeDiagonalElements {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a 3*3 matrix");

		int i, j, a[][] = new int[3][3];

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {
				
				

				a[i][j] = scan.nextInt();
			}
		}

		System.out.println("given Matrix is :");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.print(a[i][j] + " ");
			}

			System.out.println();

		}

		// logic = [i] [n-i-1]  --> n refers to size of matrix here 3*3 matrix so n=3;
		int sum=0;

		for (i = 0; i < 3; i++) {
			
			
      sum = sum + a[i][3-i-1];

	}
		
		System.out.println("sum of  opposite diagonal  elements = "+sum);

	}


}
