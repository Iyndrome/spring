import java.sql.Connection;

import javax.activation.DataSource;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		try {
			//Spring 설정 파일을 실행 - DBtest에서 SpringBeanConfiguration 파일을 실행시켜서 테스트하기 위한 코드가
			//임포트가 되지 않는 오류가 생겨서 선생님께서 이 클래스를 만들게 됨
			
			//Spring 설정 파일 실행 
			GenericXmlApplicationContext context = 
					new GenericXmlApplicationContext(
						"applicationContext.xml");
			//DataSource 가져오기 
			DataSource ds = 
					context.getBean(DataSource.class);
		    //Connection 만들기
			Connection con = ds.getConnection();
			System.out.println(con);
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
