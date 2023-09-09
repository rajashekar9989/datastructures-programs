package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingArrayInDescendingGivenRange {
	
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Random r = new Random();
		
		int a[]  = new int[10];
		
		    for(int i =0;i<a.length;i++)
		    	
		    	
		    a[i]  =r.nextInt(100);
		    
		    System.out.println(Arrays.toString(a));
		    
		    // logic to sort an array in ascending order within the index.
		    
		    System.out.println("enter sarting index");
		    
		    int start = scan.nextInt();
		    
		    System.out.println("enter  ending index");
		    
		    int end =scan.nextInt();
		    
		    
		    
		    int i,j, temp;
		    
		    
		    for(i=start;i<end;i++) 
		    	
		    	for(j=i+1;j<end;j++) 
		    		
		    		if(a[i]<a[j]) {
		    			
		    			temp=a[i];
		    			
		    			a[i]=a[j];
		    			
		    			a[j]=temp;
		    		}
		    	
		    	
		    
		    System.out.println("After sorting");
		    System.out.println(Arrays.toString(a));

	}


}
