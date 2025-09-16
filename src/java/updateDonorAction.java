/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import project.ConnectionProvider;

/**
 *
 * @author hp
 */
public class updateDonorAction extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             String id=request.getParameter("id");
            
            String name=request.getParameter("name");
            
            String father=request.getParameter("father");
            
        String date=request.getParameter("date");
            
            String mobilenumber=request.getParameter("mobilenumber");
            
            
            String email=request.getParameter("email");
            
            
            
            String address=request.getParameter("address");
             try{
                 Connection con=ConnectionProvider.getCon(); 
                 PreparedStatement ps=con.prepareStatement("update donor1 set name=?,father=?,date=?,mobilenumber=?,email=?,address=? where id=?");
                    
                     ps.setString(1,name);
                     ps.setString(2,father);
                     ps.setString(3,date);
                     ps.setString(4,mobilenumber);
                    
                     ps.setString(5,email);
                   
                     ps.setString(6,address);
                      ps.setString(7,id);
                     ps.executeUpdate();
                     response.sendRedirect("editDeleteList.jsp?msg=valid");
                 
               }
               catch(Exception e){
                    response.sendRedirect("editDeleteList.jsp?msg=invalid");
               }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
