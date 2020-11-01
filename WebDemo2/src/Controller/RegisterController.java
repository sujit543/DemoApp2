package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String loginId =request.getParameter("loginId");
		String password =request.getParameter("passwd");
		String customerName=request.getParameter("customerName");
		String emailId =request.getParameter("emailId");
		String mobileNo =request.getParameter("mobileNo");
		String address =request.getParameter("addr");
		String country =request.getParameter("country");
		
		ModelViewController.User userobj=new ModelViewController.User(); 
		userobj.setLoginid(loginId);
		userobj.setPassword(password);
		userobj.setCustomerName(customerName);
		userobj.setEmailid(emailId);
		userobj.setMobile(mobileNo);
		userobj.setAddress(address);
		userobj.setCountry(country);
		try {
			dao.UserDAO userDAO=new UserDAO();
			if(userDAO.insertCustomer(userobj))
			{
				request.setAttribute("loginId",loginId );
				RequestDispatcher dispatcher=request.getRequestDispatcher("Succes.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				request.setAttribute("ErrorInfo","problim occured while Inserting" );
				RequestDispatcher dispatcher=request.getRequestDispatcher("Register.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("ErrorInfo","Exection occured while Inserting"+e.getMessage() );
			RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response);
		}
		
		
			
	}
	

}
