package fileHandlingPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromFile {

	public static void main(String[] args) {
		
		
		// read a data 
		try {
			File myObj = new File("D:\\raj.txt");
					//File myObj = new File("D:\\raj.txt");
					
					Scanner myReader = new Scanner(myObj);
					
					while(myReader.hasNextLine()) {
					
					String data = myReader.nextLine();
					
					System.out.println(data);
					
					
					}
					myReader.close();
					
					
					
					
					
					
				} catch (FileNotFoundException e) {

					e.printStackTrace();
				}
				
			}

	}


