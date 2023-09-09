package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;

public class ShellSortAsc {
	
	
	
     /* 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static void shallSortAsc(int a[]) {
		
		int gap,i,j,temp, n= a.length;
		
		for(gap=n/2;gap>=1;gap =gap/2) {
			
			for(j=gap;j<n;j++) {
				
				for(i=j-gap;i>=0;i=i-gap) {
					
					
					if(a[i+gap]>a[i]) {
						
						break;
					}
					
					else {
						
						temp =a[i+gap];
						
						a[i+gap] = a[i];
						
						a[i] = temp;
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		Random r = new Random();
		
		int a[] = new int[10];
		
		for(int i =0;i<a.length;i++) {
			
			a[i]= r.nextInt(100);
		}
		
		
		System.out.println(Arrays.toString(a));
		
		shallSortAsc(a);
		System.out.println(Arrays.toString(a));
		

	}

}
