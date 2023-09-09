package stringMethodsPrograms;

import java.util.Scanner;

public class PrintLastNameAndFisrtLetterInFirstName {

	/*
	 * write a java program to print lastname in first and firstname first letter as
	 * below following way
	 * 
	 * input:FitrName :Steve input2:lastname :jobs
	 * 
	 * 
	 * output: jobs.S
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a first name");

		String fname = scan.next();

		System.out.println("enter a last name");

		String lname = scan.next();

		int index = 0;

		for (int i = 0; i < fname.length(); i++) {

			index++;
			char ch = fname.charAt(i);

			if (index == 1) {

				System.out.println(lname+"."+ch);

			}

		}

	}

}
