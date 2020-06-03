package exception.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i + j);
		
		try {
			System.out.println(i / j);
			System.out.println("예외발생 시 이 문장은 실행되지 않는다.");
			//catch뒤에는 해당 예외를 처리할 예외의 종류 클래스를 선언한다.
			//Exception은 모든 예외를 처리할 수 있다.
		} catch (Exception e) {
			System.out.println("0으로 나누지마");
		}
		
		System.out.println(i - j);
		
	}

}
