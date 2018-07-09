package WebDemo.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class JDBC {
	public static String url = "localhost";
	public static String port = "3306";
	public static String database = "moneysql";
	public static String username = "root";
	public static String pass = "";
	// ��֤�������ݴ��䲻������
	public static String encode = "?useUnicode=true&characterEncoding=UTF-8";
	// Javaÿ�β������ݿⶼ��Ҫ��������ݿ������
	public static Connection getConnection () {
		Connection con =null;
		try {
			// ͨ���෴������MySQL������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������MySQL�ĵ�ַ�ַ���
			String mysqlurl = "jdbc:mysql://"+url +":"+port +"/"+database+encode;
			// ���һ�����ݿ�����
			con = (Connection) DriverManager.getConnection(mysqlurl, username, pass);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
