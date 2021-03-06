package cn.itlongge.utils.query;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.jdbc.TxQueryRunner;

/**
 * 
 * @author 张吉龙
 * 
 *         TxQueryRunner类是common-dbutils下QueryRunner类的子类，用来简化JDBC操作。
 *
 */

public class TxQueryRunnerDao {

	private QueryRunner qr = new TxQueryRunner();


	public void add(Person person) throws SQLException {
		String sql = "insert into t_person values(?,?,?,?)";
		Object[] params = { person.getPid(), person.getAge(),
				person.getBirthday(), person.getName() };
		qr.update(sql, params);
	}
	
	public void edit(Person person) throws SQLException {
		String sql = "update t_person set name=?,age=?,birthday=? where pid=?";
		Object[] params = { person.getName(), person.getAge(),
				new Date(person.getBirthday().getTime()),person.getPid()  };
		qr.update(sql, params);
	}
	
	public void delete(String pid) throws SQLException{
		String sql="delete from t_person where pid=?";
		qr.update(sql, pid);
	}
	
	public Person load(String pid) throws SQLException{
		String sql="select * from t_person where pid=?";
		return qr.query(sql, new BeanHandler<Person>(Person.class), pid);
		
	}
	
	public List<Person> findAll() throws SQLException{
		String sql="select * from t_person";
		return qr.query(sql, new BeanListHandler<Person>(Person.class));	
	}
	
	

}
