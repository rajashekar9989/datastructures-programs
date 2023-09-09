package quickSort;

import java.util.Arrays;
import java.util.Random;

public class QucikSortAscending {

	public static void quickSortAsc(int[] a, int lindex, int rindex) {
		if (lindex >= rindex)

			return;

		int pivot, lp, rp, temp;
		pivot = a[rindex];
		lp = lindex;
		rp = rindex;

		while (lp < rp) {

			while (a[lp] <= pivot && lp<rp)

				lp++;
			
			

			while (a[rp] >= pivot && lp < rp)

				rp--;

			temp = a[lp];
			a[lp] = a[rp];
			a[rp] = temp;

		}

		temp = a[lp];
		a[lp] = a[rindex];
		a[rindex] = temp;

		quickSortAsc(a, lindex, lp - 1);
		quickSortAsc(a, lp + 1, rindex);

	}

	public static void main(String[] args) {

		Random r = new Random();

		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {

			a[i] = r.nextInt(100);
		}
			System.out.println(Arrays.toString(a));
			quickSortAsc(a, 0, a.length - 1);

			System.out.println(Arrays.toString(a));

		

	}

}
