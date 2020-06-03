package quiz16;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	
	private KeyBoard kb;
	private Monitor mt;
	private Mouse ms;
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	
	public Computer() {
		super();
		this.kb = new KeyBoard();
		this.mt = new Monitor();
		this.ms = new Mouse();
	}
	
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	
	public void computerInfo() {
		System.out.println("<컴퓨터의 정보를 출력합니다>");
		kb.info();
		mt.info();
		ms.info();
	}
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	
	public KeyBoard getKb() {
		return kb;
	}

	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}

	public Monitor getMt() {
		return mt;
	}

	public void setMt(Monitor mt) {
		this.mt = mt;
	}

	public Mouse getMs() {
		return ms;
	}

	public void setMs(Mouse ms) {
		this.ms = ms;
	}
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
