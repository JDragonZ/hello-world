package cn.itlongge.utils.common;

import java.util.HashMap;

import org.junit.Test;

import cn.itcast.commons.CommonUtils;

/**
 * 
 * @author 张吉龙
 *
 */

public class CommonUtilsTest {
	
	@Test
	public void test1()
	{
		String s = CommonUtils.uuid();//生成随机32位长的字符串
		System.out.println(s);

	}
	
	@Test
	public void testToBean()
	{
		//将map映射成javabean对象  这里存在自动类型转换 string-int / string-Date
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("pid", CommonUtils.uuid());
		map.put("age", "23");
		map.put("birthday", "1993-07-25");
		map.put("name", "张吉龙");
		Person p = CommonUtils.toBean(map, Person.class);
		System.out.println(p);
	}

}
