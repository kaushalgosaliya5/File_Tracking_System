/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import database.operations;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.annotation.MultipartConfig;
import javax.swing.JOptionPane;


/**
 *
 * @author Gopal
 */
@WebServlet(urlPatterns = {"/file"})
//@WebServlet("/Relay")
@MultipartConfig
public class file extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/htm;charset=UTF-8");
        String uname;
        uname = request.getParameter("uname");
        String employee=request.getParameter("name");
        operations o = new operations();
        boolean flag=o.uname(uname);

        
        final String path=request.getParameter("temp");
        final Part filepart;
        String a;
        a = request.getParameter("abc");
        filepart = request.getPart("file");
        final String filename=getFileName(filepart);
        
         PrintWriter out=response.getWriter();
        InputStream inputStream = null; // input stream of the upload file
         OutputStream out1=null;
        // obtains the upload file part in this multipart request
        inputStream = request.getInputStream();
        try {
        out1 = new FileOutputStream(new File(path + File.separator + filename));
        inputStream = filepart.getInputStream();

        int read = 0;
        final byte[] bytes = new byte[1024];

        while ((read = inputStream.read(bytes)) != -1) {
            out1.write(bytes, 0, read);
        }
        out.println("New file " + filename + " created at " + path);
        LOGGER.log(Level.INFO, "File{0}being uploaded to {1}", 
                new Object[]{filename, path});
    }
        catch(Exception e)
            {
                
                }
    
        out.println("hey");
        operations op=new operations();
        op.upload(uname, employee, filename);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private String getFileName(Part filepart) {
        final String partHeader = filepart.getHeader("content-disposition");
    LOGGER.log(Level.INFO, "Part Header = {0}", partHeader);
    for (String content : filepart.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename")) {
            return content.substring(
                    content.indexOf('=') + 1).trim().replace("\"", "");
        }
    }
    return null;
    }

}
