package kr.tpc;

import kr.poly.DBconnect;

public class JavaMySQL implements DBconnect {

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB�� ���ӵ˴ϴ�.");
	}

}