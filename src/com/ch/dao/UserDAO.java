package com.ch.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.User;
import com.ch.util.DBUtil;
public class UserDAO {
	//取出所有数据
	public List<User> getUser() {
		//创建一个集合对象，承载所有数据
		List<User> ary=new ArrayList<User>();
		//创建一个连接对象
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		//sql语句
		String sql="select user_id,username,passwd,horoscope,district from user";
		//创建语句对象
		try {
			Statement stmt=conn.createStatement();
			//执行查询，返回结果集
			ResultSet rs=stmt.executeQuery(sql);
			//从结果集中循环数据
			while(rs.next()){
				User u=new User();
				u.setUser_id(rs.getString(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setHoroscope(rs.getString(4));
				u.setDistrict(rs.getString(5));
				ary.add(u);
				
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ary;
	}
	//添加用户
	public int add(User u){
		int flag=0;
		
		//建立连接
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		
		String sql="insert into user(user_id,username,passwd,horoscope,district) values(?,?,?,?,?)";
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, u.getUser_id());
			pstmt.setString(2, u.getUsername());
			pstmt.setString(3, u.getPassword());
			pstmt.setString(4, u.getHoroscope());
			pstmt.setString(5, u.getDistrict());
			flag=pstmt.executeUpdate();
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
		
	}
	public int delete(String user_id){
		int flag=0;
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		String sql="delete from user where user_id=?";
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,user_id);
			flag=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				pstmt.close();
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return flag;
	}
	
	//根据学号查找方法
	public User findById(String user_id){
		User u=null;
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		String sql="select * from user where user_id=?";
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,user_id);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				u=new User();
				u.setUser_id(rs.getString(1));
				u.setUsername(rs.getString(2));
				u.setPassword(rs.getString(3));
				u.setHoroscope(rs.getString(4));
				u.setDistrict(rs.getString(5));
				
				System.out.println(u.getUser_id());
			}
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return u;
	}
	//更新方法
	public int update(User s){
		int flag=0;
		
		//建立连接
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		
		String sql="update user set username=?,passwd=?,horoscope=?,district=? where user_id=?";
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(5, s.getUser_id());
			pstmt.setString(1, s.getUsername());
			pstmt.setString(2, s.getPassword());
			pstmt.setString(3, s.getHoroscope());
			pstmt.setString(4, s.getDistrict());
			flag=pstmt.executeUpdate();
			System.out.println(s.getUsername());
			pstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
		
	}

}
