package twoDArrayPrograms;

import java.util.Scanner;

public class InterChangeMainOppositeDiagonals {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a  3*3 matrix ");
		
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
		
		int temp;
		
		for(i=0;i<3;i++) {
			
			temp=a[i][i];
			a[i][i]=a[i][3-i-1];
			
			a[i][3-i-1] =temp;
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
