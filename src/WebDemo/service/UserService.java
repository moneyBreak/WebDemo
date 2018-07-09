package WebDemo.service;

import WebDemo.dao.Userdao;
import WebDemo.po.Userpo;

public class UserService {
    Userdao ud = new Userdao();
    public boolean islogin(String username, String pass, String check, String cur_check) {
        // �����û���¼�ж�
        // ��ȡ���ݿ�����
        Userpo up = ud.getUserByUserName(username);
        if (up!=null && username.equals(up.getUsername()) && pass.equals(up.getPass()) && check.equals(cur_check)) {
            return true;
        } else {
            return false;
        }
    }

}
