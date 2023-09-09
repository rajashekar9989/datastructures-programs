package twoDArrayPrograms;

import java.util.Scanner;

public class CheckIdentityMatrix {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a 3*3 matrix");

		int i, j, a[][] = new int[3][3];

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {
				
				

				a[i][j] = scan.nextInt();
			}
		}

		System.out.println("given Matrix is :");

		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				System.out.print(a[i][j] + " ");
			}

			System.out.println();

		}

     boolean flag =true;
     
       for (i = 0; i < 3; i++) {
			
			for (j = 0; j < 3; j++) {
				
                if(i == j &&  a[i][j] != 1) {
                	
                	flag =false;
                	break;
                }
                
                if(i!=j && a[i][j] !=0) {
                	
                	flag =false;
                	break;
                }
                
             }
            
		}
		
		
		System.out.println((flag)?"Yes" :"No");
		

	}



}
