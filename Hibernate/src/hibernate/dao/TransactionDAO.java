package hibernate.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TransactionDAO {
	//Spring JDBC ���� �����ϴ� ������ ���� Ŭ������ ����
	@Autowired
	private SimpleJdbcInsert template;
	
	@Transactional
	public void insert() {
		//���̺� �̸� ����
		template.withTableName("GOODS");
		//������ ������ ����
		Map<String, Object> map = 
			new HashMap<String, Object>();
		map.put("code", 21);
		map.put("name", "����");
		map.put("regdate", new Date());
		
		//������ �����͸� 2�� �����ϹǷ� 2��° ������ ��
		//�⺻Ű �ߺ� ���� �߻�
		template.execute(map);
		template.execute(map);
	}
}





