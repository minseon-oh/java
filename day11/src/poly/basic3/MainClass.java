package poly.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//다형성이 없다면?
//		Student hong = new Student("홍길동", 20, "123");
//		Student park = new Student("박찬호", 30, "456");
//		Student son = new Student("손흥민", 40, "789");
//		
//		Teacher lee = new Teacher("이승철", 50, "음악");
//		Teacher kim = new Teacher("김유신", 60, "역사");
//		
//		Employee choi = new Employee("최강창민", 20, "회계");
//		
//		Student[] arr1 = {hong, park, son}; //스튜던트에는 스튜던트에만.
//		Teacher[] arr2 = {lee, kim};
//		Employee[] arr3 = {choi};
//				
//		for(Student s : arr1) {
//			System.out.println(s.info());
//		}
		
		// 다형성 적용
		Person hong = new Student("홍길동", 20, "123");
		Person park = new Student("박찬호", 30, "456");
		Person son = new Student("손흥민", 40, "789");
		Person lee = new Teacher("이승철", 50, "음악");
		Person kim = new Teacher("김유신", 60, "역사");
		Person choi = new Employee("최강창민", 20, "회계");
		
		Person[] arr = {hong, park, son, lee, kim, choi};
		
		for(Person p : arr) {
			System.out.println(p.info());
		}
		
		System.out.println("----------------------------");
		House h = new House();
		h.setIn(hong);
		h.setIn(park);
		h.setIn(hong);
		h.setIn(son);
		h.setIn(lee);
		h.setIn(choi);
		
		
	}

}
