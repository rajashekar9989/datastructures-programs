package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		
		int i,j,n1,n2,a[],b[],c[];
		
		System.out.println("enter size ofArray1 :");
		
		n1=scan.nextInt();
		
		a= new int [n1];
		
		System.out.println("enter size of Array2 :");
		
		n2=scan.nextInt();
		
		b= new int[n2];
		
		System.out.println("enter"+n1+" "+"elements");
		
		for(i=0;i<n1;i++)
			
			a[i]=scan.nextInt();
		
		
		System.out.println("enter"+n2+" "+"elements");
		
		for(i=0;i<n2;i++)
			b[i]=scan.nextInt();
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(b));
		
		c =new int[n1+n2];
		
		j=0;
		i=0;
		while(i<n1)
			c[j++]=a[i++];
		
		i=0;
		
		while(i<n2)
			
			c[j++]=b[i++];
		
		System.out.println(Arrays.toString(c));
		
		

	}

}
