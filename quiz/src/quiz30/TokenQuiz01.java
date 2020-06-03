package quiz30;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1.스캐너를 통해 nextLine()문장받기
		 * 2.입력된 문자열을 토크나이저를 이용하여 공백기준으로 분리
		 * 3.분리한 토큰의 개수출력
		 * 4.분리한 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 * 5.분리된 문자열을 배열에 저장
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요>");
		String s = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(s);
		System.out.println("토큰의 개수: " + token.countTokens());
		int i = 0;
		String[] arr = new String[token.countTokens()];
		while(token.hasMoreTokens()) {
			String s2 = token.nextToken();
			arr[i] = s2;
			System.out.println((i+1) + ". " + s2);
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
