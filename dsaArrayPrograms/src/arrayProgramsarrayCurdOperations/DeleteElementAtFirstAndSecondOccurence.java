package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeleteElementAtFirstAndSecondOccurence {
	
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

	public static int[] deleteElementAtFirstSecondOccurence(int a[], int element) {

		int i, c =0;
		
		for (i = 0; i < a.length; i++) {

			if (element == a[i]) {
				c++;

			a=deleteAtLocation(a,i);
			
			if(c==2)
				

				break;
				
			}
		}
			
		return a;
		
	}

		
	public static void main(String[] args) {

		int[] a = { 10, 19, 12, 19, 13, 14, 15, 16, 17, 19 };

		System.out.println(Arrays.toString(a)); // 10,19,12,19,13,14,15,16,17,19

		a = deleteElementAtFirstSecondOccurence(a, 19);

		System.out.println(Arrays.toString(a));///  10,12,13,14,15,16,17,19

	}


}
