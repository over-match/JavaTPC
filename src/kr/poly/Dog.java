package kr.poly;

public class Dog extends Animal {

	// ������(Override)���� ���� ��� error�� �߻��Ѵ�
	// -> why? �Ҿ����� �����̱� ������ ��.��.�� �����Ǹ� �ؾ��Ѵ�!
	@Override
	public void eat() {
		System.out.println("���� ������� �Դ´�.");
	}
}