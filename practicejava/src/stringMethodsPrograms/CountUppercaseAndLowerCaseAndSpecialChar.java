package stringMethodsPrograms;

public class CountUppercaseAndLowerCaseAndSpecialChar {

	// write a java program to find the count of uppercase letters and lowercase
	// letters and special characters in given string.

	// input: JaVa5is&Su6p%eR

	// output : uppercase letters =4, lowercase letters =7, special char =2,digits=2;
	

	public static void main(String[] args) {

		String str = "JaVa5is&Su6p%eR";

		int lowerCount = 0, upperCount = 0, SpecialChar = 0, digitCount = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {

				upperCount++;

			}

			else if (ch >= 'a' && ch <= 'z') {

				lowerCount++;
			}

			else if (ch >= '0' && ch <= '9') {

				digitCount++;

			}

			else {

				SpecialChar++;

			}

		}
		
		
		System.out.println("upperCse letters are :"+upperCount);
		
		System.out.println("lower case letters are :"+lowerCount);
		
		System.out.println("digits are :"+digitCount);
		
		System.out.println("special characters are :" + SpecialChar);

	}

}
