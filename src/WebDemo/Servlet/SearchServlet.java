package WebDemo.Servlet;

import WebDemo.Data.AffairData;
import WebDemo.service.AffirService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchServlet extends HttpServlet {
    AffirService service = new AffirService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String userid = request.getParameter("userid");
        String situ = request.getParameter("situ");
        int type = Integer.parseInt(request.getParameter("type"));
        int process = Integer.parseInt(request.getParameter("process"));
        String affairName = request.getParameter("affairName");
        String date = request.getParameter("date");
        System.out.println("userid"+userid);
        System.out.println("situ"+situ);

        request.getSession().setAttribute("userid",userid);
        request.getSession().setAttribute("situ",situ);
        request.getSession().setAttribute("process",process);
        request.getSession().setAttribute("affairName",affairName);
        request.getSession().setAttribute("date",date);

        System.out.println("servletSearch:"+userid+" "+situ+" "+type+" "+process+" "+affairName+" "+date+" ");

        List<AffairData> lists = new ArrayList<AffairData>();
        lists = service.getAffair(userid,situ,type,process,affairName,date);
        if(lists!=null){
            request.setAttribute("list",lists);
            request.getRequestDispatcher("all.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("index.html").forward(request, response);
        }
    }
}
