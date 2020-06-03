package quiz18;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyCart my = new MyCart(10000);
		Product radio = new Radio();
		Product tv = new Tv();
		Product com = new Computer();

		
		my.buy(radio);
		my.buy(radio);
		my.buy(radio);
		my.buy(tv);
		my.buy(com);
		
	}

}
