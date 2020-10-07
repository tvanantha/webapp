package net.javaguides.register.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.register.bean.Employee;
import net.javaguides.register.database.EmployeeDao;


@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	    private EmployeeDao employeeDao;

	    public void init() {
	        employeeDao = new EmployeeDao();
	    }

	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	        String Username = request.getParameter("Username");
	        String Email = request.getParameter("Email");
	        String Password = request.getParameter("Password");
	        String Confirm_Password = request.getParameter("Confirm_Password");
	        
	        Employee employee = new Employee();
	        employee.setUsername(Username);
	        employee.setEmail(Email);
	        employee.setPassword(Password);
	        employee.setConfirm__Password(Confirm_Password);
	        

	        try {
	            employeeDao.registerEmployee(employee);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("employeedetails.jsp");
	    }
}
