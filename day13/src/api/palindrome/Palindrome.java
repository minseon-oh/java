package api.palindrome;

public class Palindrome {

	public static String palindrome(String s) {
		s = s.replace(" ", "");
		int num = s.length() -1;
		
			for(int i=0; i<s.length(); i++) {
				char c1 = s.charAt(i); 
				char c2 = s.charAt(num);
				if(c1 == c2) {
					num--;
				}else {
					return "회문이 아닙니다.";
				}
			}
		return "회문입니다.";
	}

}
