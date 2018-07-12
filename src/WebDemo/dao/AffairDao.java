package WebDemo.dao;

import WebDemo.Data.AffairData;
import WebDemo.po.Userpo;
import WebDemo.util.JDBC;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AffairDao {

    /*
    得到事件信息
     */
    public List<AffairData> getAffairs(String userid, String situ) {
        System.out.println("Dao:"+userid+situ);
        com.mysql.jdbc.Connection con = JDBC.getConnection();
        List<AffairData> list= null;
        try{
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from affair where userid = ? and situ = ?");
            ps.setString(1,userid);
            ps.setString(2,situ);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs.toString());
            list = new ArrayList<AffairData>();
            while(rs.next()){
                AffairData data = new AffairData();
                data.setAffairName(rs.getString(3));
                data.setProcess(Integer.valueOf(rs.getString(4)));
                data.setUserId(rs.getString(2));
                data.setContent(rs.getString(7));
                data.setSitu(Integer.parseInt(rs.getString(1)));
                list.add(data);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(list.toString());
        return list;
    }
/*
添加事件
 */
    public boolean addAffair(AffairData data) {
        System.out.println("Dao:" + data.toString());
        System.out.println("data值："+data.getUserId());
        com.mysql.jdbc.Connection con = JDBC.getConnection();
        try {
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into affair(situ,userId,affairName,process,type,date,content,enterPrice) " +
                        "value (?,?,?,?,?,?,?,?)");
                ps.setInt(1,data.getSitu());
                ps.setString(2,data.getUserId());
                ps.setString(3,data.getAffairName());
                ps.setInt(4, data.getProcess());
                ps.setInt(5, data.getType());
                ps.setString(6, data.getDate());
                ps.setString(7,data.getContent());
                ps.setString(8,null);
                int rs = ps.executeUpdate();
                System.out.println("rs"+rs);
                if(rs!=0){
                    return true;
                }else return false;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
