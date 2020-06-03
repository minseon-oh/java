package quiz20;

public class Circle extends Shape{
	//getArea()는 원의 넓이를 계산하도록 오버라이딩.
	//main에서 확인
	private int radius;
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * 3.14;
	}
	

}
