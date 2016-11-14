    <html>
     <!-- <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=windows-1252"></meta>
        <title>untitled1</title>
       
        <script>
            function download()
            {
              
            }
        </script>
      </head>-->
      <body>
     
           <% String id = request.getParameter("name");
          // request.setAttribute(name, o);
           
           %>
           
         
         <form action="upload" method="post" enctype="multipart/form-data">
              Employee name <input type="text" name="name" value=<%=id%>>
         Citizen name <input type="text" name="uname"/>
            Select File:<input type="file" name="fname"/><br/>
            <%
         //   request.setAttribute("USERNAME", );
            
            %>
            <input type="submit" value="submit"/>
        </form>
         
              
    <!--  <input type="submit" value="ok">-->
      
    
      </body>
    </html>    
