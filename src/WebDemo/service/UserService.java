package WebDemo.service;

import WebDemo.dao.Userdao;
import WebDemo.po.Userpo;

public class UserService {
    Userdao ud = new Userdao();
    /*
    登陆判断
     */
    public boolean islogin(String username, String pass, String check, String cur_check) {
        Userpo up = ud.getUserByUserName(username);
        if (up!=null && username.equals(up.getUsername()) && pass.equals(up.getPass()) && check.equals(cur_check)) {
            System.out.println("111");
            return true;
        } else {
            System.out.println("222");
            return false;
        }
    }
/*
修改信息回调
 */
    public boolean isChange(String username,String id,String number,String sector,String place) {
        System.out.println(username);
        boolean  result= ud.changeUserInfo(username,id,number,sector,place);
        if(result){
            System.out.println(1111);
            return true;
        }else {
            System.out.println(2222);
            return false;
        }
    }
}
