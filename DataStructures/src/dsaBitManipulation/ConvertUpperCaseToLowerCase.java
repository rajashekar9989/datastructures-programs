package dsaBitManipulation;

public class ConvertUpperCaseToLowerCase {
	
	
public static String convertLowerCase(String s) {
		
		
		String ss ="";
		
		for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		
	        ss=ss+(char)(s.charAt(i)|32);
		
		}
		
	
		
		return ss;
	}

	public static void main(String[] args) {
		
		
		
		System.out.println(convertLowerCase("RAJASHEKAR"));

	}

}



