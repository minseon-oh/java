package import_ex;

//import는 클래스 선언부 위에 패키지명을 포함한 전체경로를 적는다.
//import fruit.Apple;
//import fruit.Orange;

import fruit.*; //패키지안에 모든 클래스를 임폴트한다.

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;

public class MainClass {
	
	public static void main(String[] args) {

		Apple a = new Apple();
		Orange o = new Orange();
		
		ABC abc = new ABC();
		DEF def = new DEF();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------");
		int i = 1;
		System.out.println(i); //값
		System.out.println(a); //주소값
		System.out.println(o);
		
	}

}
