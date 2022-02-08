import kr.tpc.A;
import kr.tpc.B;

public class TPC30 {
	public static void main(String[] args) {
		
		// A, B class를 저장할 배열을 생성하시오.
		Object[] obj = new Object[2]; // 다형성 배열
		obj[0] = new A();
		obj[1] = new B();
		
		for(int i=0; i<obj.length; i++) {
			if(obj[i] instanceof A) {
				((A)obj[i]).go();
			} else {
				((B)obj[i]).go();
			}
		}
		
		// 메서드를 통한 출력 방법.
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
