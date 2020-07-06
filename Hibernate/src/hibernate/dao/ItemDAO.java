package hibernate.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hibernate.domain.Item;

@Repository
public class ItemDAO {
	@Autowired
	// ���̹�����Ʈ ��� ��ü
	private SessionFactory sessionFactory;

	// ������ ����
	@Transactional
	public void insert() {
		Item item = new Item();
		item.setCode(3);
		item.setName("��¡��");
		item.setManufacture("����");
		item.setPrice(2000);
		item.setBuiltdate(new Date());

		// ������ ����
		sessionFactory.getCurrentSession().save(item);
	}

	// ������ ����
	// �⺻Ű�� �������� �ؼ� ������ �׸��� ����
	// ���� �⺻Ű�� �����ϸ� �ƹ��ϵ� ���� �ʽ��ϴ�.
	@Transactional
	public void update() {
		Item item = new Item();
		item.setCode(3);
		item.setName("Grape");
		item.setManufacture("Korea");
		item.setPrice(9000);
		item.setBuiltdate(new Date());

		// ������ ����
		sessionFactory.getCurrentSession().update(item);
	}

	// ������ ����
	// �⺻Ű �׸��ܴ̿� �ƹ��͵� �ʿ�����ϴ�.
	// �⺻Ű�� �������� �ؼ� ����
	@Transactional
	public void delete() {
		Item item = new Item();
		item.setCode(3);

		// ������ ����
		sessionFactory.getCurrentSession().delete(item);
	}

	// ��ü ������ ��������
	@Transactional
	public void list() {
		// ��ü ������ ��������
		/*
		 * //Criteria ��� List<Item> list = (List<Item>)
		 * sessionFactory.getCurrentSession() .createCriteria(Item.class).list();
		 */
		// SQL ���
		List<Item> list = sessionFactory.getCurrentSession().createSQLQuery("select * from item").addEntity(Item.class)
				.list();

		// ������ ���
		for (Item item : list) {
			System.out.println(item);
		}
	}

	// �⺻Ű�� ������ ������ 1�� ��������
	@Transactional
	public void getItem() {
		// Criteria ���
		Item item = sessionFactory.getCurrentSession().get(Item.class, 1);
		System.out.println(item);

	}

}
