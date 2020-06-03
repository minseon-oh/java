package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int x = ran.nextInt();
		System.out.println(x); //int범위까지
		
		int x1 = ran.nextInt(10) + 1;
		System.out.println(x1);//1~10까지
		
		double y = ran.nextDouble();
		System.out.println(y); //0~1.0까지 실수범위
		
		boolean b = ran.nextBoolean();
		System.out.println(b);
		

	}

}
