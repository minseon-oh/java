package quiz;

public class MethodQuiz04 {
	public static void main(String[] args) {
		// (method)Quiz19  p.26
		System.out.println(sum(6));
		
		// (method)Quiz20  p.27
		System.out.println("소수의 개수: " + primeNum(6));
		
		//(method)Quiz21  p.28
		System.out.println("7~9의 사이의 수 합: " + sumNum(7, 9));
		System.out.println("9~7의 사이의 수 합: " + sumNum(9, 7));
		System.out.println("5~5의 사이의 수 합: " + sumNum(5, 5));
	}
	
	// Quiz19
	static int sum (int n) {
		int total = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) 
				total += i;
		}
		
		return total;
	}
	
	// Quiz20
	static int primeNum(int a) {
		int count = 0;
		int total = 0;
		for(int i=2; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
				if(count == 2) {
					total++;
				}
			}
			
		}
		
		return total;
	}
	
	// Quiz21
	static int sumNum(int a, int b) {
		int total = 0;
		
		if(a > b) {
			for(int i=b; i<=a; i++) {
				total += i;
			}
		}else if(a < b) {
			for(int i=a; i<=b; i++) {
				total += i;
			}
		}else {
			return a;
		}
		  
		
		return total;
	}
	
}
