package thread.runable;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		//스레드 클래스에 정의된 static메서드 사용가능
		System.out.println( Thread.currentThread().getName());
		System.out.println("스레드시작1");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
