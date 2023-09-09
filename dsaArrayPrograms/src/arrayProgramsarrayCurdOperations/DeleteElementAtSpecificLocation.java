package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeleteElementAtSpecificLocation {
	
	
public static int[] DeleteAtLocatin(int a[], int location) {
		
		int i, j,b[] = new int[a.length-1];
		
		for(i=0,j=0;i<a.length;i++) {
			
			if(i!=location)
				
				b[j++]=a[i];
			
			else
				
				continue;
			}
			
	return b;
		
		
	}

	public static void main(String[] args) {
		
		
		int [] a = {10,11,12,13,14,15,16,17};
		
		System.out.println(Arrays.toString(a)); //10,11,12,13,14,15,16,17
		
		
		 a= DeleteAtLocatin(a,3);
		
		
		System.out.println(Arrays.toString(a));///[10,11,12,14,15,16,17]
	

	}

}



