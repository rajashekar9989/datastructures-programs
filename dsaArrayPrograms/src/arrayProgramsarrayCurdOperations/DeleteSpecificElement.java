package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeleteSpecificElement {

	public static int[] DeleteElement(int a[], int element) {

		int i , j, b[];

		 int location = -1;
		
		for (i = 0; i < a.length; i++) {

			if (element != a[i]) {

				location = -1;

				
			}
		}

		for (i = 0; i < a.length; i++) {

			if (element == a[i]) {

				location = i;

				break;
			}
		}

		if (location != -1) {

			b = new int[a.length - 1];

			for (i = 0, j = 0; i < a.length; i++) {

				if (i != location) {

					b[j++] = a[i];

				} else
					continue;
			}
			return b;

		} 
		
	 return a;
	

	}

	public static void main(String[] args) {
		
       int [] a = {10,11,12,13,14,15,16,17};
		
		System.out.println(Arrays.toString(a)); //10,11,12,13,14,15,16,17
		
		
		 a= DeleteElement(a,19);
		
		
		System.out.println(Arrays.toString(a));///10,11,12,13,15,16,17
	

	}

	}


