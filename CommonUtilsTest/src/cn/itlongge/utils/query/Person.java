package cn.itlongge.utils.query;

import java.util.Date;

public class Person {

	private String pid;
	private int age;
	private Date birthday;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String pid, int age, Date birthday, String name) {
		super();
		this.pid = pid;
		this.age = age;
		this.birthday = birthday;
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", age=" + age + ", birthday=" + birthday
				+ ", name=" + name + "]";
	}

}
