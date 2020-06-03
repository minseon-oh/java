package quiz22;

public class Calculating extends Child{
	
	@Override
	public int child1() {
		return RICE + BULOGOGI;
	}

	@Override
	public int child2(int a) {
		if(a == YOGURT) {
			a = YOGURT;
		}else if(a == ICECREAM) {
			a = ICECREAM;
		}else if(a == MILK) {
			a = MILK;
		}
		return RICE + BULOGOGI + a;
	}

	@Override
	public int child3(int a, int b) {
		if(a == YOGURT) {
			a = YOGURT;
		}else if(a == ICECREAM) {
			a = ICECREAM;
		}else if(a == MILK) {
			a = MILK;
		}
		if(b == YOGURT) {
			b = YOGURT;
		}else if(b == ICECREAM) {
			b = ICECREAM;
		}else if(b == MILK) {
			b = MILK;
		}
		return RICE + BULOGOGI + a + b;
		
	}

}
