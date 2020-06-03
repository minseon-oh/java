package quiz;

public class Quiz22 {

	public static void main(String[] args) {
		
		//Math.random() 써서 2~9까지 랜덤수를 발생시키고 구구단 출력 (for문)
		
		int r = (int)(Math.random() * 8) + 2;
		
		System.out.println(r + "단");
		
		for(int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d = %d\n", r , i , (r*i));
			
		}
		
		
		
		
	}

}
