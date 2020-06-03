package quiz21;

public class MainClass {

	public static void main(String[] args) {
		
		Unit m = new Marine();
		Unit t = new Tank();
		DropShip d = new DropShip();
		
		d.move(10, 10);
		d.ride(m);
		d.ride(t);
		d.ride(m);
		d.ride(m);
		d.ride(m);
		d.ride(m);
		d.move(3, 3);
		m.location();
		


		

		
		

	}

}
