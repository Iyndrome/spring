package mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatis.domain.Good;

//Controller, Service, Repository, Component
//bean�� �ڵ� �������ִ� ������̼� - IoC(������ ����)
@Repository
public class GoodDAO {
	//�����ͺ��̽� ���� �����ӿ�ũ�� ����
	//@Autowired
	private SqlSession sqlSession;
	
	//��ü �����͸� �������� �޼ҵ�
	//�Ķ���� ���� ��ü �����͸� �������� SQL�� ȣ��
	public List<Good> allGood(){
		return sqlSession.selectList("good.allgood");
	}
	
	//code�� �Է¹޾Ƽ� ������ 1���� ã�ƿ��� �޼ҵ�
	public Good getGood(int code) {
		return sqlSession.selectOne(
			"good.getgood", code);
	}
	
	//�����͸� �����ϴ� �޼ҵ�
	public int insertGood(Good good) {
		return sqlSession.insert(
			"good.insertgood", good);
	}
	
	//�����͸� �����ϴ� �޼ҵ�
	public int updateGood(Good good) {
		return sqlSession.update(
			"good.updategood", good);
	}
	
	//�����͸� �����ϴ� �޼ҵ�
	public int deleteGood(int code) {
		return sqlSession.delete(
			"good.deletegood", code);
	}
	
	//name�� �Ϻκ��� ������ name�� ���Ե� �����͸� ã�ƿ��� �޼ҵ�
	public List<Good> searchName(String name){
		return sqlSession.selectList(
			"good.searchname", name);
	}
	
}








