

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="project.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2> <a class="active" href="index.jsp">Home</a></h2>


<html>
<head>
 <link rel="stylesheet" href="style.css" type="text/css" media="screen">
<style>
input[type="text"], input[type="password"], input[type="email"], select,input[type="number"],input[type="date"]
 
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	padding:15px;
	width:30%;	
	border-radius: 25px;
	margin-left:20%;
}
h2
{	
	margin-left:20%;
}
h1{
    margin-left: 30%;
}
hr
{
width:0%;

}
.btn{
    margin-left: 340px;
}
.container{
    margin-left: 180px;
}
</style>
</head>
<body>
<%
            
String msg=request.getParameter("msg");
if("valid".equals(msg)){
    %>
<center><font color="red" size="5">Successfully Added</font></center>
<%}%>
<%
    if("invalid".equals(msg)){
        %>
    }
    <center><font color="red" size="5">Some thing Went Wrong! Try Again !</font></center>
<%}%>
  
    <%
        int id=1;
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(id) from donor1");
            if(rs.first()){
                id=rs.getInt(1);
                id=id+1;
            }%>
            <div class="container">
               
                <h1 style="color: red;">Donor Form</h1>
                
           
           <% 
        }
        catch(Exception e)
        {
        
        }
        
        %>
        <div class="container">
            <form action="addNewDonorAction" method="post">
                <input type="hidden" name="id" value="<%out.println(id);%>">
                <h2>Name</h2>
                <input type="text" placeholder="Enter Name" name="name" required><hr>
                <h2>Father Name</h2>
                <input type="text" placeholder="Enter Father Name" name="father" required><hr>
                <h2>Date</h2>
                <input type="date" placeholder="Enter Date" name="date" required><hr>
                <h2>Mobile Number</h2>
                <input type="number" placeholder="Enter Mobile Number" name="mobilenumber" required><hr>
                <h2>Gender</h2>
                <select name="gender">
                    <option value="Male">Male</option> 
                    <option value="Female">Female</option> 
                    <option value="Other">Other</option> 
                      
                    
                </select>
                <h2>Email</h2>
                <input type="email" placeholder="Enter Email" name="email" required>
                <hr>
                <h2>Blood Group</h2>
                <select name="bloodgroup">
                    <option value="A+" >A+</option>  
                    <option value="A-" >A-</option>  
                    <option value="B+" >B+</option>  
                    <option value="B-" >B-</option>  
                    <option value="O+" >O+</option>  
                    <option value="O-" >O-</option>  
                    <option value="AB+" >AB+</option>  
                    <option value="AB-" >AB-</option>  
                    
                </select>
                <hr>
                <h2>Address</h2>
                <input type="text" placeholder="Enter Address" name="address" required><hr>
                <br>
                
                <div class="btn">
                    <button type="submit" class="button">Save</button>
                </div>
                
            </form>
        </div>
        
 </div>

<br>
<br>
<br>
<br>
<h3><center>copy right @.com :: 2024  </center></h3>

</body>
</html>