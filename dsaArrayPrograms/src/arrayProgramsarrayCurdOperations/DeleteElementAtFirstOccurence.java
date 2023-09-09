package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeleteElementAtFirstOccurence {
	
	
	public static int[] deleteAtLocation (int a[], int location) {
		
		int i,j, b[] = new int [a.length-1];
		
		for(i=0,j=0;i<a.length;i++) {
			
			if(i!=location)
				
				b[j++]=a[i];
			
			else
				
				continue;
		}
		
		return b;
	}

	public static int[] deleteElementAtFirstOccurence(int a[], int element) {

		int i;
		

		for (i = 0; i < a.length; i++) {

			if (element == a[i]) {

			a=deleteAtLocation(a,i);

				break;
				
			}
		}
			
		return a;
		
	}

		
	public static void main(String[] args) {

		int[] a = { 10, 11, 12, 19, 13, 14, 15, 16, 17, 19 };

		System.out.println(Arrays.toString(a)); // 10,11,12,13,14,15,16,17

		a = deleteElementAtFirstOccurence(a, 19);

		System.out.println(Arrays.toString(a));/// 10,11,12,13,15,16,17

	}

}
