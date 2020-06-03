package quiz;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		/*
		 * participant는 마라톤 참가자 명단
		 * completion는 완주자 명단
		 * 
		 * completion는 participant의 길이보다 -1이 작다
		 * 참가자는 동일 인물이 있을 수 있다.
		 * 어떤 배열이 주어지던 간에 마라톤을 완주하지 못한 이름을 찾아내는 메서드 작성
		 * 
		 */
		
		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당", "이순신"};
		String[] completion = {"홍길자", "홍길동", "신사임당", "이순신"};
		
		
		System.out.println("완주하지 못한 사람: " + solution(participant, completion));
	}
	
	static String solution(String[] arr, String[] arr2) {
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i=0; i<arr2.length; i++) {
			if(arr[i] != arr2[i]) {
				return arr[i];
			}
		}
		return "x";
	}


}
