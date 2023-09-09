package stringMethodsPrograms;

public class ComaprareTwoStrings {

	/*
	 * compare to strings , if the characters in string 1 are present in string 2 ,
	 * then it
	 * 
	 * should be printed as such in output ,else '+' should be printed in output
	 * 
	 * input 1: NEW YORK input 2 : NWYR
	 * 
	 * output: N+W+Y+R+
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String s1 = "NEW YORK";

		String s = "NWY RGHF";
		
		char ch1;
		
		char ch;

		for (int i = 0; i < s1.length(); i++) {

			ch = s1.charAt(i);
			
			//System.out.println(ch);
			
			

			for (int j =0;j <s.length(); j++) {

				 ch1 = s.charAt(j);
				 
				
				 
				// System.out.println(ch1);
		      
				
				if (ch==ch1) {

					System.out.print(s1.charAt(i));
				}
				
				else {
					
					System.out.print("+");
				}

			
			}
			
			

			}
			// System.out.print(ch);	

		}
		
        

	}


