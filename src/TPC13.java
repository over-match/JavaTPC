import kr.tpc.Inflearn;

public class TPC13 {
	public static void main(String[] args) {
		
//		Inflearn inf = new Inflearn();
		
		// static�� ���� instance Method ���� ���
		Inflearn inf = new Inflearn();
		inf.tpc();
//		inf.java();
		
		// static�� ���� class Method ���� ���
		Inflearn.java();

		// Java API ������ private
//		System sys = new System();
		System.out.println("���");
//		Math m = new Math();
		int v = Math.max(10, 20); // �� �� �߿��� �ִ밪�� �Ѱ��ֱ�
		System.out.println(v); // 20
		
	}
}