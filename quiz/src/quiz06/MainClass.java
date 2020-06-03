package quiz06;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", 1, 80, 90, 50);
		Student s2 = new Student("홍길자", 2, 89, 93, 75);
		
		System.out.println(s1.name + "의 점수합계: " + s1.getTotal());
		System.out.println(s1.name + "의 점수평균: " + s1.getAvg());
		System.out.println("-----------------------");
		System.out.println(s2.name + "의 점수합계: " + s2.getTotal());
		System.out.println(s2.name + "의 점수평균: " + s2.getAvg());
		
		

	}

}
