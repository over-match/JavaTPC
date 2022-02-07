package kr.poly;

// 인터페이스(추상메서드)
// -> 객체 생성X, RemoCon con = new RemoCon();
public interface RemoCon {
	
	// final static(상수)을 사용 가능
	int MAXCH=100; //RemoCon.MAXCH
	public static final int MINCH=1; //RemoCon.MINCH
	
	// 추상 메소드
	/**
	 * 채널 위
	 */
	public void chUp();

	/**
	 * 채널 아래
	 */
	public void chDown();

	/**
	 * 인터넷
	 */
	public void internet();
}

