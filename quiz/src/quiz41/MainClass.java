package quiz41;

public class MainClass {

	public static void main(String[] args) {

		Video v = new Video();
		Download d = new Download();
		
		Thread t1 = new Thread(v);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	}

}
