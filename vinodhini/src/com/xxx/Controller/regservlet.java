package com.xxx.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.Model.customer;
import com.xxx.bl.customCRUD;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/regservlet")
public class regservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public regservlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd;
		customer newcustomer = new customer();
		
		
		
		try {
		newcustomer.setName(request.getParameter("name"));
		newcustomer.setEmail_Address(request.getParameter("email"));

		String pass = request.getParameter("pwd").toString();
		String cpass = request.getParameter("cpwd").toString();

		if (pass.equals(cpass)) {
			System.out.println("inside if");
			newcustomer.setUser_Password(pass);
			customCRUD c = new customCRUD();
			if (c.sub(newcustomer)) {
				System.out.println("inside if if");

				request.setAttribute("status", true);
				request.setAttribute("message", "inserted successfully");				
				request.setAttribute("newcustomer", new customer());
			} else {
				System.out.println("inside if if else");

				request.setAttribute("status", true);
				request.setAttribute("message", "inserted not successfully");
				request.setAttribute("newcustomer", newcustomer);
			}
		} else {
			System.out.println("inside if else");

			request.setAttribute("status", true);
			request.setAttribute("message", "password and confirm password did not match");		
			request.setAttribute("newcustomer", newcustomer);
		}}
		catch(Exception e){
			if(e.getMessage().contains("primary key"))
		{
		   request.setAttribute("status", true);
		   request.setAttribute("message", "Email Is Already exists");
			request.setAttribute("newcustomer", newcustomer);
			System.err.println(e.getMessage());
		}
			else
			{
				request.setAttribute("status", true);
				   request.setAttribute("message", "Server Error Contact Admin");
					System.err.println(e.getMessage());
			}}
		rd = request.getRequestDispatcher("views/index.jsp");
		rd.forward(request, response);
	}
}


