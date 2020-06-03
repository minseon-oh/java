package quiz05;

public class Account {
	
	String name;
	String password;
	int balace;
	
	Account(String aName, String aPassword, int aBalace){
		
		name = aName;
		password = aPassword;
		balace = aBalace;
	}
	//입금
	void deposit(int money) {
		balace += money;
	}
	//출금
	void withDrwa(int money) {	
		balace -= money;
	}
	//잔액
	int getbalance() {
		return balace;
	}

}
