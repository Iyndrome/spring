package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.GoodDao;

//bean을 자동으로 생성해달라고 하는 어노테이션, dao에서 쓴것과 같은 역할을 한다
@Service
public class GoodServiceImpl implements GoodService {
	//DAO변수를 선언
	//setter를 만들어주는 기능과 동일한 자료형의 bean을 주입받아주는 어노테이션	
	@Autowired
	private GoodDao goodDao;
	
	@Override
	public void detail() {
		System.out.println(goodDao.detail(1));

	}

}
