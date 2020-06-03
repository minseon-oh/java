package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSeat {

	public static void main(String[] args) {
		/*
		 * 1. 사람 수를 입력받을 수 있다.
		 * 2. 입력받은 사람 수 만큼 랜덤값을 생성하여 배열에 중복되지 않게 저장한다.
		 * 
		 * 3. 해당배열의 크기만큼 ○으로 출력하라.
		 * 4. 스캐너를 통하여 랜덤으로 배정된 좌석을 선택할 수 있다.
		 * 5. 제대로 선택 된 좌석이라면 자리번호를 공개하고, 제대로 선택되지 않은 좌석이라면 "경고문을 띄워주세요"
		 * 
		 * 6. 선택 된 자리는 ●로 다시 표시.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("* 사람 수를 입력하세요>");
		int people = sc.nextInt();
		
		int[] arr = new int[people];
		String[] arr2 = new String[people];
		
		int a = 1;
		for(int i=0; i<arr.length; i++) {
			arr[i] += a;
			a++;
		}
		
		for(int i=0; i<arr.length; i++) {
			int j  = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = "○";
		}

		int count = 0;
		start: while(true) {
			for(int i=1; i<=arr2.length; i++) {
				if(i <= 9) {
					System.out.print(i + "  ");
				}else {
					System.out.print(i + " ");
				}
			}
			System.out.println();
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i] + "  ");
			}
			if(count >= arr2.length){
				System.out.println("\n[모든 좌석이 선택되었습니다. 더이상 좌석을 선택 할 수 없습니다.]");
				break start;
			}
			
			System.out.println("\n--------------------");
			System.out.println("* 자리를 선택하세요.>");
			int num = sc.nextInt();
			
			
			if(num <= 0 || num > arr2.length) {
				System.out.println("[번호를 잘 못 입력하였습니다.]");
				continue start;
			}else if(arr2[num-1] == "●") {
				System.out.println("[이미 선택 된 좌석입니다.]");
				continue start;
			}else{
				System.out.println("* 선택한 자리: " + arr[num-1]);
				arr2[num-1] = "●";
				count++;
			}

		}
		
		
	}

}
