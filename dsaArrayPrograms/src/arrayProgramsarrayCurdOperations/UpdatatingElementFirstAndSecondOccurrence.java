package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class UpdatatingElementFirstAndSecondOccurrence {

	public static void updateElementFirstAndSecond(int a[], int olde, int newe) {
		int c = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == olde) {

				c++;

				a[i] = newe;

				if (c == 2)
					;

				break;
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 11, 22, 33, 22, 55, 22, 66 };

		System.out.println(Arrays.toString(a));// 11,22,33,22,55,22,66

		updateElementFirstAndSecond(a, 22, 99);

		System.out.println(Arrays.toString(a));// 11,99,33,99,55,22,66;

	}

}
