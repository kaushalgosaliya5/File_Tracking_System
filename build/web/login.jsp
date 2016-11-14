<%-- 
    Document   : login
    Created on : Apr 19, 2016, 4:57:12 PM
    Author     : Gopal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <center><h1>Login</h1></center>
        <script>
            function loginuser()
            {
                document.login.action="loginuser";
                document.login.submit();
            }
            function reg()
            {
                document.login.action="Registration.jsp";
                document.login.submit();
            }
        </script>
    </head>
    <body>
      
    <center>
        <form method="post" name="login">
            <table>
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username"></td> 
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td>user type</td>
                    <td>
                        <select name="usertype">
                            <option value="Citizen">Citizen</option>
                            <option value="Employee">Employee</option>
                            <option value="Admin">Administration</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="button" value="Login" name="bt" onclick="loginuser()">
                    </td>
                    <td>
                        <input type="button" value="Registration" name="btn" onclick="reg()">
                    </td>
                </tr>
            </table>
        </form>
       
    </center>
        </div>
    </body>
</html>
