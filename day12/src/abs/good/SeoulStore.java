package abs.good;

public class SeoulStore extends HeadStore{
	
	@Override
	public void apple() {
		System.out.println("서울 지점의 사과가격은 500원 입니다");		
	}

	@Override
	public void banana() {
		System.out.println("서울 지점의 바나나가격은 600원 입니다");		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점의 오렌지가격은 700원 입니다");		
	}

	@Override
	public void melon() {
		System.out.println("서울 지점의 멜론가격은 800원 입니다");		
	}

}
