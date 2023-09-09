package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		         int i,j,n,a[];
		         
		         System.out.println("enter the size of array");
		         
		          n= scan.nextInt();
		          
		          a=new int [n];
		          
		          System.out.println("enter"+n+"elements");
		          
		          for(i=0;i<n;i++) 
		        	  
		        	  a[i]=scan.nextInt();
		          
		          //int temp=a[i];
		          
		          
		          
		          System.out.println(Arrays.toString(a));
		          
		          
		          //implementing our own business logic
		          
		          for(i=n-1;i>=0;i--) {
		        	  
		        	  System.out.print(a[i]+" ");
		        	  
		        	  
		        		  
		          }
		          
		          
		         
		         
		          
		          
		          

	}

}
