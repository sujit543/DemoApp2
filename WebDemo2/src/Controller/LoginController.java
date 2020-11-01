package Controller;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String loginId=request.getParameter("loginId");
		String Password=request.getParameter("passwd");
		
		ModelViewController.User userobj=new ModelViewController.User();
		
		userobj.setLoginid(loginId);
		userobj.setPassword(Password);
		
		if(userobj.checklogin()) {
			request.setAttribute("loginId",loginId);
			RequestDispatcher dispatcher=request.getRequestDispatcher("Succes.jsp");
			dispatcher.forward(request, response);	
		}
		else {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Failure.jsp"); 
			dispatcher.forward(request,response);
		}
			
	}

}
