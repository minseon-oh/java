package thread.runable;

public class MainClass {

	public static void main(String[] args) {
		//Runnable인터페이스를 구현하는 클래스를 스레드 클래스의 생성자로 전달해야한다.
		ThreadTest t = new ThreadTest();
		Thread thread = new Thread(t, "스레드1");
		thread.start();
		
		System.out.println("메인종료");

	}

}
