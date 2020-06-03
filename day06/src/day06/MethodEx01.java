package day06;

public class MethodEx01 {
	
	public static void main(String[] args) {
		
		/*
		 * 메서드는 메서드 내부에 선언할 수 없다.
		 * main 밖, class 안에 어디서든 선언 가능. 
		 */
		
		//메서드의 사용: 메서드의 이름
		System.out.println("1~100까지의 합: " + calSum());
		
		//메서드 값을 변수에 다시 저장도 가능
		int result = calSum();
		System.out.println("1~100까지의 합: " + result);
		
		String result2 = randomStr();
		System.out.println("A~Z 결과: " + result2);
		
		String result3 = randomStr2();
		System.out.println("랜덤 가위바위보: " + result3);
		
	}//main 끝

	//메서드생성: 값의 타입 - 이름 - 소괄호(매개변수) - 중괄호(코드)  **값의 타입을 쓰면 타입에 맞는 리턴을 꼭 써야한다.
	static int calSum () { 
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}// calSum 끝
	
	static String randomStr () {
		
		String str = "";
		for(char c='A'; c<='Z'; c++) {
			str += c;
		}
		
		return str;
	}// randomStr 끝
	
	static String randomStr2() {
		double d = Math.random();
		
		//가위바위보 랜덤값
		//if구문 안에서는 따로 변수를 선언하여 마직막에 리턴값을 줄 필요없이 바로 리턴값을 줄 수 있다.
		if(d > 0.66) {
			return "가위";
		}else if (d > 0.33) {
			return "바위";
		}else {
			return "보";
		}
		
	}//randomStr2끝
	
}
