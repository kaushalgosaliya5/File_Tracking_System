<%-- 
    Document   : Registration
    Created on : Apr 24, 2016, 1:24:40 AM
    Author     : Gopal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     
    </head>
    <body>
    <center><h1> Registration Page</h1></center>
    <center>
        <form method="post" name="regi" action="registrationpage">
           
               <table>
                <tr>
                    <td>
                        Name
                    </td>
                    <td>
                        <input type="text" name="name"> 
                    </td>
                </tr>
                <tr>
                    <td>
                        Middle Name
                    </td>
                    <td>
                        <input type="text" name="midname"> 
                    </td></tr>
                    <tr>
                    <td>
                        Last Name
                    </td>
                    <td>
                        <input type="text" name="lastname"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        occupation
                    </td>
                    <td>
                        <input type="text" name="occ"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        Username
                    </td>
                    <td>
                        <input type="text" name="uname"> 
                    </td>
                    </tr>
                                        <tr>
                    <td>
                        Password
                    </td>
                    <td>
                        <input type="password" name="pwd"> 
                    </td>
                    </tr>
                                        <tr>
                    <td>
                        Address
                    </td>
                    <td>
                        <input type="text" name="add"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        Pincode
                    </td>
                    <td>
                        <input type="textarea" name="pin"> 
                    </td>
                    </tr>
                                        <tr>
                    <td>
                        City
                    </td>
                    <td>
                        <input type="text" name="city"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        Country
                    </td>
                    <td>
                        <input type="text" name="country"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        Year
                    </td>
                    <td>
                        <input type="text" name="year"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        Month
                    </td>
                    <td>
                        <input type="text" name="month"> 
                    </td>
                    </tr>
                    <tr>
                    <td>
                        date
                    </td>
                    <td>
                        <input type="text" name="date"> 
                    </td>
                    </tr>
                    <td>
                        Type
                    </td>
                    <td>
                       <select name="Type">
                            <option value="Citizen">Citizen</option>
                            <option value="Employee">Employee</option>
                            <option value="Admin">Administration</option>
                        </select>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Registration" name="btn">
                    </td>
                    <td>
                        <input type=resets value="reset" name="reset">                         
                    </td>
                    </tr>



            </table>
           
        </form>
    </center>     
    </body>
</html>
+