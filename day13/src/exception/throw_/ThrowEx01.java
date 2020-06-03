package exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		//예외 강제 발생 시키기 throw
		/*
		 * 메서드나 생성자 실행도중에 throw키워드를 만나면
		 * 즉시 throw로 생성한 예외가 발생한다.
		 * 
		 * 예외가 발생되면 실행되던 코드는 즉시 중단되고
		 * 예외를 처리할 수 있는 catch문으로 바로 이동.
		 */
		try {
			System.out.println("결과: " + calc(10));
			System.out.println("결과: " + calc(-10));
		} catch (Exception e) {
//			System.out.println(e.getMessage()); //예외발생시 전달할 예외 메시지를 얻어오는 기능
			e.printStackTrace(); //예외의 경로를 추적하는 메시지를 출력해준다.(예외원인을 찾을 때 매번 사용됨)
		}
		
		
	}
	
	public static int calc(int n) throws Exception{
		
		if(n <= 0) {
			throw new Exception("0보다 큰 값을 입력해야한다.");
		}
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}

}
