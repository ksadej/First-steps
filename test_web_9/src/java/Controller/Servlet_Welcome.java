/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Employee;
import Util.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author Krzysiek
 */
@WebServlet("/")
public class Servlet_Welcome extends HttpServlet {

    
    Employee employee = new Employee();
    Impl_Welcome employeeDaoImpl = new Impl_Welcome();

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List <Employee> employeList = employeeDaoImpl.getEmployee();
        request.setAttribute("employeList", employeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Employee_list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            String ename = request.getParameter("ename");
            String lname = request.getParameter("lname");
            
            Employee employee = new Employee();
            employee.setEname(ename);
            employee.setLname(lname);
            
            employeeDaoImpl.saveEmployee(employee);
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
