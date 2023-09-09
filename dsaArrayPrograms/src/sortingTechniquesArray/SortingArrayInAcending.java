package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;

public class SortingArrayInAcending {

	public static void main(String[] args) {
		
		

		Random r = new Random();
		
		int a[]  = new int[10];
		
		    for(int i =0;i<a.length;i++)
		    	
		    	
		    a[i]  =r.nextInt(100);
		    
		    System.out.println(Arrays.toString(a));
		    
		    // logic to sort an array in ascending order
		    
		    int i,j, temp;
		    
		    
		    for(i=0;i<a.length;i++) 
		    	
		    	for(j=i+1;j<a.length;j++) 
		    		
		    		if(a[i]>a[j]) {
		    			
		    			temp=a[i];
		    			
		    			a[i]=a[j];
		    			
		    			a[j]=temp;
		    		}
		    	
		    	
		    
		    System.out.println("After sorting");
		    System.out.println(Arrays.toString(a));

	}

}
