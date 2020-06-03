package encap.bad;

public class MainClass {
	
	public static void main(String[] args) {
		//멤버변수를 public 으로 선언하면 잘못 된 값이 선언될 수있다.
		MyDate me = new MyDate();
		me.year = 2020;
		me.month = 13;
		me.day = 100;
		me.ssn = "이게뭐죠?";
		
		me.info();
	}

}
