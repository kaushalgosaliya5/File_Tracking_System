<%-- 
    Document   : down
    Created on : May 8, 2016, 4:45:03 AM
    Author     : Gopal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="java.io.*"  %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
      final  String  path="e:/Upload" ; 
        
        File f = new File(path);
        File[] arrFiles= f.listFiles();
        for(int i=0;i<arrFiles.length;i++) {
            %>
            
    <table >
        <tr>
            <td><ul><li><a href="File?val=<%=arrFiles[i].getName()%>"><%=arrFiles[i].getName()%></a></li></ul></td>
        </tr>
        
    </table>
            
            
            
            
            
            <%
            
            //out.println("\n"+arrFiles[i].getName());
        }
        %>
        
        
        
        
    </head>
    <body>
        
    </body>
</html>
