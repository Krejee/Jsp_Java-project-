

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="header.jsp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.*" %>

<html>
<head>
 <link rel="stylesheet" href="style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="email"], select,input[type="number"]
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	padding:15px;
	width:60%;	
	border-radius: 25px;
	margin-left:20%;
}
h2,h1
{	
	margin-left:20%;
}
hr
{
width:60%;	
}
</style>
</head>
<body>
    
<%
    String id=request.getParameter("id");
                try{
                    Connection con=ConnectionProvider.getCon();
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from donor1 where id='"+id+"'");
                    while(rs.next())
                    {
                        %>
                        <div class="container">
                            <form action="updateDonorAction"  method="post">
                                <input type="hidden" name="id" value="<%out.println(id);%>" >
                                <h2>Name</h2>
                                <input type="text" value="<%=rs.getString(2)%>" name="name">"
                              <h2>Father Name</h2>
                <input type="text" value="<%=rs.getString(3)%>" name="father" required><hr>
                <h2>Date</h2>
                <input type="text" value="<%=rs.getString(4)%>" name="date" required><hr>
                <h2>Mobile Number</h2>
                <input type="number" value="<%=rs.getString(5)%>" name="mobilenumber" required><hr>
                    <h2>Email</h2>
                <input type="email" value="<%=rs.getString(7)%>" name="email" required>
                <hr>    
                <h2>Address</h2>
                <input type="text" value="<%=rs.getString(9)%>" name="address" required>
                <br><center><button type="submit" class="button">Save</button></center>
                            </form> 
                            
                        </div>


    <%
        }
}
catch(Exception e){
System.out.println(e);
}
%>
<br>
<br>
<br>
<br>
<h3><center>copy right @.com :: 2024  </center></h3>

</body>
</html>