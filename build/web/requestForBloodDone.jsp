
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="project.ConnectionProvider" %>
<%@page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String mobilenumber=request.getParameter("mobilenumber");
            try{
               Connection con=ConnectionProvider.getCon();
               PreparedStatement ps=con.prepareStatement("Update bloodrequest set status='completed'where mobilenumber=?");
               ps.setString(1,mobilenumber);
               ps.executeUpdate();
               response.sendRedirect("requestForBlood.jsp");
            }
            catch(Exception e){
                 response.sendRedirect("requestForBlood.jsp");
            }
            
            %>
    </body>
</html>
