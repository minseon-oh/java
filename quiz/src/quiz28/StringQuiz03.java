package quiz28;

public class StringQuiz03 {

	public static void main(String[] args) {
		/*
		 * 아이티뱅크 친구 네오는 palindrome()함수를 만들었습니다.
		 * -매개변수로 String 값을 받아서 회문여부를 검사하는 메서드이다.
		 * ex) 다시 합창 합시다, 아 좋다좋아, 다시다
		 * 
		 * 매개변수를 공백을 포함해서 받을 수 있다
		 * 회문이라면 return "회문입니다"를 반환
		 * 아니면 아닙니다 반홤
		 */
		
		System.out.println(palindrome("바보"));
		System.out.println(palindrome("아 좋다 좋아"));
		System.out.println(palindrome("다시다"));
		System.out.println(palindrome("멍충이"));
		

	}
	
	//일반스트링
//	public static String palindrome(String s) {
//		s = s.replace(" ", "");
//		int num = s.length() -1;
//		
//			for(int i=0; i<s.length(); i++) {
//				char c1 = s.charAt(i); 
//				char c2 = s.charAt(num);
//				if(c1 == c2) {
//					num--;
//				}else {
//					return "회문이 아닙니다.";
//				}
//			}
//		return "회문입니다.";
//	}
	
	//버퍼타입
	public static String palindrome(String s) {
		s = s.replace(" ", "");
		StringBuffer sb = new StringBuffer(s);
		
		String result = sb.reverse().toString();
		//toString을 사용하여 스트링타입으로 바꿈.
		//버퍼타입은 스트링타입이 아니기때문에 equals를 사용하게되면 주소값을 비교하게된다.
		
		if(s.equals(result)) {
			return "회문입니다";
		}
	return "회문이 아닙니다.";
}

}
