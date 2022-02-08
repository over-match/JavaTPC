import java.util.ArrayList;

import kr.infrine.ObjectArray;
import kr.tpc.A;
import kr.tpc.B;

public class TPC37 {
	public static void main(String[] args) {
		
//		ObjectArray arr = new ObjectArray(5);
//		arr.add(new A());
//		arr.add(new B());
//		arr.add(new B());
//		arr.add(new A());
//		arr.add(new A());
//		arr.add(new A()); // 에러, 공간이 5개로 지정되어 있기 때문.
		// 서로 다른 타입을 넣는 경우는 흔하지 않는다.
		// -> <제네릭> 제네릭을 활용하여 한가지 타입만 넣도록 설정할 수 있다.

		// ArrayList는 길이가 5가 넘어가더라도 에러가 발생하지 않는다.
		ArrayList arr = new ArrayList(5); // Object[], 배열의 길이에 제약이 없다!
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B());
		arr.add(new A());
		arr.add(new A());
		
		for(int i=0; i<arr.size(); i++) {
			Object obj = arr.get(i);
			if( obj instanceof A ) {
				((A)obj).go();
			} else {
				((B)obj).go();
			}
		}
		
	}
}
