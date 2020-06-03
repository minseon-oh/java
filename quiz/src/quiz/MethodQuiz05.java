package quiz;

import java.util.Arrays;

public class MethodQuiz05 {

	public static void main(String[] args) {
		/*
		 * 1. 크기가 6인 배열에 1~45까지 중복되지 않는 램덤수를 출력하여 반환하는 
		 * 		lottoNum() 메서드를 생성하세요.
		 * 
		 * 2. lottoRun() 메서드는 1번에서 생성된 로또번호를 매개변수로 받아서,
		 * 		당첨되기 까지 금액을 구하는 메서드이다.
		 * 
		 * 랜덤한 로또번호를 무한히 생성하여, 매개변수로 전달받은 번호화 비교해서
		 * 당첨되기까지 실행된 금액을 반환하세요
		 * 
		 * 당첨의 조건(순서는 상관없이 같은 번호만 배열에 담겨있다면 됩니다.)
		 * 
		 */
		
		int[] arr = lottoNum();
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액: " + money);
		


	}//main
	
	static int[] lottoNum() {
		
		int[] arr = new int[6];
		
		start: for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*45) + 1;
			
			for(int j=0; j<=i; j++) {
				if(arr[j] == r) {
					i -= 1;
					continue start;
				}
			}
			arr[i] = r;
		}
		return arr;
	}//lottoNum()
	
	static long lottoRun(int[] arr) {
		
//		Arrays.sort(arr);
//		
//		int[] arr2 = new int[6];
//		
//		long money = 0;
//		int count = 0;
//		
//		end: while(true) {
//			
//			money += 1000;
//			count = 0;
//			
//			start: for(int i=0; i<arr2.length; i++) {
//				int r = (int)(Math.random()*45) + 1;
//				
//				for(int j=0; j<=i; j++) {
//					if(arr2[j] == r) {
//						i -= 1;
//						continue start;
//					}
//				}
//				arr2[i] = r;
//			}
//			Arrays.sort(arr2);
//			
//			for(int i=0; i<arr.length; i++) {
//				
//				if(arr[i] == arr2[i]) {
//					count++;
//				}
//				if(count == 6) {
//					break end;
//				}
//			}
//			
//		}
//		
//		return money;
		
		//---------------------------------------------------------------------
		
		long count = 0;
		Arrays.sort(arr);
		
		while(true) {
			int[] arr2 = lottoNum();
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr, arr2)) { //동일한 값을 가지고 있으면 true반환
				return count *= 1000;
			}else {
				count++;
			}
			
		}
		
	}// lottoRun()
	
	
	
	
	
	

}
