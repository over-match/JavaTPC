import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}

	private static void display(Object obj) { //������ �μ�
		
		if ( obj instanceof A ) {
			((A)obj).go();
		} else {
			((B)obj).go();
		}
	}
}