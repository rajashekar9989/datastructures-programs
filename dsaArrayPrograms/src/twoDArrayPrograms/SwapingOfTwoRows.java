package twoDArrayPrograms;

import java.util.Scanner;

public class SwapingOfTwoRows {
	
	/*  Ex:   1 2 3 
	 *        4 5 6
	 *        7 8 9
	 *        
	 *        swap the 1st and 3rd col
	 *        
	 *       
	 *       3 2 1
	 *       6 5 4
	 *       9 8 7
	 *      
	 *  
	 *        
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a3*3 matrix ");
		
		int i, j, a[][] = new int[3][3];
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j] = scan.nextInt() ;
			}
		}
		
		
		System.out.println("The given Matrix");
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		// logic
		
		System.out.println("enter a first col value");
		
		int r1 = scan.nextInt();
		
		System.out.println("enter a second col value");
		
		int r2 = scan.nextInt();
		
		int temp;
		
		for(i=0;i<3;i++) {
			
		
			temp =a[i][r1-1];
			
			a[i][r1-1] =a[i][r2-1];
			
			a[i][r2-1] = temp;
				
				
}
		System.out.println("updated matrix");
		
      for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

	}

}
