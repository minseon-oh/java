package inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Dog baduk = new Dog();
		Cat nabi = new Cat();
		Tiger hodol = new Tiger();
		
		//1. Animal[] 생성 후 바둑, 나비, 호돌을 저장한 후 향상된 포문으로 Animal의 공통 기능을 출력
		Animal[] a = {baduk, nabi, hodol};
		for(Animal an : a) {
			an.eat();
		}
		
		//2. IPet[] 생성 후 바둑, 나비, 금붕어를 저장하고 향상된 포문으로 출력
		//바둑이는 애니멀 타입이지만, 하위클래스가 상호연관이 있다면 형변환이 가능.
		IPet[] i = new IPet[3];
		i[0] = (IPet)baduk;
		i[1] = (IPet)nabi;
		i[2] = new GoldFish();
		for(IPet ip : i) {
			ip.play();
		}
		
		PetHouse house = new PetHouse();
		house.carePet(baduk);
		house.carePet(nabi);
		house.carePet(new GoldFish());
		
		house.petInfo(i);
		
	}


}
