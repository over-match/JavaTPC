package kr.tpc;

public class Dog extends Animal {
	// �̸�, ����, �� : ��������
	// ������(Override)
	@Override
	public void eat() {
		System.out.println("�������� ������� �Դ´�.");
	}
	
	public Dog() {
		super(); //new Animal();
	}
	
}