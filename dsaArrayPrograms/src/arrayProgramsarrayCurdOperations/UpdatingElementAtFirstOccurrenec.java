package arrayProgramsarrayCurdOperations;

import java.util.Arrays;

public class UpdatingElementAtFirstOccurrenec {
	
	
	
	public static void updateElementAtFirst(int a[],int olde,int newe) {
		
		
		for(int i =0;i<a.length;i++) {
			
			if(a[i]==olde) {
				
				a[i]=newe;
				
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		int [] a = {11,22,33,22,55,22,66};
		
		System.out.println(Arrays.toString(a));// 11,22,33,22,55,22,66
		
		updateElementAtFirst(a,22,99);
		
		System.out.println(Arrays.toString(a));//11,99,33,99,55,99,66);
		

	}

}
