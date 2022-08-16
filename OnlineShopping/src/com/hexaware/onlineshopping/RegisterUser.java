package com.hexaware.onlineshopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.hexaware.servletjspdb.DBConnection;

/**
 * Servlet implementation class Registeruser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con=null;
	private static PreparedStatement pstmt =null;
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
		con=DBConnection.getDBConnection();
		
		
		try {
			
			pstmt=con.prepareStatement("insert into student values(?,?,?,?)");
			PrintWriter pw=resp.getWriter();
			resp.setContentType("text/html");
			String uname= req.getParameter("uname");
			String upass=req.getParameter("upass");
			String uemail=req.getParameter("uemail");
			String umob=req.getParameter("umob");
			pstmt.setString(1,uname);
			pstmt.setString(2,upass);
			pstmt.setString(3,uemail);
			pstmt.setString(4,umob);
			int i=pstmt.executeUpdate();
			if (i!=0) {
				//pw.println("Student Added Successfully...");
				pw.println("<script type=\"text/javascript\">");
			    pw.println("alert('User Added Successfully');");
			    pw.println("</script>");
				resp.sendRedirect("/OnlineShopping/WebContent/JSPs/login.jsp");
			}
			else {
				//pw.println("Student not Added...");
				pw.println("<script type=\"text/javascript\">");
			    pw.println("alert('User Not Added');");
			    pw.println("</script>");
			    resp.sendRedirect("/OnlineShopping/WebContent/JSPs/RegisterUser.jsp");
			}
			con.close();
			//| NullPointerException e
		}catch(SQLException e){
			e.printStackTrace();
		}
			
	}
}
