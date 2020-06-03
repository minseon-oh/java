package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		//charAt - 문자열 인덱스 번호 자르기
		String str = "안녕하세요";
		char a = str.charAt(0);
		System.out.println(a);
		
		//indexOf - 문자열을 찾아서 인덱스를 반환
		int i = str.indexOf("요");
		System.out.println(i);
		
		//lenght (!중요!)
		System.out.println("문자열 길이: " + str.length());
		
		//replace - 특정 문자열의 변경 (!중요!)
		String str2 = "자바는 재밌습니다. 자바는 커피집 이름입니다.";
		String result = str2.replace("자바", "JAVA");
		System.out.println(str2);
		System.out.println(result);
		
		//공백제거 (!중요!)
		result = result.replace(" ", ""); //공백을 공백없음으로 바꾼다.
		System.out.println(result);
		
		//substring - 문자열 자르기 (!중요!)
		String str3 = "123123-4564564";
		String result2 = str3.substring(7); //매개값으로 준 숫자의 미만으로 제거 (매개값 한개는 숫자제거)
		System.out.println(result2);
		
		String result3 = str3.substring(0, 6); //0부터 6미만까지 만 추출하고 나머지는 제거 (매개값 두개는 숫자추출)
		System.out.println(result3);
		
		//trim - 앞 뒤 공백 제거
		String str4 = "		홍길동 ";
		str4 = str4.trim();
		System.out.println(str4);
		
		//valueOf - 기본형을 문자열로 변경. static메서드이다.
		System.out.println(String.valueOf(3) + String.valueOf(4)); //-> 결과는 34출력. 문자열로 변경되었으니까~~
		
		//split - 문자열 자르기 (!중요!)
		String str5 = "010-1234-5678";
		String[] arr = str5.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str5.split("-", 2); //두번 째 매개값은 배열의 길이 제한. 2니까 배열이 2크기.
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
