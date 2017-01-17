package cn.itlongge.utils.mail;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;

import org.junit.Test;

import cn.itcast.mail.Mail;
import cn.itcast.mail.MailUtils;

public class MailUtilsTest {
	
	/**
	 * 测试发送普通邮件   from/to/subject/content
	 * @throws MessagingException
	 * @throws IOException
	 */
	@Test
	public void fun1() throws MessagingException,IOException{
		Session session = MailUtils.createSession("smtp.163.com", "zjl9393", "ZhJL2016*##*");
		Mail mail = new Mail("zjl9393@163.com", "1027112149@qq.com", "这时一封测试邮件", "Happy Chinese New Year！ZJL");
		MailUtils.send(session, mail);
	}

}
