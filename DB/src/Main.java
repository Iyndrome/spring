import java.sql.Connection;

import javax.activation.DataSource;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try {
			//Spring ���� ������ ���� - DBtest���� SpringBeanConfiguration ������ ������Ѽ� �׽�Ʈ�ϱ� ���� �ڵ尡
			//����Ʈ�� ���� �ʴ� ������ ���ܼ� �����Բ��� �� Ŭ������ ����� ��
			
			//Spring ���� ���� ���� 
			GenericXmlApplicationContext context = 
					new GenericXmlApplicationContext(
						"applicationContext.xml");
			//DataSource �������� 
			DataSource ds = 
					context.getBean(DataSource.class);
		    //Connection �����
			Connection con = ds.getConnection();
			System.out.println(con);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
