package kr.poly;

public class A extends Object { //java.lang.Object �� �����Ǿ� �ִ�.
	
	// ����Ʈ �����ڵ� �����Ǿ� �ִ� ����
//	public A()	{
//		super();
//	}
	
	public void display() {
		System.out.println("���� A�̴�.");
	}
	
	@Override
	public String toString() {
		return "�����ǵ� �޼��� �Դϴ�.";
	}
}