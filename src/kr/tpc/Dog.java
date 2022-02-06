package kr.tpc;

public class Dog extends Animal {
	// 이름, 나이, 종 : 상태정보
	// 재정의(Override)
	@Override
	public void eat() {
		System.out.println("강아지는 허겁지겁 먹는다.");
	}
	
	public Dog() {
		super(); //new Animal();
	}
	
}
