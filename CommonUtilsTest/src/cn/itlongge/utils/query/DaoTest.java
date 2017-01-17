package cn.itlongge.utils.query;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

public class DaoTest {
	
	@Test
	public void testAdd() throws SQLException{
		TxQueryRunnerDao dao = new TxQueryRunnerDao();
		Person p1=new Person(CommonUtils.uuid(),23,new Date(),"张三");
		Person p2=new Person(CommonUtils.uuid(),22,new Date(),"李四");
		Person p3=new Person(CommonUtils.uuid(),21,new Date(),"小红");
		dao.add(p1);
		dao.add(p2);
		dao.add(p3);
	}
	
	@Test
	public void testEdit() throws SQLException{
		TxQueryRunnerDao dao = new TxQueryRunnerDao();
		Person p = dao.load("182D9649C4A24437BC294828673A55DF");
		System.out.println(p);
		p.setName("康康");
		p.setBirthday(new Date());
		System.out.println(p);
		dao.edit(p);	
	}
	
	@Test
	public void testDelete() throws SQLException{
		TxQueryRunnerDao dao = new TxQueryRunnerDao();
		dao.delete("182D9649C4A24437BC294828673A55DF");
		
	}
	
	@Test
	public void testFindAll() throws SQLException{
		TxQueryRunnerDao dao = new TxQueryRunnerDao();
		List<Person> list = dao.findAll();
		for (Person person : list) {
			System.out.println(person);
		}
	}
	

}
