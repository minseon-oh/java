package quiz;

public class Quiz12 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "#$%"};
		/*
		 * Math.random()을 이용하여 0~3랜덤수를 발생시킨다
		 * 해당 랜덤수를 배열의 index에 적용
		 * 선택된 단어가 한국어, 영어, 중국어인지 처리하라
		 */
		
		int r = (int)(Math.random()*arr.length);
		
		switch(arr[r]) {
		
		case "안녕":
			System.out.println(arr[0] + "은(는) 한국어 입니다");
			break;
		case "hello":
			System.out.println(arr[1] + "은(는) 영어 입니다");
			break;
		case "니하오":
			System.out.println(arr[2] + "은(는) 중국어 입니다"); 
			break;
		case "#$%":
			System.out.println(arr[3] + "은(는) 특수문자 입니다");
			break;
		}

	}

}
