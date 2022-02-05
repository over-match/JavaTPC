package kr.tpc;

public class MemberVO {
	
	// 멤버 필드
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// 디폴트 메소드 (기본 생성자)
	public MemberVO() {
		
	}
	
	public MemberVO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	//toString
	// -> 자동완성: ctrl + shift + r 
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}

	// setter, getter method
	// -> 자동완성: ctrl + shift + s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
