package twoDArrayPrograms;

import java.util.Scanner;

public class SumOfEachElementInMatrix {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		int i,j,a[][]= new int[3][3];
		
		
		System.out.println("enter a 3*3 Array matrix ");
		
		// reading
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
			a[i][j]=scan.nextInt();
			}
			
			System.out.println();
		}
		
		// write
		
		System.out.println("Given Matrix is : ");
        for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
        
        // logic
        
        int sum=0;
        
        for(i=0;i<3;i++) {
        	
        	for(j=0;j<3;j++) {
        		
        		sum= sum +a[i][j];
        	}
        }
		System.out.println("sum = "+sum);
	}

}
