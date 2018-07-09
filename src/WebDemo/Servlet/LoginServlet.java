package WebDemo.Servlet;

import WebDemo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private UserService us = new UserService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("������post����");
		request.setCharacterEncoding("utf-8");
		String username =  request.getParameter("username");
		String pass= request.getParameter("pass");
		request.getSession().setAttribute("username",username);
		request.getSession().setAttribute("pass",pass);
//获取验证码
		String check = request.getParameter("check");
		HttpSession session = request.getSession();
		String cur_check = (String) request.getAttribute("VerCode");

		boolean result = us.islogin(username,pass,check,cur_check);
		if(result==true) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
//		System.out.println(username);
//		System.out.println(pass);
//		if(username.equals("admin") && pass.equals("123")) {
//			System.out.println("输入正确");
//			request.setAttribute("username",username);
//			request.setAttribute("pass",pass);
//			request.getRequestDispatcher("index.jsp").forward(request, response);
//		}else {
//			request.getRequestDispatcher("ModeLogin.jsp").forward(request, response);
//		}
	}

}
