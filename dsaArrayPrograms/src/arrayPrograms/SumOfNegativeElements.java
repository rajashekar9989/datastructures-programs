package arrayPrograms;

import java.util.Scanner;

public class SumOfNegativeElements {
	
	public static Boolean isNegative(int n) {

		return n < 0;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, n;

		System.out.println("enter size of the array : ");

		n = scan.nextInt();

		int[] a = new int[n];

		System.out.println("enter" + " " + n + "elements: ");

		for (i = 0; i < n; i++)
			a[i] = scan.nextInt();

		// by using for loop

		System.out.println("array elemenst are : ");

		for (i = 0; i < n; i++)

			System.out.println("a[" + i + "]" + a[i]);

		// implementing our business logic
		int sum = 0;
		for (i = 0; i < a.length; i++) {

			if (isNegative(a[i]))
				sum = sum + a[i];

		}
		System.out.println("sum  of  +ve elements are :" + sum);

	}

}



