package day06;

public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 매개변수 (parameter)
		 * 1. 매개변수는 메서드 호출할 때 실행에 필요한 값을 전달하는 매개체이다.
		 * 2. 매개변수를 몇개 받을 지는 메서드를 선언할 때 결정한다.
		 * 3. 매개변수를 여러개 받을 때는 쉼표(,)로 연결한다.
		 * 4. 매개변수를 받지 않는다면 소괄호를 비워둔다.
		 */
		System.out.println("1~100까지 합: " + calSum(100)); //calSum(100) => 소괄호 안에 있는 숫자가 매개변수 int end의 값
		System.out.println("1~50까지 합: " + calSum(50));
		System.out.println("1~10까지 합: " + calSum(10));
		
		int result = calSum2(10, 20);
		System.out.println("10~20까지 합: " + result);
		System.out.println("10~20까지 합: " + calSum2(10, 20));
		
		String result2 = calSum3(1, 10, "가");
		System.out.println("결과: " + result2);
		
	}//main끝
	
	//매개변수는 메서드안에서 사용해도되고 안해도된다. 매개변수값은 메인에서 선언할 때 소괄호 안에 넣어주면 됨.
	static int calSum(int end) {
		
		int sum = 0;
		for(int i=1; i<=end; i++) {
			sum += i;
		}
		
		return sum;
	}//calSum끝
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		
		return sum;
		
	}//calSum2끝
	
	static String calSum3(int start, int end, String s) {
		
		String str = "";
		for(int i=start; i<=end; i++) {
			str += s;
		}
		
		return str;
		
	}//calSum3끝
	
}
