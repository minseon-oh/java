package abs.good;

public class BusanStore extends HeadStore{

	@Override
	public void apple() {
		System.out.println("부산 지점의 사과가격은 200원 입니다");
	}

	@Override
	public void banana() {
		System.out.println("부산 지점의 바나나가격은 300원 입니다");
	}

	@Override
	public void orange() {
		System.out.println("부산 지점의 오렌지가격은 400원 입니다");
	}

	@Override
	public void melon() {
		System.out.println("부산 지점의 멜론가격은 500원 입니다");
	}

}
