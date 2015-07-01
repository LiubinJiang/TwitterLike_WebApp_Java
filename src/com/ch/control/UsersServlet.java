package com.ch.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bean.User;
import com.ch.dao.UserDAO;

public class UsersServlet extends HttpServlet {

	private UserDAO dao;
	
	public void init(){
		dao=new UserDAO();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);//调用doPost方法
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String username=request.getParameter("username");
		String user_id=request.getParameter("user_id");
		String password=request.getParameter("passwd");
		String horoscope=request.getParameter("horoscope");
		String district=request.getParameter("district");
		String action=request.getParameter("action");
		
		if("add".equals(action)){
			User u=new User();
			u.setUser_id(user_id);
			u.setPassword(password);
			u.setUsername(username);
			u.setHoroscope(horoscope);
			u.setDistrict(district);
			dao.add(u);
			response.sendRedirect("usersServlet");
		}else if("delete".equals(action)){
			System.out.println(user_id);
			System.out.println(action);
			dao.delete(user_id);
			response.sendRedirect("usersServlet");
		}else if("edit".equals(action)){
			User u=dao.findById(user_id);
			request.setAttribute("user",u);
			request.getRequestDispatcher("mvc/admin/updateUser.jsp").forward(request, response);
		}else if("update".equals(action)){
			User u=new User();
			u.setUser_id(user_id);
			u.setPassword(password);
			u.setUsername(username);
			u.setHoroscope(horoscope);
			u.setDistrict(district);
			dao.update(u);
			response.sendRedirect("usersServlet");
		}else {
		
			List<User> list=dao.getUser();
			request.setAttribute("users", list);//将数据放入请求中
			request.getRequestDispatcher("mvc/admin/showUsers.jsp").forward(request,response);//转发到list.jsp中
			}
	
		}

}
