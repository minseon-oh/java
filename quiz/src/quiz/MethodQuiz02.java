package quiz;

import java.util.Arrays;

public class MethodQuiz02 {

	public static void main(String[] args) {
		// (method)Quiz17  p.24
		
		int[] arr = {1,2,3,4,5};
		
		method01();
		System.out.println(method02("잘가"));
		System.out.println(method03(9, 10, 30));
		System.out.println(method04(5));
		System.out.println(method05(10, "Hi"));
		System.out.println(method06(10));
		System.out.println(method07(arr));
		System.out.println(Arrays.toString(method08("강아지", "고양이")));
		System.out.println(maxNum(10,150));
		System.out.println(abs(5));
		
		
		
	}//main

	static void method01() {
		System.out.println("안녕");
	}
	
	static String method02(String s) {
		return s;
	}
	
	static double method03(int a, int b, double c) {
		return a+b+c;
	}
	
	static String method04 (int i) {
		if(i % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	
	static String method05 (int num, String s) {
		
		String str = "";
		for(int i=1; i<=num; i++) {
			str += s;
		}
		return str;
	}
	
	static int maxNum(int a, int b) {
//		if(a > b) {
//			return a;
//		}else {
//			return b;
//		}
		
		//쌤풀이
		return a > b? a : b;
	}
	
	static int method06 (int a) {
		int total = 0;
		for(int i=0; i<=a; i++) {
			total += i;
		}
		return total;
	}
	
	static int method07(int[] arr) {
//		int a = arr.length;
//		return a;
		return arr.length;
	}
	
	static String[] method08(String a, String b) {
		String[] s = {a, b};
		return s;
	}
	
	static int abs(int a) {
		if(a < 0) {
			return -a;
		}else {
			return a;
		}
	}
	
}
