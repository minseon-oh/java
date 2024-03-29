package quiz11;

public class MyCart extends Cart{
	
	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화한다. tv = 300, com = 400, radio = 500원으로 초기화
	
	MyCart(int money){
		super();
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	
	//2. buy(), add(), info() 메서드를 오버라이딩한다.
	
	/*
	 * buy()의 기능
	 * 1.money가 300보다 작으면 "금액부족" 출력 후 메서드 종료.
	 * 		매개변수가 tv, com, radio가 아니면 "상품없음" 출력 후 종료
	 * 2.매개변수가 tv라면 금액에서 티비가격을 빼고 add(상품)을 호출
	 * 		매개변수가 com라면 금액에서 com가격 빼고 add(상품)을 호출
	 * 		매개변수가 radio라면 금액에서 radio가격 빼고 add(상품)을 호출
	 */
	
	void buy(String product) {
		if(money < 300) {
			System.out.println("금액부족");
			return; //종료
		}else if (!(product.equals("tv") || product.equals("com") || product.equals("radio"))) {
			System.out.println("상품없음");
			return; //종료
		}else {
			switch(product) {
			case "tv":
				money -= tv;
				break;
			case "com":
				money -= com;
				break;
			case "radio":
				money -= radio;
				break;
			default:
				break;
			}
		}
		add(product);//추가 메서드 호출
	}
	
//	void buy(String product) {
//		if(money < 300) {
//			System.out.println("금액부족");
//			return; //종료
//		}else if (!(product.equals("tv") || (product.equals("com") || (product.equals("radio"))) {
//			System.out.println("상품없음");
//			return; //종료
//		}else if (product.equals("com")) {
//			money -= com;
//			i++;
//			add("com");
//		}else if (product.equals("radio")) {
//			money -= radio;
//			i++;
//			add("radio");
//		}else {
//			System.out.println("상품없음");
//			//!(product.equals("tv") || (product.equals("com") || (product.equals("radio"))
//			// 3중에 하나가 아닐경우
//			return; //종료
//		}
//		
//	}
	
	/*
	 * add()의 기능
	 * 1.만약 i의 값이 장바구니의 크기보다 같거나 크다면 
	 * 		-기존의 장바구니보다 크기가 두배 큰 배열을 생설
	 * 		-기존의 장바구니 값을 새로운 배열에 복사
	 * 		-새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2.product를 장바구니에 담는다.
	 * 3.info()메서드를 호출
	 * 
	 */
	
	void add(String product) {
		if(i >= cart.length) {
			String[] cart2 = new String[cart.length * 2];
			for(int j=0; j<cart.length; j++) {
				cart2[j] = cart[j];
			}
			cart = cart2;
		}
		cart[i-1] = product;
		
		info();
	}
	
	/*
	 * info()의 기능
	 * 1.물건을 사고 남은 금액을 구하고
	 * 2.장바구니에 담긴 물건 목록을 반환 +남은 금액을 더해서 반환
	 * 3.메인에서 buy()를 실행시킨다.
	 * 
	 */
	
	void info() {
		System.out.println("---장바구니에 담긴 물건 목록---");
		for(int j=0; j<i; j++) {
			System.out.println(cart[j]);
		}
		System.out.println("남은 금액: " + money);

	}
	
	
}
