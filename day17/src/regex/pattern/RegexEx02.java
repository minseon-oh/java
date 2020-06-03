package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {

	public static void main(String[] args) {
		/*
		 *  \\w 영문자와 숫자 찾음
		 *  \\w+ 영숫자 여러개
		 *  
		 *  \\d 숫자를 찾음
		 *  \\d+ 숫자 여러개
		 *  
		 *  \\d{3} 숫자 3개를 찾음
		 *  \\d{3,4} 숫자 3이상 4이하
		 *  
		 *  [0-9] 0-9사이 문자 1개를 찾음
		 *  [A-Z] A-Z사이 문자 1개를 찾음
		 *  [a-z] a-z사이 문자 1개를 찾음
		 *  [가-힣] 한글 1개 찾음
		 *  [가-힣]+ 한글 여러개 찾음
		 *  
		 */
		String info = "30세/서울시 강남구/02-123-4567/010-2345-6789/kkk@naver.com";
		
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		while(m.find()) { //info문자열에서 정규표현 패턴을 찾아서 true, false를 반환
			System.out.println("찾은 인덱스:" + m.start()); //찾은 인덱스
			System.out.println("끝 인덱스:" + m.end()); //끝 인덱스
			System.out.println("찾은 값:" + m.group()); //찾은 값
		}
		
		System.out.println("---------------------------------------");
		
		//이메일 형식 찾기
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		while(m2.find()) {
			System.out.println("찾은 인덱스:" + m2.start()); //찾은 인덱스
			System.out.println("끝 인덱스:" + m2.end()); //끝 인덱스
			System.out.println("찾은 값:" + m2.group()); //찾은 값
		}
		
		
		
	}

}
