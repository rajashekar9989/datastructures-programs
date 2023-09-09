package stringMethodsPrograms;

import java.util.Arrays;

public class CountNoOfWords {
	
	
	public static int countWords(String str) {
		
		
		if(str == null || str.isEmpty())
			
			return 0;
		
		String [] words =str.split(" ");
		
		
		return words.length;
	}

	public static void main(String[] args) {

		
	String s ="Hello ^world h^ow are yo^u guys d^oing";
		
		System.out.println(Arrays.toString(s.split("\\s")));
		
		String str ="java is super Hello";
		
	System.out.println("No of words is :"+countWords(str));
		
		

	

	}

}
