package day04;

public class ContinueEx01 {

	public static void main(String[] args) {

		
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 0) {
				continue; //다시 증감식으로 올라간다.for(int i=1; i<=10; i++)로. break는 빠져나간다.
			}
			
			System.out.println(i);

		}
		
		System.out.println("----------------------------------------");
		
		int i = 1;
		while(i <= 10) {
			
			if(i % 2 == 0) {
				i++;
				continue; //조건식으로 올라감. while(i <= 10)로.
			}
			
			System.out.println(i);
			
			i++;
		}
		
		
	}

}
