package stringMethodsPrograms;

public class ChangeOddWordsUpperCaseAndEvenReverse {

	// write a java program to modify the String in the following pattern

	// change odd words to UpperCase and even words to reverse

	// input :This is A test String

	// output : THIS si A tset STRING

	public static String changeWords(String str) {

		// char [] ch =str.toCharArray();

		String[] words = str.split("\\s");

		int count=0;

		for (String w : words) {
			
			
			count++;
			
			if (count % 2 == 0) {
				
							StringBuilder sb = new StringBuilder(w);

							sb.reverse();
							
							System.out.print(sb+" ");
			
						} 
			
			else {
				
				
				System.out.print(w.toUpperCase()+" ");
			}

			
	 
				
		}

		return str;

	}

	public static void main(String[] args) {
		
		 

		System.out.println(changeWords("This is A Test string"));

	}

}
