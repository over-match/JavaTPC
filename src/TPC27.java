import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
	public static void main(String[] args) {
		
		//RemoCon으로 TV class를 구동하시오.
		RemoCon remo = new TV();
		
		for(int i=0; i<40; i++) {
			remo.chUp();
		}
		for(int i=0; i<40; i++) {
			remo.chDown();
		}
		remo.internet();
	}
}
