package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		/*
		 * 가격형식 찾아서 순서대로 출력
		 * 
		 * *는 0회 이상반복: 있어도 되고 없어도 되는 경우
		 */
		String str = "헠4,500원 헿~~ 1,200원 어? 6000원윀 120000원";
		str = str.replace(",", "");
		Matcher m = Pattern.compile("\\w+원").matcher(str);
		
		while(m.find()) {
			System.out.println("시작 인덱스:" + m.start());
			System.out.println("끝 인덱스:" + m.end());
			System.out.println("찾은 값:" + m.group());
			System.out.println("-------------------");
		}
	}

}
