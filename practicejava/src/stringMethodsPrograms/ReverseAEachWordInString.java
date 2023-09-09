package stringMethodsPrograms;

import java.util.Arrays;

public class ReverseAEachWordInString {
	
	
	// input :java is easy

	// ouput : avaj si ysae
	
	
	public static  String  reverseWord(String str) {
		
		
		String words [] = str.split("\\s");
		
		String reverseWord="";
		
		for(String w : words) {
			
			StringBuilder sb = new StringBuilder(w);
			
			sb.reverse();
			
			reverseWord =reverseWord+sb.toString()+" ";
			
			
			
}
		
		return reverseWord.trim();
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseWord("java is easy"));
		
	}
	}


