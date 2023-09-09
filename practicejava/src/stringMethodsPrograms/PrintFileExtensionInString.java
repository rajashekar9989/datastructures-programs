package stringMethodsPrograms;

import java.util.Scanner;

public class PrintFileExtensionInString {
	
	/* write a  java  program to print the file name extension in the console.
	 * 
	 * input: (FilleName)= passport.jpg   output:jpg
	 * 
	 * input: (FilleName)= panacrd.png   output:png
	 * 
	 * input: (FilleName)= resume.pdf   output:pdf
	 * 
	 *  
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		//File file = new File("/path/to/file.txt");

		// Get the file name
		
		
		
		Scanner scan = new Scanner(System.in);
		
	 System.out.println("Enter a file name");
		
		String fileName =scan.next();
		
		//String fileName = "passport.jpg";

		// Extract the extension from the file name
		
		int index = fileName.lastIndexOf('.');
		if (index > 0) {
			
		  String extension = fileName.substring(index+1);
		  System.out.println("extension of the file is : "+extension);
		
		
		}
//		String fileName ="passport.jpg";
//		
//		
//		fileName.replaceFirst(fileName,".");
//		
//		
//		System.out.println(fileName);

	}
}


