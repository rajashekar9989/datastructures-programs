package stringMethodsPrograms;


// input :java is super

// ouput: repus si avaj;

public class RvereseWordsInString {

	public static void main(String[] args) {
		
		String s ="java is super";
		
		char [] ch = s.toCharArray();
		
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			
			
		}

	}

}
