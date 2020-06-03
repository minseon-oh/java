package quiz42;

import java.util.Random;

public class Location3 extends Thread{

	@Override
	public void run() {
		Random r = new Random();
		int num = r.nextInt(11);
		
		while(true) {
			if(num >= 100) {
				System.out.print("location3개표율100%:");
				System.out.print("**********");
				System.out.println("\nlocation3개표완료");
				break;
			}
			System.out.print("location3개표율 " + num + "%:");
			for(int i=1; i<=num; i+=10) {
				System.out.print("*");
			}
			System.out.println();
			int num2 = r.nextInt(11);
			num += num2;
		}
	}
	
}
