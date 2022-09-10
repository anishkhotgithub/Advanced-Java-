package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=getInitParameter("nm");
		PrintWriter out=response.getWriter();
		out.println("Welcome "+name);
		
		
		String websitename=getServletContext().getInitParameter("websitename");
		out.println("Welcome to "+websitename);
		
	}
}
