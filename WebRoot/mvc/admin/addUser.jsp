<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="../../css/text.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body>
  <center>
  <h2>管理员添加用户界面</h2>
  <form action="../../usersServlet" method="post">
  	用户名<input type="text" name="username"><br>
  	密码<input type="password" name="passwd"><br>
  	user_id<input type="text" name="user_id"></br>
  	星座<select name="horoscope">
  			<option value="Taurus" selected>Taurus</option>
  			<option value="Aries" selected>Aries</option>
  			<option value="Gemini" selected>Gemini</option>
  			<option value="Cancer " selected>Cancer </option>
  			<option value="Leo" selected>Leo</option>
  			<option value="Virgo" selected>Virgo</option>
  			<option value="Libra" selected>Libra</option>
  		</select><br>
  	地区<input type="text" name="district"><br>
  	<input type="hidden" name="action" value="add">
  	<input type="submit" value="添加">
  	<input type="reset" value="清空">
  
  </form>
  </center>
  </body>
</html>
