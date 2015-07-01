package com.ch.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Saying;
import com.bean.User;
import com.ch.dao.SayingDAO;

public class SayingsServlet extends HttpServlet {

	private SayingDAO dao;
	
	public void init(){
		dao=new SayingDAO();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);//调用doPost方法
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String sayinginfo=request.getParameter("sayinginfo");
		String action=request.getParameter("action");
		
		if("add".equals(action)){
			Saying s=new Saying();
			s.setUser_id("u0001");
			s.setSayinginfo(sayinginfo);
			s.setSaying_id(dao.runningId()+1);
			dao.add(s);
			response.sendRedirect("sayingsServlet");
		}else {
			List<Saying> list=dao.getSaying();
			request.setAttribute("sayings", list);//将数据放入请求中
			request.getRequestDispatcher("mvc/user/homepage.jsp").forward(request,response);//转发到list.jsp中
			}
	
		}

}
