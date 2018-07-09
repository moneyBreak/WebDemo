package WebDemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from users where username = ?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				// ÿ�λ�ȡsql�������һ������
				up = new Userpo();
				up.setUsername(rs.getString(1));
				up.setPass(rs.getString(2));
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return up;
	}
}
