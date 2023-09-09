package arrayPrograms;

import java.util.Scanner;

public class ReadWriteInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i, n;

		System.out.println("enter size of the array : ");

		n = scan.nextInt();

		int [] a = new int[n];

		System.out.println("enter" + " "+n  + "elements: ");

		for (i = 0; i < n; i++)
			a[i] = scan.nextInt();

		// by using for loop

		System.out.println("array elemenst are : ");

		for (i = 0; i < n; i++)

			System.out.println("a["+i+"]"+a[i]);

		// by using for each loop

		System.out.println("array elemenst are : ");

		for (int item : a)

			System.out.println(item);

	}

}
