package examples;

import java.util.Scanner;

public class DeleteElementInArray {
	
	public static void main(String[] args)
	   {
	      int i, j, size, element, count=0;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Size of Array: ");
	      size = scan.nextInt();
	      int[] arr = new int[size];
	      
	      System.out.print("Enter " +size+ " Elements: ");
	      for(i=0; i<size; i++)
	         arr[i] = scan.nextInt();
	      
	      System.out.print("\nEnter the Element to Remove: ");
	      element = scan.nextInt();
	      
	      for(i=0; i<size; i++)
	      {
	         if(element==arr[i])
	         {
	            for(j=i; j<(size-1); j++)
	               arr[j] = arr[j+1];
	            size--;
	            i--;
	            count++;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nElement not found!");
	      else if(count==1)
	      {
	         System.out.println("\nRemoved the element successfully!");
	         System.out.println("\nThe new array is: ");
	         for(i=0; i<size; i++)
	            System.out.print(arr[i]+ " ");
	      }
	      else
	      {
	         System.out.println("\nRemoved all " +element+ " from the array.");
	         System.out.println("\nThe new array is: ");
	         for(i=0; i<size; i++)
	            System.out.print(arr[i]+ " ");
	      }
	   }
	}


