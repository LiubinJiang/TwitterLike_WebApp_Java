package com.ch.util;
import java.sql.*;
public class DBUtil {
	public Connection getConnection(){
		Connection conn=null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
			//∂®“Â¡¥Ω”
			String url="jdbc:mysql://localhost:3306/whisay";
			String uid="root";
			String pwd="tiger";
			conn=DriverManager.getConnection(url,uid,pwd);
			System.out.println(conn);
			}catch(Exception e){
				e.printStackTrace();
			}
		return conn;
	}
}
