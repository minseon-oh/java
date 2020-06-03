package day04;

public class DoWhileEx01 {

	public static void main(String[] args) {
		//while
		int i = 1;
		int sum2 = 0;
		while(i <= 10) {
			
			System.out.print(i + " ");
			sum2 += i;
			
			i++;
		}
		System.out.println("\n1~10까지 합: " + sum2);
		
		System.out.println("-------------------------");
		
		//do~while
		int j = 1;
		int sum = 0;
		do {
			
			System.out.print(j + " ");
			sum += j;
			
			j++;
		}while(j <= 10);
		System.out.println("\n1~10까지 합: " + sum);
		
		
	}

}
