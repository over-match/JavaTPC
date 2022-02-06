package kr.tpc;

public class Cat extends Animal {
	// 이름, 나이, 종 : 상태정보

	// 재정의(Override)
	@Override
	public void eat() {
		System.out.println("고양이는 얌전히 먹는다.");
	}
	public void night() {
		System.out.println("밤에 눈에서 빛이난다.");
	}
}
