package day01;

public class SystemOut {
	
	public static void main(String[] args) {
		//main + ctrl + space : main함수 자동생성
		
		/*
		 * 이것은 여러줄 주석
		 * 코드실행 단축키: ctrl + F11
		 * sysout 또는 sout 또는 syso + ctrl + space : println()메서드 자동생성
		 * 
		 * 정렬: ctrl + a, ctrl + i
		 * 코드 옮길 때: alt + 방향키
		 * 동일한 이름의 변수를 동시 변경: alt + shift + r
		 */
		
		//개행을 포함하는 println()
		System.out.println("안녕하세요"); //println: 자동 줄바꿈
		System.out.println("반갑습니다");
		
		//개행이 없는 print()
		System.out.print("줄바꿈이 없음\n");
		
		//형식지정 출력문 printf(): %s(문자), %d(정수), %f(실수, %.2f(표시할 소수점의 자리수 표시)), \t(8칸띄어쓰기), \n(줄개행)
		System.out.printf("안녕하세요 제 이름은 %s이고 오늘 날짜는 %d월 %d일 입니다.\n","홍길동",3,23);
		System.out.printf("파이 값은 %.2f\n", 3.14);
		System.out.printf("%dx%d=%d\t %dx%d=%d\n", 2, 1, 2, 2, 2, 4);
	}

}
