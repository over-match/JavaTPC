package kr.tpc;

public class Animal extends Object { //Object: �ֻ��� Ŭ����
	//Dog, Cat --> eat()
	public void eat() {
		System.out.println("?"); // ������ ���� �� �ٸ��� �Դ�? ������, �߻��� ����
	}

	public Animal() {
		super(); //new Object();
	}
}