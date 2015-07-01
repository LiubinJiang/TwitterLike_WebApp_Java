<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>admin_showUser</title>
    
    <link href="../../css/text.css" rel="stylesheet" type="text/css" />
  </head>
  <body background="blue">
  <%@page import="com.bean.*"  %>
  <h2> 管理员查看用户信息界面</h2>
  <table border="1" align="center" bordercolor="grey">
  	<tr>
  		<td>user_id</td><td>用户</td><td>密码</td><td>星座</td><td>地区</td>
  		<td>操作</td>
  	</tr>
  	<%
			List<User>list=(List<User>)request.getAttribute("users");
			for(User u:list){
		%>
	<tr>
	  	<td><%=u.getUser_id()%></td>
	  	<td><%=u.getUsername()%></td>
	  	<td><%=u.getPassword()%></td>
	  	<td><%=u.getHoroscope()%></td>
	  	<td><%=u.getDistrict()%></td>
	  	<td><a href="usersServlet?user_id=<%=u.getUser_id()%>&&action=delete" onClick='return confirm("确定要删除此用户？")'>删除</a>
	  		<a href="usersServlet?user_id=<%=u.getUser_id()%>&&action=edit">更新</a>
	  		</td>
	</tr>
	<%}%>
  </table>
<center><a href="mvc/admin/addUser.jsp">添加</a></center>
  </body>
</html>

