package dsaBitManipulation;

public class ConvertLowercaseToUpperCase {
	
	
	
	public static String convertUpperCase(String s) {
		
		
		String ss ="";
		
		for(int i =0;i<s.length();i++) {
		char ch =s.charAt(i);
		
	        ss=ss+(char)(s.charAt(i)^32);
		
		}
		
	
		
		return ss;
	}

	public static void main(String[] args) {
		
		
		
		System.out.println(convertUpperCase("rajashekar"));

	}

}
