package auonymous.basic02;

public class Computer {
	//멤버변수
	private int sound;
	private RemoteControl remote;
	
	//생성자
	public Computer() {
		
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터의 볼륨:" + sound);
			}
			
			@Override
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터의 볼륨:" + sound);				
			}
			
			@Override
			public void turnOn() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("컴퓨터를 끕니다.");
			}
		};
		
	}
	
	//remote의 게터 메서드
	public RemoteControl getRemote() {
		return remote;
	}
	
	public void SetRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
	

}
