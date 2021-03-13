/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employe.controller;

import com.employe.dao.EmployeDAO;
import com.employe.pojo.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Krzysiek
 */
@WebServlet("/")
public class Servlet_employe extends HttpServlet {

    EmployeDAO empDAO = new EmployeDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List <Employee> employeList = empDAO.getListOfEmploye();
        request.setAttribute("employeList", employeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("employe-list.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    private void EmployeList(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException, ServletException{
        
    }
    
    private void updateEmploye(){
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
