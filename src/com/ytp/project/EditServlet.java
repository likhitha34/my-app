package com.ytp.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<center><h1>Update Employee</h1></center>");
        String sid=request.getParameter("id");
        int id=Integer.parseInt(sid);
        
        Emp e=EmpDao.getEmployeeById(id);
        out.print("<style>body {background-color: pink;}</style>");
        out.print("<form action='EditServlet2' method='post'>");
        out.print("<center><table></center>");
        out.print("<center><tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr></center>");
        out.print("<center><tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr></center>");
        out.print("<center><tr><td>Password:</td><td><input type='password' name='password' value='"+e.getPassword()+"'/></td></tr></center>");
        out.print("<center><tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr></center>");
        out.print("<center><tr><td>Country:</td><td></center>");
        out.print("<center><select name='country' style='width:150px'></center>");
        out.print("<center><option>India</option><c/enter>");
        out.print("<center><option>USA</option></center>");
        out.print("<center><option>UK</option></center>");
        out.print("<center><option>Other</option></center>");
        out.print("<center></select></center>");
        out.print("<center></td></tr></center>");
        out.print("<center><tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr></center>");
        out.print("<center></table></center>");
        out.print("<center></form></center>");
        
        out.close();
    }
}