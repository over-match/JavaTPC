package kr.poly;

public interface DBconnect {
	
	/**
	 * OracleDB ����
	 * 
	 * @param url
	 * @param user
	 * @param password
	 */
	public void getConnection(String url, String user, String password);
}
