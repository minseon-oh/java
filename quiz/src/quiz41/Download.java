package quiz41;

public class Download implements Runnable{
	int finish;
	@Override
	public void run() {
		System.out.print("동영상 다운로드: ");
		for(int i=1; i<=finish; i++) {
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n다운로드완료");
	}

}
