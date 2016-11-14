/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationpage;

import database.operations;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Gopal
 */
@WebServlet(name = "registrationpage", urlPatterns = {"/registrationpage"})
public class registrationpage extends HttpServlet {

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
        PrintWriter out=response.getWriter();
                String name = request.getParameter("name");
        String mname = request.getParameter("midname");
        String lname=request.getParameter("lastname");
        String occ=request.getParameter("occ");
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        String add=request.getParameter("add");
        int pin;
        pin = Integer.parseInt(request.getParameter("pin"));
        String city=request.getParameter("city");
        String country=request.getParameter("country");
        int year=Integer.parseInt(request.getParameter("year"));
        int month=Integer.parseInt(request.getParameter("month"));
        int date=Integer.parseInt(request.getParameter("date"));
        String type=request.getParameter("Type");
        boolean valid = false;
        try {
             out.println("ok");
            operations op = new operations();
            op.insertdata(name,mname,lname,occ,uname,pwd,add,pin,city,country,year,month,date,type);
            
            op.closeConnection();
            out.println("ok");
            
            
        } catch(Exception e){
            out.println("error");
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
