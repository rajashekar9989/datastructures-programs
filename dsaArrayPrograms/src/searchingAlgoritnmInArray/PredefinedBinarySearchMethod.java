package searchingAlgoritnmInArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PredefinedBinarySearchMethod {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random r = new Random();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++)

			a[i] = r.nextInt(100);

		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("enter element to search : ");
		
		int key =scan.nextInt();
		
		System.out.println(Arrays.binarySearch(a, key));
		
		
		

}
}
