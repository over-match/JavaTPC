package kr.poly;

public class TV implements RemoCon {

	int currCH = 70;
	
	@Override
	public void chUp() {
		if(currCH < RemoCon.MAXCH) {
			currCH++;
			System.out.println("TV에 채널이 올라간다."+currCH);
		} else {
			currCH=1; //채널 1로 변경
			System.out.println("TV에 채널이 올라간다."+currCH);
		}
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
			currCH--;
			System.out.println("TV에 채널이 내려간다."+currCH);
		} else {
			currCH=100; //채널 100로 변경
			System.out.println("TV에 채널이 내려간다."+currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("TV는 인터넷이 된다.");
	}
	
	//추가적인 기능 구현 가능..
}
