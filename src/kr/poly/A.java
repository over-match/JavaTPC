package kr.poly;

public class A extends Object { //java.lang.Object 가 생략되어 있다.
	
	// 디폴트 생성자도 생략되어 있는 상태
//	public A()	{
//		super();
//	}
	
	public void display() {
		System.out.println("나는 A이다.");
	}
	
	@Override
	public String toString() {
		return "재정의된 메서드 입니다.";
	}
}
