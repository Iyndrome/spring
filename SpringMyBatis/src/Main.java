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
////			//내용이 정상적으로 출력되면 데이터베이스 접속 성공
////			Connection con = dataSource.getConnection();
////			System.out.println(con);
//			
//			//SQLSession 주입받아보기
//			//출력이 되면 MyBatis 설정에는 문제가 없음
////			SqlSession sqlSession = 
////					context.getBean(SqlSession.class);
////			System.out.println(sqlSession);
//			
//			GoodDAO goodDAO = 
//					context.getBean(GoodDAO.class);
//			//전체 데이터 가져오기
//			//System.out.println(goodDAO.allGood());
//			
//			//코드를 이용해서 데이터 1개 찾아오기
//			//System.out.println(goodDAO.getGood(1));
//			
//			//삽입할 데이터를 생성
//			/*
//			Good good = new Good();
//			good.setCode(8);
//			good.setName("수박");
//			good.setRegdate(new Date());
//			
//			System.out.println(
//				goodDAO.insertGood(good));
//			*/
//			
//			//데이터 수정 확인
//			/*
//			Good good = new Good();
//			good.setCode(1);
//			good.setName("무화과");
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
//				goodDAO.searchName("감"));
//				*/
//			
//			Good good = new Good();
//			good.setCode(8);
//			good.setName("수박");
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
			//스프링 설정 파일의 경로를 설정
			GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext(
					"applicationContext.xml");
//			//데이터베이스 접속 정보 가져와서 접속이 되는지 테스트
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
