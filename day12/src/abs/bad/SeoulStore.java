package abs.bad;

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
	public void melon() {
		System.out.println("서울 지점의 멜론가격은 700원 입니다");
	}
	//프로그래머가 실수로 메서드 재정의를 빼먹었다면..?

}
