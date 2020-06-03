package quiz29;

public class MathQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * Math.ceil을 사용하여 1~10이 전달되면 1이 반환되는 page메서드 생성
		 * 11~20이 전달되면 2가 반환
		 * 21~30은 3반환
		 */
		
		System.out.println(page(1.2));
		System.out.println(page(3.9));
		System.out.println(page(11.8));
		System.out.println(page(25.9));
		System.out.println(page(30));
	}
	
	public static int page(double d) {
		int num = (int)Math.ceil(d);
		int num2 = 0;
		
		if(num <= 10) {
			num2 = 1;
		}else if(num <= 20) {
			num2 = 2;
		}else if(num <= 30) {
			num2 = 3;
		}else {
			System.out.println("1부터 30사이의 값을 입력하세요");
		}
		
		return num2;
	}

}
