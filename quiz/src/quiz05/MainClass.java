package quiz05;

public class MainClass {
	
	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", "1234", 3600);
		
		myAcc.deposit(800);
		myAcc.withDrwa(1900);
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 계좌 잔액:" + bal + "원");
		
	}

}
