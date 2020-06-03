package exception.myexception;

public class Account {
	
	/*
	 * 1.잔액(balance:long)으로 멤버변수를 선언 private
	 * 2.deposit 입금기능
	 *   withDraw 출금기능
	 *   getBalance: long 잔액확인기능
	 * 
	 * 3.withDraw에서 잔액이 출금금액보다 작다면 예외를 발생시키는 코드를 작성.
	 * 
	 */
	
	private long balance;

	public long getBalance() {
		System.out.println("잔액: " + balance);
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long money) {
		System.out.println(money + "원을 입금합니다.");
		return balance += money;
	}
	
	public long withDraw(long money) throws Exception{
		if(balance < money) {
			throw new Exception("잔액이 부족합니다");
		}
		System.out.println(money + "원을 출금합니다.");
		return balance -= money;
	}

}
