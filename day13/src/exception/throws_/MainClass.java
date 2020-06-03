package exception.throws_;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외 발생");
		}

	}

}
