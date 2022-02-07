package kr.tpc;

import kr.poly.DBconnect;

public class JavaOracle implements DBconnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB가 접속됩니다.");
	}
	
}
