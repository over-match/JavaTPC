package kr.tpc;

public class Cat extends Animal {
	// �̸�, ����, �� : ��������

	// ������(Override)
	@Override
	public void eat() {
		System.out.println("�����̴� ������ �Դ´�.");
	}
	public void night() {
		System.out.println("�㿡 ������ ���̳���.");
	}
}