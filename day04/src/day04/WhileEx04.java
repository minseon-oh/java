package day04;

public class WhileEx04 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int i = 0;
		int sum = 0;
		while(i < arr.length) {
			
			System.out.print(arr[i] + " ");
			sum += arr[i];
			
			i++;
		}
		System.out.println("\n배열 요소의 합:" + sum);

	}

}
