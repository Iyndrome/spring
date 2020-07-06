package mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mybatis.domain.Good;

//MyBatis Mapper�� ����� �������̽�
public interface GoodMapper {
	//��ü �����͸� �������� �޼ҵ�
	@Select("select code, name, regdate from goods")
	public List<Good> allGood();
	
	//code�� ������ �ϳ��� �����͸� ã�ƿ��� �޼ҵ�
	@Select("select code, name, regdate "
			+ "from goods where code=#{code}")
	public Good getGood(int code);
	
	//�����͸� �����ϴ� �޼ҵ�
	@Insert("insert into goods(code, name, regdate) "
			+ "values(#{code}, #{name}, #{regdate})")
	public int insertGood(Good good);
	
	//�����͸� �����ϴ� �޼ҵ�
	@Update("update goods "
			+ "set name=#{name}, regdate=#{regdate} "
			+ "where code = #{code}")
	public int updateGood(Good good);
	
	//�����͸� �����ϴ� �޼ҵ�
	@Delete("delete from goods where code = #{code}")
	public int deleteGood(int code);
	
}







