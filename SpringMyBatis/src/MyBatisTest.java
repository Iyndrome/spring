

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//������ ���� ������ ������ ������Ѽ� �׽�Ʈ�ϱ� ���� ���� 
//���� ������ ��θ� �����ذ��鼭 ���
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"applicationContext.xml"})
public class MyBatisTest {
	//������ �ڷ������� ������� bean�� ������ �ڵ����� ���Թ޴�
	//������̼����� ������ �ڷ����� bean�� ���ų� 2���̸� ���� �߻� 
	//2�� �̻� �϶��� �Ʒ��� name�� �����ؼ� name�� �ش��ϴ� ���� �޾ƿ��� ��
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void connectionTest() {
		try {
			//������ ���������� ��µǸ� �����ͺ��̽� ����
			Connection con = dataSource.getConnection();
			System.out.println(con);
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}

	}
}
