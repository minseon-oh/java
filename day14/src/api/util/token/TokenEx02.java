package api.util.token;

import java.util.StringTokenizer;

public class TokenEx02 {

	public static void main(String[] args) {
		
		String log = "2020.04.16, 목요일, /bno=30, user=홍길동;";
		
		StringTokenizer token1 = new StringTokenizer(log, ","); //공백포함하여 쉼표기준으로 자르기
		while(token1.hasMoreTokens()) {
			System.out.println(token1.nextToken());
		}
		
		System.out.println("-------------------------------------");
		
		StringTokenizer token2 = new StringTokenizer(log, ",./"); //공백포함하여 ,./기준으로 자르기
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("-------------------------------------");

		StringTokenizer token3 = new StringTokenizer(log, ",", true); //기본공백에 쉼표구분자도 토큰에 포함시킴. false를 반환하면 포함안함.
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}

	}

}
