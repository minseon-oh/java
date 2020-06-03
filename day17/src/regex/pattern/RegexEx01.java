package regex.pattern;

public class RegexEx01 {

	public static void main(String[] args) {

		String info = "홍길자|30세|서울시 강남구|010-1299-1234";
		//전화번호 형식만 찾아서 ***로 변경하라.
		
		//   \:탈출문으로 인식.그래서 슬래시 두개붙임.
		String pattern = "\\d{3}-\\d{3,4}-\\d{4}";
		
		//매개변수 regex인 메서드는 정규표현식 패턴을 적용할 수 있다는 뜻
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);

	}

}
