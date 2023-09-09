package stringMethodsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenPositionWordsInString {
	
	/* write a java program to create an array using words at even positions in a string
	 * 
	 * input: java is super keka easy and awesome
	 * 
	 * ouput: ["is", "keka", "and"]
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		
		String  words =  "java is super keka easy and awesome";
		
	  String[] ch =	  words.split(" ");
	  
	  
	 // System.out.println(Arrays.toString(ch));
	  int count =0;
	 
	  List<String> arr = new ArrayList<String>();
	  
	  
	  
	  
	 
	  for(String s :ch) {
		  
		  count++;
		  
		  if(count%2==0) {
			  
			  System.out.print(s+" ");
			  
			  System.out.println(count);
			  
			// char[] name =s. toCharArray();
			  
			// System.out.print(s.toCharArray()+" ");
			 
			 
			    
			  
			  //System.out.print(Arrays.toString(name));
			  
			  
			
			 } 
		  
		  
		  
		 
		  
		 
		  
		  
		  
	  }
		
	
		
		
		
		              
		
		
		
		
		
		}

	}


