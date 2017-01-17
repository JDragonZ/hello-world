package cn.itlongge.utils.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.servlet.BaseServlet;


/**
 * 
 * @author 张吉龙
 *	BaseServlet 是作为其他servlet的父类的，有两个特点：
 *		一个servlet处理多个处理方法
 *		简化请求转发和重定向的代码。
 *	BaseServlet中的请求处理方法有一个String类型的返回值，返回值表示转发或重定向的目标页面。例如：
	f:/index.jsp：其中f:表示转发，即forward的意思，/index.jsp表示转发到/index.jsp页面；
	r:/index.jsp：其中r:表示重定向，即redirect的意思，/index.jsp表示重定向到/index.jsp页面。
	null：表示不转发也不重定向；

 */
public class Aservlet extends BaseServlet {

	private static final long serialVersionUID = 1L;
	
	public String regist(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("AServlet regist()....");
		
		return "f:/index.jsp";
	}
	
	public String login(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		System.out.println("AServlet login()....");
		return "f:/index1.jsp";
	}

}
