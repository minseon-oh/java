package static_.basic;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * 1. 녹색, 빨강 계산기를 각각생성
		 * 2. 계산기 색상을 확인하라
		 * 3. add(int a)메서드를 추가
		 * 4. result값도 각각 확인
		 * 5. pi와 circle() 사용해서 원의 넓이를 구해라
		 * 
		 */
		
		Calculator cal1 = new Calculator();
		cal1.setColor("빨강");
		Calculator cal2 = new Calculator();
		cal2.setColor("초록");
		
		cal1.add(1);
		cal2.add(10);
		
		System.out.println(cal1.getColor());
		System.out.println(cal1.getResult());
		System.out.println(cal1.circle(2));
		
		System.out.println(cal2.getColor());
		System.out.println(cal2.getResult());
		System.out.println(cal2.circle(3));
		
		int[] arr = {1,2,3};
		ArrayPrint.printArray(arr);

	}
	

}
