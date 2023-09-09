package stringMethodsPrograms;

public class CheckPaliandromeOrNot {

	/*
	 * write a java program to verify whether given string is palindrome or not;
	 * 
	 * input:javaj output:it is a palindrome
	 * 
	 * input:Javaj output: it is not a palindrome
	 * 
	 * input :madam output: it is a palindrome
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String name = "javaj";

		
		String rev="";
		
		// by using string builder
		
		
		StringBuilder sb = new StringBuilder(name);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		if(name.equals(sb)) {
			
			System.out.println("it is a palindrome");
			
		}
		
		else {
			
			System.out.println("it is not palindrome");
		}
		
		
		
		// by using for loop

//		
//		
//		for (int i = name.length() - 1; i >= 0; i--) {
//
//			rev =  rev+name.charAt(i);
//
//		}
//		
//		
//			if (rev.equals(name)) {
//
//				System.out.println("it is palindrome");
//			}
//
//			else {
//
//				System.out.println("it is not palindrome");
//			}

		}

	}



