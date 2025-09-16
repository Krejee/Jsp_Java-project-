<%-- 
    Document   : searchform
    Created on : 6 Oct, 2023, 9:17:11 AM
    Author     : hp
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" type="text/css" media="screen">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<!--        <style>
            .h1a{
                margin-top:5%;
                margin-left:35%;
                font-size:30px;
            }
            .search{
                margin-top:10%;
                font-size:30px;                
            }
            
        </style>-->
        
        <style>
input[type="text"], input[type="password"], input[type="email"], select,input[type="number"],input[type="date"]
 
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	padding:15px;
	width:20%;	
	border-radius: 25px;
}
.btn{
    margin-left: 340px;
}
.container{
    margin-left: 180px;
}
            .h1a{
                margin-top:5%;
                margin-left:35%;
                font-size:30px;
            }
            .search{
                margin-top:10%;
                font-size:30px;
            }
           .btn{
    margin-left: 30px;
}
</style>
    </head>
    <body>
        <form action="searchform" method="post">
            <%   Connection con=ConnectionProvider.getCon();
           Statement stmt=con.createStatement();  
           ResultSet rs=stmt.executeQuery("select * from stock");      
            
          %>
          <div class="h1a">   <h1> Search for Blood</h1></div>
       <div class="search">   <center>  Blood Group :   
            <select name="bloodgroup" placeholder="Select Blood Group">
               <%  while (rs.next()){
                   
               %><option value="<%=rs.getInt(2)%>"><%=rs.getString(1)%></option>
            <%}%>
                </select>
          </center>
       
            <br><br>
 <div class="btn">
     <center> <button type="submit" class="button">Search</button></center>
                </div>
            </div>
        </form>
    </body>
</html>
