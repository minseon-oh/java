package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//sort로 꼭 오름차순 정렬을 해야한다.
		Arrays.sort(arr);
		
		//배열의 검색(선행조건: 오름차순정렬)
		int index = Arrays.binarySearch(arr, 5);
		System.out.println("5가 있는 위치: " + index);
		
		int index2 = Arrays.binarySearch(arr, 10);
		System.out.println("10가 있는 위치: " + index2); //찾는 값이 없다면 쓰레기값을 돌려준다.
		
		//배열복사
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		int[] copyArr2 = Arrays.copyOf(arr, 3);
		int[] copyArr3 = Arrays.copyOfRange(arr, 3, arr.length);
		
		//배열 문자열확인
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.toString(copyArr2));
		System.out.println(Arrays.toString(copyArr3));
		
		//배열의 내부요소가 동일한지 확인
		if(Arrays.equals(arr, copyArr)) {
			System.out.println("배열 요소가 같다");
		}
		
		Arrays.asList(arr);
		
		
		
	}

}
