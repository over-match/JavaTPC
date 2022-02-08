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
//		arr.add(new A()); // ����, ������ 5���� �����Ǿ� �ֱ� ����.
		// ���� �ٸ� Ÿ���� �ִ� ���� ������ �ʴ´�.
		// -> <���׸�> ���׸��� Ȱ���Ͽ� �Ѱ��� Ÿ�Ը� �ֵ��� ������ �� �ִ�.

		// ArrayList�� ���̰� 5�� �Ѿ���� ������ �߻����� �ʴ´�.
		ArrayList arr = new ArrayList(5); // Object[], �迭�� ���̿� ������ ����!
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