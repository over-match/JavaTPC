package kr.poly;

// 인터페이스(추상메서드)
// -> 객체 생성X, RemoCon con = new RemoCon();
public interface RemoCon {
	
	// final static(상수)을 사용 가능
	int MAXCH=100; //RemoCon.MAXCH
	public static final int MINCH=1; //RemoCon.MINCH
	
	// 추상 메소드
	public void chUp();

	public void chDown();

	public void internet();
}