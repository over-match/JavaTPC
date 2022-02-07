package kr.poly;

public interface DBconnect {
	
	/**
	 * OracleDB Á¢¼Ó
	 * 
	 * @param url
	 * @param user
	 * @param password
	 */
	public void getConnection(String url, String user, String password);
}
