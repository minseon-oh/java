package quiz09;

public class MainClass {
	
	public static void main(String[] args) {
		
		Calculater cal = new Calculater();
		cal.add(1);
		System.out.println("cal의 누적값: " + cal.result);
		cal.add(2,3);
		System.out.println("cal의 누적값: " + cal.result);
		cal.add(1,2,3);
		System.out.println("cal의 누적값: " + cal.result);
		cal.add(1,2,3,4);
		System.out.println("cal의 누적값: " + cal.result);
		
		System.out.println("---------------------------");
		
		ArrayPrint ap = new ArrayPrint();
		String[] sArr = {"홍길동", "이순신", "김길동"};
		int[] iArr = {1,2,3};
		char[] cArr = {'가', '나'};
		
		System.out.println(ap.printArray(sArr));
		System.out.println(ap.printArray(iArr));
		System.out.println(ap.printArray(cArr));
	}

}
