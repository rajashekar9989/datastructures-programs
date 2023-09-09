package stringMethodsPrograms;

import java.util.Arrays;

public class FindMaxWordsInString {

	// write a java program to find the max length-word in a given String

	// (if two words are same length then return the first occurring word of max
	// length

	// input : hello how are you mooooommmmm output:mooooommmmm

	// input : hello how are you reddy output:hello

	public static String getLongestString(String[] array) {
		int maxLength = 0;
		String longestString = null;
		for (String s : array) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}
		return longestString;
	}

	public static void main(String[] args) {
		String[] toppings = { "Cheese", "Pepperoni", "Black Olives","moooommmmmmmmm"};
		String longestString = getLongestString(toppings);
		System.out.format("longest string: '%s'\n", longestString);
	}

	}

//	String words = "hello how are you mooooommmmm";
//
//	// System.out.println(Arrays.toString(words.split(" ")));
//
//	String[] str = words.split(" ");
//
//	// System.out.println(str.length);
//
//	int maxLength = 0;
//	String longestString = null;
//
//	for(
//	String name:str)
//	{
//
//		if (name.length() > maxLength) {
//
//			maxLength = name.length();
//
//			longestString = name;
//
//			System.out.println(longestString);
//
//		}
//
//	}
//
//}
//
//}
