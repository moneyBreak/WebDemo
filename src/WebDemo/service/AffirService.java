package WebDemo.service;

import WebDemo.Data.AffairData;
import WebDemo.dao.AffairDao;

import java.util.List;

public class AffirService {
    AffairDao dao = new AffairDao();
    /*
    查询结果返回
     */
    public List<AffairData> getAffair(String userid, String situ, int type, int process, String affairName, String date) {
        System.out.println("service"+userid+situ);
        List<AffairData> list = dao.getAffairs(userid,situ);
        if(list!=null){
            return list;
        }else return null;

    }
/*
添加结果返回
 */
    public boolean add(AffairData data) {
        if(data!=null){
            System.out.println("service data !=null");
            boolean result = dao.addAffair(data);
            if(result){
                System.out.println("添加成功");
                return true;
            }else return false;
        }
        return false;
    }
}
