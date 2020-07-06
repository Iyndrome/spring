import java.sql.Connection;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import hibernate.dao.ItemDAO;
import hibernate.dao.TransactionDAO;

public class Main {

	public static void main(String[] args) {
		try {
			GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
					"applicationContext.xml");
			/*
			DataSource ds = 
				context.getBean(DataSource.class);
			Connection con = ds.getConnection();
			System.out.println(con);
			*/
			
			//DAO �ν��Ͻ��� �����ͼ� �����ϴ� �޼ҵ� ȣ��
			/*
			TransactionDAO dao = 
				context.getBean(TransactionDAO.class);
			dao.insert();
			*/
			
			//���̹�����Ʈ ���� Ȯ��
			/*
			SessionFactory sessionFactory = 
				context.getBean(SessionFactory.class);
			System.out.println(sessionFactory);
			*/
			
			ItemDAO itemDao = 
					context.getBean(ItemDAO.class);
			itemDao.insert();
			//itemDao.update();
			
			//itemDao.delete();
			
			//itemDao.list();
			itemDao.getItem();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
