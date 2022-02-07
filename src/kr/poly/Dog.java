package kr.poly;

public class Dog extends Animal {

	// 재정의(Override)하지 않을 경우 error가 발생한다
	// -> why? 불안정한 상태이기 때문에 반.드.시 재정의를 해야한다!
	@Override
	public void eat() {
		System.out.println("개는 허겁지겁 먹는다.");
	}
}
