import java.sql.Connection;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import mybatis.dao.GoodDAO;
import mybatis.dao.GoodMapper;
import mybatis.domain.Good;

public class Main {

	public static void main(String[] args) {
//		try {
			
//			GenericXmlApplicationContext context = 
//				new GenericXmlApplicationContext(
//					"applicationContext.xml");
////			DataSource dataSource = 
////				context.getBean(DataSource.class);
////			//������ ���������� ��µǸ� �����ͺ��̽� ���� ����
////			Connection con = dataSource.getConnection();
////			System.out.println(con);
//			
//			//SQLSession ���Թ޾ƺ���
//			//����� �Ǹ� MyBatis �������� ������ ����
////			SqlSession sqlSession = 
////					context.getBean(SqlSession.class);
////			System.out.println(sqlSession);
//			
//			GoodDAO goodDAO = 
//					context.getBean(GoodDAO.class);
//			//��ü ������ ��������
//			//System.out.println(goodDAO.allGood());
//			
//			//�ڵ带 �̿��ؼ� ������ 1�� ã�ƿ���
//			//System.out.println(goodDAO.getGood(1));
//			
//			//������ �����͸� ����
//			/*
//			Good good = new Good();
//			good.setCode(8);
//			good.setName("����");
//			good.setRegdate(new Date());
//			
//			System.out.println(
//				goodDAO.insertGood(good));
//			*/
//			
//			//������ ���� Ȯ��
//			/*
//			Good good = new Good();
//			good.setCode(1);
//			good.setName("��ȭ��");
//			good.setRegdate(new Date());
//			
//			System.out.println(
//				goodDAO.updateGood(good));
//			*/
//			
//			/*
//			System.out.println(
//				goodDAO.deleteGood(8));
//			*/
//			
//			/*
//			System.out.println(
//				goodDAO.searchName("��"));
//				*/
//			
//			Good good = new Good();
//			good.setCode(8);
//			good.setName("����");
//			good.setRegdate(new Date());
//			
//			System.out.println(
//				goodDAO.insertGood(good));
//			
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
			
		try {
			//������ ���� ������ ��θ� ����
			GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
					"applicationContext.xml");
//			//�����ͺ��̽� ���� ���� �����ͼ� ������ �Ǵ��� �׽�Ʈ
//			DataSource ds = 
//				context.getBean(DataSource.class);
//			Connection con = ds.getConnection();
//			System.out.println(con);
			
			GoodMapper goodMapper = 
				context.getBean(GoodMapper.class);
			System.out.println(goodMapper.allGood());
			
			context.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
