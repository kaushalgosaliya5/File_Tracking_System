<%-- 
    Document   : employeemain
    Created on : Apr 24, 2016, 1:07:40 AM
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
           <% String id = request.getParameter("name");%>
           <h1>Hello !<%=id%></h1>

   
</div>
        <form method="post" action="fileupload.jsp" name="fu">
        <table>
            <tr>
                <td>
                    File Upload
                </td>
            </tr>
            <tr><td>
                    Employee name <input type="text" name="name" value=<%=id%>>
                    <input type="submit" value=Upload name="btn">
                    <%
                    request.setAttribute("empName", id);
                    Cookie cookie = new Cookie("EmpName", id);
                    response.addCookie(cookie);
                    cookie.setMaxAge(360*24*60);
                     %>
                    
                   
                </td>
            </tr>
            
        </table>
                     
        </form>
<form method="post" action="login.jsp" name="fun">
                    <input type="submit" value=logout name="btn">
                     </form> 
                      
                      <form method="post" action="down.jsp" name="fu">
                    <input type="submit" value=Download name="btn">
                     </form> 
    </body>
</html>