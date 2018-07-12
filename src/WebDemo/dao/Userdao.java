package WebDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import WebDemo.Data.AffairData;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import WebDemo.po.Userpo;
import WebDemo.util.JDBC;

public class Userdao {
	public Userpo getUserByUserName(String username) {
		// �������ݿ�����
		Connection con = JDBC.getConnection();
		Userpo up= null;
		// �������ݿ�sql���
		try {
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from userinfo where userAccount = ?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				// ÿ�λ�ȡsql�������һ������
				up = new Userpo();
				up.setUsername(rs.getString(1));
				up.setPass(rs.getString(2));
				up.setId(rs.getString(3));
				up.setNumber(rs.getString(5));
				up.setPlace(rs.getString(4));
				up.setSector(rs.getString(5));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		System.out.println("username:"+up.getUsername() + "userpass"+up.getPass());
		return up;
	}
	public boolean changeUserInfo(String username,String id,String number,String sector,String place){
		System.out.println(id);
		System.out.println(username);
		System.out.println(number);
		System.out.println(sector);
		System.out.println(place);
		java.sql.Connection cn = JDBC.getConnection();
		try{

			PreparedStatement state = (PreparedStatement) cn.prepareStatement("update userinfo set Id =?,phone=?,sector=?,place=? where userAccount=?");
			state.setString(1,id);
			state.setString(2,number);
			state.setString(3,sector);
			state.setString(4,place);
			state.setString(5, username);
			int rs = state.executeUpdate();
			System.out.println(rs);
			if(rs!=0){
				return true;
			}else return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
