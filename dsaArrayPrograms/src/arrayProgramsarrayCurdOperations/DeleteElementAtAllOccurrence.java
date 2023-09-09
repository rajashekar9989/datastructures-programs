package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeleteElementAtAllOccurrence {
	
	
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


public static int[] deleteElementFromAllOccurrence(int a[], int element) {

	int i;
	
	for (i = 0; i < a.length; i++) {

		if (element == a[i]) {
			

		a=deleteAtLocation(a,i);
		
			
		}
	}
		
	return a;
	
}

	


	public static void main(String[] args) {
		
		
		int[] a = { 10,12,13,14,13,16,15,13,17,18 };

		System.out.println(Arrays.toString(a)); // 10,12,13,14,13,16,15,13,17,18

		a = deleteElementFromAllOccurrence(a, 13);

		System.out.println(Arrays.toString(a));///  10,12,14,16,15,17,18

	

		

	}

}
