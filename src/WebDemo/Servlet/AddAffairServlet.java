package WebDemo.Servlet;

import WebDemo.Data.AffairData;
import WebDemo.service.AffirService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddAffairServlet extends HttpServlet {
    AffirService service = new AffirService();
    /*
    服务添加
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ok = "添加成功";
        request.setCharacterEncoding("utf-8");
        String userid = "123";
        int situ = Integer.parseInt(request.getParameter("situ"));
        int type = Integer.parseInt(request.getParameter("type"));
        int process = Integer.parseInt(request.getParameter("process"));
        String affairName = request.getParameter("affairName");
        String content = request.getParameter("contet");
        String date = request.getParameter("date");

        AffairData data = new AffairData();
        data.setSitu(situ);
        data.setUserId(userid);
        data.setType(type);
        data.setProcess(process);
        data.setAffairName(affairName);
        data.setContent(content);
        data.setDate(date);
        boolean result = service.add(data);
        if(result){
            request.setAttribute("ok",ok);
            request.getRequestDispatcher("all.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }
}
