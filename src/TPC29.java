import kr.tpc.A;
import kr.tpc.B;

public class TPC29 {
	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		
		B b = new B();
		display(b);
	}

	private static void display(Object obj) { //다형성 인수
		
		if ( obj instanceof A ) {
			((A)obj).go();
		} else {
			((B)obj).go();
		}
	}
}
