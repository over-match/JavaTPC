import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		
		//private에서 꺼내서 사용할 경우
		m.setName("홍길동");
		m.setAge(50);
		m.setTel("010-1111-1111");
		m.setAddr("서울");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr());
		
		//getter, setter 사용하기 전 (public일 때)
//		m.name = "홍길동";
//		m.age = 50;
//		m.tel = "010-1111-1111";
//		m.addr = "서울";
//		
//		System.out.print(m.name+"\t");
//		System.out.print(m.age+"\t");
//		System.out.print(m.tel+"\t");
//		System.out.println(m.addr);
	}
}
