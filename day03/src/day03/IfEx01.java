package day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		//0~100까지 정수 랜덤값
		int point = (int)(Math.random() * 101);
		System.out.println("점수: " + point);
		
		if(point >= 60) { //한줄일 경우 중괄호 안써도됨. 두줄 부터는 꼭 중괄호 써야함.
			System.out.println("60점 이상입니다");
			System.out.println("합격입니다");
		}else {
			System.out.println("60점 미만입니다");
			System.out.println("불합격입니다");
		}
		
		

	}

}
