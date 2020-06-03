package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		//while quiz10
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요>");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int i = 1;
		int j = 0;
		while(i <= num) {

			arr[j] = i;
			
			i++;
			j++;
		}
		
		System.out.println("배열 arr: " + Arrays.toString(arr));

	}

}
