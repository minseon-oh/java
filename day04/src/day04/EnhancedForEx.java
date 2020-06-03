package day04;

import java.util.Arrays;

public class EnhancedForEx {

	public static void main(String[] args) {
		//향상된 for문
		int[] arr = {1,2,3,4,5};
		
		for(int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "토", "일"};
		
		for(String s : arr2){
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		int[] score = {33, 55, 45};
		//합계, 평균(소수점 2자리수까지만) 출력
		
		int a = 0;
		for(int i: score) {
			a += i;
		}
		double avg = (double) a / score.length;
		System.out.println("합계: " + a);
		System.out.println("평균: " + avg);
		System.out.printf("평균: %.2f\n",avg);
		System.out.println("평균: " + (int)(avg * 100) / 100.0 );

		
	}

}
