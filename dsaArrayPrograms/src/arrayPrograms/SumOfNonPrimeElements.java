package arrayPrograms;

import java.util.Scanner;

public class SumOfNonPrimeElements {
	
	
	public static Boolean prime(int n , int i) {
		
		if(i==1)
			return true;
		
		else if(n%i==0)
			
			return false;
		
		else
			
			return prime(n,--i);
			
			
			
		}

		public static void main(String[] args) {
			
			
			Scanner scan = new Scanner(System.in);

			int i, n;

			System.out.println("enter size of the array : ");

			n = scan.nextInt();

			int[] a = new int[n];

			System.out.println("enter" + " " + n + "elements: ");

			for (i = 0; i < n; i++)
				a[i] = scan.nextInt();

			// by using for loop

			System.out.println("array elemenst are : ");

			for (i = 0; i < n; i++)

				System.out.println("a[" + i + "]" + a[i]);
			
			// implementing our  business logic
			int sum=0;
			for(i=0;i<a.length;i++) {
				
				if(!prime(a[i],a[i]/2)) 
					sum=sum+a[i];
				
				}
			System.out.println("sum  of non-prime elements are :"+sum);


		}


			

		}



