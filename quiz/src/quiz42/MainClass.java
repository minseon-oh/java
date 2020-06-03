package quiz42;

public class MainClass {
	/*
	 * 스레드 객체 3개생성
	 * run()메서드 안에서는 랜덤값을 이용하여 개표진행사항을 화면에 출력
	 * 
	 * 조건: 개표율이 100 넘어가면안됨.
	 */
	
	public static void main(String[] args) {
		
		Location1 lo1 = new Location1();
		Location2 lo2 = new Location2();
		Location3 lo3 = new Location3();
		lo1.start();
		lo2.start();
		lo3.start();
		
		
	}

}
