package generic.basic01;

public class ABC<T>{ //제네릭 클래스
	
	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}

}
