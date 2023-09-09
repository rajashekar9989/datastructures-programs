package twoDArrayPrograms;

import java.util.Scanner;

public class RotateAMatrixBy90Degrees {
	
	
/*  rotate by 90 degrees  means 
 *  1 2 3
 *  4 5 6
 *  7 8 9          
 *   
 *   3 6 9
 *   2 5 8
 *   1 4 7
 * 
 * 
 * 
 */
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a  3*3 matrix ");
		
		int i, j, a[][] = new int[3][3], b[][] = new int [3][3];
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				a[i][j] = scan.nextInt() ;
			}
		}
		
		
		System.out.println("The original Matrix");
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		// logic 
		
	
		
		for(i=0;i<3;i++) {
			
			for(j=0;j<3;j++) {
				
				b[i][j]=a[j][i];
			}
			
			
	}
		
		
		System.out.println(" Updated matrix is : " );
		
		for(i=3-1;i>=0;i--) {
			
			for(j=0;j<3;j++) {
				
				System.out.print(b[i][j]+" ");
			}
			
			System.out.println();
		}

}

}
