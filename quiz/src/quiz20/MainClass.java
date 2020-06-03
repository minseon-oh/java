package quiz20;

public class MainClass {
	
	public static void main(String[] args) {
		
		Shape r = new Rect("사각형", 5);
		System.out.println(r.getName() + "의 넓이는 " + r.getArea());
		
		Shape c = new Circle("원", 4);
		System.out.println(c.getName() + "의 넓이는 " + c.getArea());

		
	}

}
