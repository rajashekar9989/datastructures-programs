package searchingAlgoritnmInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchByUsingRecursion {

	static int binarySearchRec(int[] a, int key, int low, int high) {

		int mid = (low + high) / 2;

		if (low > high)

			return -1;

		else {

			if (key == a[mid])

				return mid;

			else if (key < a[mid])

				return binarySearchRec(a, key, low, mid - 1);

			else

				return binarySearchRec(a, key, mid + 1, high);

		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random r = new Random();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++)

			a[i] = r.nextInt(100);

		System.out.println(Arrays.toString(a));

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		System.out.println("eneter  element to search : ");

		int key = scan.nextInt();

		System.out.println(binarySearchRec(a, key, 0, a.length - 1));

	}
	
	

}
