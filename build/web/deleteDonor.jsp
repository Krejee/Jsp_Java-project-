

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id=request.getParameter("id");
            try{
                Connection con=ConnectionProvider.getCon();
                    Statement st=con.createStatement();
                st.executeUpdate(" delete from donor1 where id='"+id+"'");
                response.sendRedirect("editDeleteList.jsp?msg=delete");
            }
            catch(Exception e){
                response.sendRedirect("editDeleteList.jsp?msg=invalid");
            }
            %>
    </body>
</html>
