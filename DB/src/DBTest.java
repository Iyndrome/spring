import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class DBTest {

	@Test
	public void dbConnect() {
		try {
			// ����̹� Ŭ������ �ε� - 1���� ����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �����ͺ��̽� ����
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.86:1521:xe", "system",
					"syndrome12");
			// �����ͺ��̽� ���
			System.out.println(con);

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
