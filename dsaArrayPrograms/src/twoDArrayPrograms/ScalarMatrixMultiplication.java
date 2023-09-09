package twoDArrayPrograms;

import java.util.Scanner;

public class ScalarMatrixMultiplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, j;

		int a[][] = new int[3][3];

		System.out.println("Enter a 3*3 Matrix elements");

		// reading

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				a[i][j] = scan.nextInt();
			}

		}

		System.out.println("enter a multiplier");

		int m = scan.nextInt();

		// write

		System.out.println("Matrix A is :");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// write
		System.out.println("Result Matrix is :");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.print(m * a[i][j] + " ");

			}
			System.out.println();
		}

	}

}
