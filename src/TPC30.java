import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {
	public static void main(String[] args) {
		
		// A, B class�� ������ �迭�� �����Ͻÿ�.
		Object[] obj = new Object[2]; // ������ �迭
		obj[0] = new A();
		obj[1] = new B();
		
		for(int i=0; i<obj.length; i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).go();
			} else {
				((B)obj[i]).go();
			}
		}
		
		// �޼��带 ���� ��� ���.
		printGo(obj);
	}

	private static void printGo(Object[] obj) {

		for(int i=0; i<obj.length; i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).go();
			} else {
				((B)obj[i]).go();
			}
		} // for end
	}
}