package quiz;

import java.util.Arrays;

public class Quiz26 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//1~9까지 절대 중복되지 않는 숫자로 만들어진 3개 크기의 배열을 만들어내는 프로그램
		//arr에서 절대 중복되지 않게 끔 3개의 숫자를 추출합니다
		//새로운 배열에 옮겨 담는다.
		
		//arr에서 임의의 요소를 뽑아서 0,1,2 인덱스로 옮긴다.
		//for문을 통해 0,1,2 인덱스의 값을 옮긴다.
		
//		int temp = 0;
//		for(int i=0; i<3 ; i++) {
//			int r = (int)(Math.random() * 9) + 1;
//			temp = arr[i];
//			arr[i] = arr[r];
//			arr[r] = temp;	
//		}
//		System.out.println(Arrays.toString(arr));

		
		//쌤풀이
		//arr에서 임의의 요소를 뽑아서 0,1,2 인덱스로 옮긴다.
		for(int i=0; i<arr.length; i++) {
			int j  = (int)(Math.random() * arr.length); //0~8
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		//for문을 통해 0,1,2 인덱스의 값을 옮긴다.
		int[] newArr = new int [3];
		for(int i=0; i<newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));

		
		
	}

}
