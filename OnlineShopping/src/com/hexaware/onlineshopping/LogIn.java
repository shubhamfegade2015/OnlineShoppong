package com.hexaware.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LogIn
 */
@WebServlet("/LogIn")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con=null;
	private static PreparedStatement pstmt =null;
	
	
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		con=DBConnection.getDBConnection();
		PrintWriter pw = resp.getWriter();
		
		try {
			
			pstmt=con.prepareStatement("select uname,upass from user where uname=? and upass=?");
			String uname= req.getParameter("uname");
			String upass=req.getParameter("upass");
			resp.setContentType("text/html");
			pstmt.setString(1,uname);
			pstmt.setString(2,upass);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.getString("uname").equals(uname) && rs.getString("upass").equals(upass) ) {
				pw.println("<script type=\"text/javascript\">");
			    pw.println("alert('User Logged in Successfully');");
			    pw.println("</script>");
				resp.sendRedirect("/OnlineShopping/WebContent/JSPs/Home.jsp");
				
				
			}
			else {
				pw.println("<script type=\"text/javascript\">");
			    pw.println("alert('Login Failed');");
			    pw.println("</script>");
			    resp.sendRedirect("/OnlineShopping/WebContent/JSPs/RegisterUser.jsp");
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
		}

}
