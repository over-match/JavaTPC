package kr.poly;

// �������̽�(�߻�޼���)
// -> ��ü ����X, RemoCon con = new RemoCon();
public interface RemoCon {
	
	// final static(���)�� ��� ����
	int MAXCH=100; //RemoCon.MAXCH
	public static final int MINCH=1; //RemoCon.MINCH
	
	// �߻� �޼ҵ�
	/**
	 * ä�� ��
	 */
	public void chUp();

	/**
	 * ä�� �Ʒ�
	 */
	public void chDown();

	/**
	 * ���ͳ�
	 */
	public void internet();
}
