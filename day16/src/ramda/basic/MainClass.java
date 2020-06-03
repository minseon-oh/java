package ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.greeting(new Say01() {
			@Override
			public void talking() {
				System.out.println("안녕");
			}
		});
		
		p.greeting(new Say02() {
			@Override
			public String talking() {
				System.out.println("Hello");
				return "Hello";
			}
		});
		
		p.greeting(new Say03() {
			@Override
			public String talking(String greet) {
				System.out.println(greet);
				return greet;
			}
		});
		
		System.out.println("--------------------------------------");
		
		//익명객체 Say01이 구현해야할 추상메서드를 람다식으로 표현
		p.greeting(() -> {
			System.out.println("안녕하세요~");
		});
		
		p.greeting(() -> {
			System.out.println("Hello");
			return "Hello";
		});
		
		p.greeting((greet) -> { //람다식에서는 매개변수의 타입을 굳이 써주지 않아도 된다.
			System.out.println(greet);
			return greet;
		});
		
		//greeting 메서드를 실행하여 HiHiHi반환받는 람다표현식사용
		String result2 = p.greeting((word, i) -> {
			String result = "";
			for(int j=1, j<=i, j++) {
				result += word;
			}
			return result;
		});

	}

}
