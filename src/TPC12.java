import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
		// 생성자 -> 생성 + 초기화 -> 중복정의
		BookVO b1 = new BookVO();
		//b1.title="오라클";
		
		System.out.print(b1.title+"\t");
		System.out.print(b1.price+"\t");
		System.out.print(b1.company+"\t");
		System.out.println(b1.page);
		
		//디폴트 생성자 메서드
		BookVO b2 = new BookVO();
		System.out.print(b2.title+"\t");
		System.out.print(b2.price+"\t");
		System.out.print(b2.company+"\t");
		System.out.println(b2.page);
		
		//매개변수가 4개인 생성자
		BookVO b3 = new BookVO("Python", 18000, "대림", 920);
		System.out.print(b3.title+"\t");
		System.out.print(b3.price+"\t");
		System.out.print(b3.company+"\t");
		System.out.println(b3.page);
		
		
	}
}
