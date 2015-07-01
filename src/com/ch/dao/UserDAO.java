package com.ch.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.User;
import com.ch.util.DBUtil;
public class UserDAO {
	//ȡ����������
	public List<User> getUser() {
		//����һ�����϶��󣬳�����������
		List<User> ary=new ArrayList<User>();
		//����һ�����Ӷ���
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		//sql���
		String sql="select user_id,username,passwd,horoscope,district from user";
		//����������
		try {
			Statement stmt=conn.createStatement();
			//ִ�в�ѯ�����ؽ����
			ResultSet rs=stmt.executeQuery(sql);
			//�ӽ������ѭ������
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
	//����û�
	public int add(User u){
		int flag=0;
		
		//��������
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
	
	//����ѧ�Ų��ҷ���
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
	//���·���
	public int update(User s){
		int flag=0;
		
		//��������
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
