package quiz29;

import java.util.Arrays;

public class ArraysQuiz01 {

	public static void main(String[] args) {

		String[] participant = {"홍길동", "홍길자", "이순신", "신사임당", "이순신"};
		String[] completion = {"홍길자", "홍길동", "신사임당", "이순신"};
		
		System.out.println("완주하지 못한 사람: " + solution(participant, completion));

	}
	public static String solution(String[]participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[participant.length-1];
	}

}
