package kr.tpc;

public class OverLoad {
	// ����(method)���� �̷���� ��ü
	// -> method�� �̸��� ���������� �Ű������� ������Ÿ���� �ٸ� ���·� �����ε��� �����̴�.
	// 	    ��, �Լ��� �̸� �ϳ��� �˰� �ִٸ� �Ű������� ���� ���� ȣ��Ǳ� ������ �ſ� �����ϴ�.
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}