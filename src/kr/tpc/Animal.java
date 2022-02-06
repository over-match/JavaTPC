package kr.tpc;

public class Animal extends Object { //Object: 최상의 클래스
	//Dog, Cat --> eat()
	public void eat() {
		System.out.println("?"); // 동물들 마다 다 다르게 먹는? 포괄적, 추상적 개념
	}

	public Animal() {
		super(); //new Object();
	}
}
