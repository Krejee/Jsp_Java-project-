

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

.mySlides {display:none;}

input[type="text"], input[type="mail"]
{
    border: none;
    background:silver;
    height: 50px;
    font-size: 16px;
	margin-left:2%;
	padding:15px;	
}
</style>
</head>
<body>
 <%
      String msg=request.getParameter("msg");
      if("valid".equals(msg)){
       %> 
    
<center><font color="red" size="5">Form Submitted Successfully</center>
<%
      }
      %>

    <%
    
      if("invalid".equals(msg)){
       %> 
<center><font color="red" size="5">Invalid Data! Try Again</center>
<%
      }
      %>

<center><h1>Enter Your Details to Request for Blood</h1></center>
<form action="indexFormAction" method="post">
    <center>
        <input type="text" name="name" placeholder="Enter Name" required>
         <input type="text" name="mobilenumber" placeholder="Enter Mobile number" required>
          <input type="mail" name="email" placeholder="Enter Email Adderess" required>
           <input type="text" name="bloodgroup" placeholder="Enter Blood Group" required>
           <button class="button1"><span>Submit</span></button>
    </center>
</form>
 
 
  <br>
  <br>
  </div>
</div>

<div class="row1"> 
<div class="container"> 
<br>         
<br>
    </tbody>
  </table>
</div>
</div>
<h3><center> copy right @.com :: 2024  </center></h3>

</body>
</html>
