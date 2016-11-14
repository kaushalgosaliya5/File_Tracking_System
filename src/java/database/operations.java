/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gopal
 */
public class operations {
    
    String db_url = "jdbc:mysql://localhost/fts";
    String jdbc = "com.mysql.jdbc.Driver";
    Connection con;
    
    public operations() throws ClassNotFoundException, SQLException{
  
            Class.forName(jdbc);
            con = DriverManager.getConnection(db_url, "root","");
       
    }
    
    public boolean validateUser(String uname,String upass,String type) throws SQLException{
        boolean flag = false;
        Statement stmt = con.createStatement();
        String a="select * from login where username = '"+uname+"' and password = '"+upass+"' and type='"+type+"'";
        ResultSet rs = stmt.executeQuery(a);
        if(rs.next()){
            flag = true;
        }
        stmt.close();
        return flag;
    }
    public void upload(String uname,String empname,String fileName) throws SQLException
    {
        String a="INSERT INTO filedetails (Username, Employee, uploadfile) values ('"+uname+"','"+ empname+"','"+ fileName+"')";
        PreparedStatement stmt=con.prepareStatement(a);
       /* stmt.setString(1,uname);
        stmt.setString(2, empname);
        stmt.setBlob(3, is);
      */
   
        stmt.executeUpdate(a);
        
    }
    public void upload(String uname,String empname,InputStream fileName) throws SQLException
    {
        String a="INSERT INTO filedetails (Username, Employee, uploadfile) values ('"+uname+"','"+ empname+"','"+ fileName+"')";
        PreparedStatement stmt=con.prepareStatement(a);
       /* stmt.setString(1,uname);
        stmt.setString(2, empname);
        stmt.setBlob(3, is);
      */
   
        stmt.executeUpdate(a);
        
    }
    public void insertdata(String name,String mname,String lname,String occ,String uname,String pwd,String add,int pin,String city,String country,int year,int month,int date,String type) throws SQLException
    {
        Statement stmt=con.createStatement();
        String a="Insert into registration Values('"+name+"','"+mname+"','"+lname+"','"+occ +"','"+uname+"','"+pwd+"','"+add +"','"+pin +"','"+city +"','"+country +"','"+year+"/"+month+"/"+date+"','"+type+"')";
        String b="Insert into login values('"+uname+"','"+pwd+"','"+type+"')";
        stmt.executeUpdate(a);
        stmt.executeUpdate(b);
          }
    
    public void closeConnection(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean uname(String uname) throws SQLException {
        String a;
        boolean flag = false;
        a = "Select username from login Where 'Username'='"+uname+"';";
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery(a);
        stmt.executeUpdate(a);
        if(rs.next()){
            flag = true;
        }
        stmt.close();
        return flag;
        
    }
}