package kr.tpc;

public class OverLoad {
	// 동작(method)으로 이루어진 객체
	// -> method의 이름은 동일하지만 매개변수의 데이터타입이 다른 상태로 오버로딩된 상태이다.
	// 	    즉, 함수의 이름 하나만 알고 있다면 매개변수의 값에 따라 호출되기 때문에 매우 편리하다.
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
