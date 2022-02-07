import kr.poly.DBconnect;
import kr.tpc.JavaMySQL;
import kr.tpc.JavaOracle;

public class TPC27_JDBC {
	public static void main(String[] args) {
		
		//Oracle, MySQL -> Driver class
		DBconnect conn = new JavaOracle();
		conn.getConnection("URL", "overmatch", "12345");
		
		conn = new JavaMySQL();
		conn.getConnection("URL", "NANA", "54321");
	}
}
