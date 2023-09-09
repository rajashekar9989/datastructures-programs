package stringMethodsPrograms;

public class CountCharacterInString {

	public static void main(String[] args) {
		
		String s ="Hello World";
		
		
		char [] ch =s.toCharArray();
		 int count =0;
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]== 'l') {
			
			count++;
			
		}
			}
		
		System.out.println("l  is occurred in given string is :"+count);
		
	}

}
