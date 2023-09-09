package sortingTechniquesArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortPrimitiveInAcending {
	
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Random r = new Random();
		
		int a[]  = new int[10];
		
		    for(int i =0;i<a.length;i++)
		    	
		    	
		    a[i]  =r.nextInt(100);
		    
		    System.out.println(Arrays.toString(a));
		    
		    // logic to sort an array in ascending order.
		    
		    Arrays.sort(a);
		    
		    
		    System.out.println("After sorting in ascending");
		    
		    
		    System.out.println(Arrays.toString(a));
		    

}

}
