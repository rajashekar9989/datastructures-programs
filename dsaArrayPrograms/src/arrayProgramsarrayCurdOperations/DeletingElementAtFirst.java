package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class DeletingElementAtFirst {
	
	
	public static int[] DeleteAtFirstLocatin(int a[]) {
		
		int i, b[] = new int[a.length-1];
		
		for(i=0;i<a.length-1;i++) 
			
			b[i]=a[i+1];
		
		
		return b;
		
		
	}

	public static void main(String[] args) {
		
		
		int [] a = {10,11,12,13,14,15,16,17};
		
		System.out.println(Arrays.toString(a)); //10,11,12,13,14,15,16,17
		
		
		 a= DeleteAtFirstLocatin(a);
		
		
		System.out.println(Arrays.toString(a));///11,12,13,14,15,16,17
	

	}

}
