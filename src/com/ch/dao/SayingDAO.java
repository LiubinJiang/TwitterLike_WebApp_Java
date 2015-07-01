package com.ch.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.bean.Saying;
import com.ch.util.DBUtil;
public class SayingDAO {
	//ȡ����������
	public List<Saying> getSaying() {
		//����һ�����϶��󣬳�����������
		List<Saying> ary=new ArrayList<Saying>();
		//����һ�����Ӷ���
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		System.out.println(conn);
		//sql���
		String sql="select user_id,saying_id,sayinginfo from saying";
		//����������
		try {
			Statement stmt=conn.createStatement();
			//ִ�в�ѯ�����ؽ����
			ResultSet rs=stmt.executeQuery(sql);
			//�ӽ������ѭ������
			while(rs.next()){
				Saying s=new Saying();
				System.out.println(rs.getString(1));
				s.setUser_id(rs.getString(1));
				s.setSaying_id(rs.getInt(2));
				s.setSayinginfo(rs.getString(3));
				ary.add(s);
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
	//���
	public int add(Saying s){
		int flag=0;
		
		//��������
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		
		String sql="insert into saying(user_id,saying_id,sayinginfo) values(?,?,?)";
		
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, s.getUser_id());
			pstmt.setInt(2, s.getSaying_id());
			pstmt.setString(3, s.getSayinginfo());
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
	public int runningId(){
		DBUtil db=new DBUtil();
		Connection conn=db.getConnection();
		String sql="select max(saying_id) from saying";
		int saying_id=0;
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				saying_id=rs.getInt(1);
			}
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
		return saying_id;
	}

}
