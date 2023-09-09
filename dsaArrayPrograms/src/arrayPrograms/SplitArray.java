package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {
	
	public static void main(String[] args) {
		
	
	
	Scanner scan = new Scanner(System.in);
	
	int i,n,a[];
	
	System.out.println("enter the size of array");
	

	
    n =   scan.nextInt();
    a=new int[n];
    
    System.out.println("enter"+" "+n+"elements");
    
   
    
    for(i=0;i<n;i++)
    	
    	a[i]=scan.nextInt();
    
    
    System.out.println(Arrays.toString(a));
    
    System.out.println("enter the position of  from where we need to split :");
    
    int location=scan.nextInt();
    
    int b[]= new int[location];
    
    int c[]= new int[n-location];
    
    int q=0, p=0;
    
    for(i=0;i<location;i++)
    	
    	b[p++]=a[i];
    
    for(i=location;i<n;i++)
    	
    	c[q++]=a[i];
    
    System.out.println(Arrays.toString(a));
    
    System.out.println(Arrays.toString(b));
    
    System.out.println(Arrays.toString(c));
    
    
	
    
    
    
    
    
    
    	
    	
	
    		

}
}
