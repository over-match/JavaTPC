import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
	public static void main(String[] args) {
		
//		RemoCon remoCon = new RemoCon(); -> error ��ü ���� �Ұ���
		RemoCon remo = new TV();
		remo.chUp();
		remo.chDown();
		remo.internet();
		
		remo = new Radio();
		remo.chUp();
		remo.chDown();
		remo.internet();
	}
}