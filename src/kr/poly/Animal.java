package kr.poly;

//�߻�Ŭ����(�Ҿ����� ��ü)
// -> Animal ani = new Animal(); ��ü�� ������ �� ����!
// ������ ������ �Ұ���������, ����Ŭ������ �������� ����Ǿ� ����Ŭ������ ���۽�ų �� �ִ�.
public abstract class Animal { 

	// �߻�޼ҵ�(�Ҿ����� �޼ҵ�)
	public abstract void eat();
	
	// ���� �޼ҵ�
	// -> ����� ����� ���, ���� �޼ҵ�� ������ ������ ������Ѽ� �۵������ش�.
	public void move() {
		System.out.println("������ ��� �̵��Ѵ�.");
	}
}