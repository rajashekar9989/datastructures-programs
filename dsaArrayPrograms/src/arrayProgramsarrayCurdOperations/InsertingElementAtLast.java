package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class InsertingElementAtLast {

	// Insert elements at Last position

	static int[] insertAtLast(int a[], int element) {

		int i, b[] = new int[a.length + 1];

		for (i = 0; i < a.length; i++)

			b[i] = a[i];

		b[i] = element;

		return b;

	}

	public static void main(String[] args) {
		int[] a = { 111, 222, 333, 444 };

		System.out.println(Arrays.toString(a));

		a = insertAtLast(a, 999);

		System.out.println(Arrays.toString(a));

	}

}
