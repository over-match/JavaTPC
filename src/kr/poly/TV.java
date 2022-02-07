package kr.poly;

public class TV implements RemoCon {

	@Override
	public void chUp() {
		System.out.println("TV에 채널이 올라간다.");
	}

	@Override
	public void chDown() {
		System.out.println("TV에 채널이 내려간다.");
	}

	@Override
	public void internet() {
		System.out.println("TV는 인터넷이 된다.");
	}
	
	//추가적인 기능 구현 가능..
}
