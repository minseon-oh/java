package quiz;

import java.util.Arrays;

public class Quiz31 {

	public static void main(String[] args) {
		
		//for문을 이용하여 오름차순 정렬
		
		int[] arr = {5,23,1,43,100,200,40};
//		
//		int temp = 0;
//		
//		for(int i=0; i<arr.length-1; i++) {
//			
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//			
//		}
		
		Arrays.sort(arr); //오름차순 정렬
		System.out.println(Arrays.toString(arr));

	}

}
