import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBTest {

	@Test
	public void dbConnect() {
		try {
			// 드라이버 클래스를 로드 - 1번만 수행
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 데이터베이스 연결
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.86:1521:xe", "system",
					"syndrome12");
			// 데이터베이스 사용
			System.out.println(con);

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
