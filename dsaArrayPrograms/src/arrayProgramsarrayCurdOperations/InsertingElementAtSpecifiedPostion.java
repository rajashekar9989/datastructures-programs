package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class InsertingElementAtSpecifiedPostion {

	// Insert elements at Specified position
	static int[] insertAtLocation(int a[], int element, int location) {

		int i, b[] = new int[a.length + 1];

		for (i = 0; i < location; i++)

			b[i] = a[i];

		b[location] = element;

		for (; i < a.length; i++)

			b[i + 1] = a[i];

		return b;

	}

	public static void main(String[] args) {

		int[] a = { 111, 222, 333, 444 };

		System.out.println(Arrays.toString(a));

		a = insertAtLocation(a, 999, 2);

		System.out.println(Arrays.toString(a));

	}

}
