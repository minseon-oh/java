package auonymous.basic02;

public class Tv {
	
	private int volume;
	private RemoteControl remote;
	
	public Tv() {
		//remote타입을 Tv에 알맞게 익명객체 방법으로 초기화하라.
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				volume ++;
				System.out.println("TV볼륨 업");
			}
			
			@Override
			public void volumeDown() {
				volume --;
				System.out.println("TV볼륨 다운");
			}
			
			@Override
			public void turnOn() {
				System.out.println("TV켬");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV끔");
			}
		};
	}
	
	//게터 세터
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
	
}
