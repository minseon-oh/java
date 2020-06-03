package exception.myexception;

public class MainClass {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		try {   
			a.deposit(10000);
			a.withDraw(1000);
			a.withDraw(10000);
			a.deposit(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			a.getBalance();
		}
		
	}

}
