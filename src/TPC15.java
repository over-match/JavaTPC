import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
		// setter method - 필요 X
		// -> setter의 역할을 
		
		System.out.print(m.getName()+"\t");
		System.out.println(m.getAge());
		
		// toString 하나하나 출력하지 않아도 되는 번거로움을 줄일 수 있다!
		System.out.println(m.toString()); //문자열로 return
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("광주");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr());
		
		System.out.println(m1.toString());
	}
}
