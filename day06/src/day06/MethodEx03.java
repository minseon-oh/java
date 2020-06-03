package day06;

public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 * 반환유형 (return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type이다.
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용된다.  ex)println(메서드호출);
		 * 3. 반환값이 없는 경우는 반환유형 자리에 void라고 적는다.
		 * 4. 모든 메서드는 return을 만나면 강제 종료된다.
		 * 		때문에 리턴아래에 코드를 작성할 수 없다.
		 */
		
		//메서드의 매개변수 안에 메서드 호출 가능.
		int result = add(add (1, 2), 5);
		System.out.println("결과: " + result);
		
		System.out.println( add (1, 2) );
		
		//반환유형이 없는 void는 단순히 호출만 가능하다.
		//돌아오는 return값이 없기 때문에.
		sub(5, 2);
//		System.out.println( sub (5, 2) ); => (x)
//		int result2 = sub(5, 2); => (x)
		
		multi();
		
		noReturn("똑똑이");
		
		
	}//main끝
	
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환유형이 없는 메서드  void
	static void sub (int a, int b) {
		System.out.println(a + "-" + b + "=" + (a-b));
	}
	
	//반환유형이 없고 매개변수도 없는 메서드 (안에서 처리하여 출력 작업만 가능)
	static void multi() {
		System.out.println("5 x 3 = 15");
		return;
	}
	
	//void유형도 return이 사용가능하다. 리턴의 뜻이 두가지이기 때문. 1값의반환, 2메서드종료.
	static void noReturn(String s) {
		
		if(s.equals("똑똑이")) {
			System.out.println("똑똑한 사람");
			return; //메서드 종료
		}
		
		System.out.println(s + "문자열이 아니고 똑똑이를 입력하세요");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
