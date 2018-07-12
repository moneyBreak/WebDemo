package WebDemo.Servlet;

import WebDemo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ChangeUserInfoServlet extends HttpServlet {
    private UserService service = new UserService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String id = request.getParameter("id");
        String number = request.getParameter("number");
        String sector = request.getParameter("sector");
        String place = request.getParameter("place");
        System.out.println(username);
        request.getSession().setAttribute("username",username);
        request.getSession().setAttribute("id",id);
        request.getSession().setAttribute("number",number);
        request.getSession().setAttribute("sector",sector);
        request.getSession().setAttribute("place",place);

        boolean result = service.isChange(username,id,number,sector,place);
        if(result){
            System.out.println("secess change");
            request.getRequestDispatcher("person.html").forward(request, response);
        }else System.out.println("fail change");



    }
}
