package quiz03;

public class MainClass {

	public static void main(String[] args) {
		// 현실에서 찾아볼 수 있는 물건, 생각해서 클래스로 표현. 2개이상.
		// 멤버변수 3개이상, 메서드 3개이상
		// 생성하여 사용
		
		Calculater c1 = new Calculater();
		
		c1.a = 2;
		c1.b = 3;
		
		c1.plus();
		c1.minus();
		c1.multiply();
		c1.division();

	}

}
