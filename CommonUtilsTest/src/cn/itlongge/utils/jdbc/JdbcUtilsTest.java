package cn.itlongge.utils.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import cn.itcast.jdbc.JdbcUtils;

public class JdbcUtilsTest {
	
	/**
	 * 
	 * @throws SQLException
	 */
	@Test
	public void testGetConnect() throws SQLException{
		Connection con = JdbcUtils.getConnection();
		System.out.println(con);
		JdbcUtils.releaseConnection(con);//如果不是当前线程的连接对象   则关闭之
	}
	
	/**
	 * 当开始事务后，调用getConnection()会为当前线程创建Connection，开启事务时会自动创建连接对象。
	 * 而且多次调用getConnection()返回的是同一个对象
	 * @throws SQLException
	 */
	@Test
	public void testTransaction() throws SQLException{
		JdbcUtils.beginTransaction();
		Connection c1 = JdbcUtils.getConnection();
		Connection c2 = JdbcUtils.getConnection();
		Assert.assertEquals(true,c1==c2);
		JdbcUtils.commitTransaction();
	}

}
