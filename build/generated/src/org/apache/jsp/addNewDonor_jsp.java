package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import project.ConnectionProvider;
import java.sql.Connection;

public final class addNewDonor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<h2> <a class=\"active\" href=\"index.jsp\">Home</a></h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<style>\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"email\"], select,input[type=\"number\"],input[type=\"date\"]\n");
      out.write(" \n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    background:silver;\n");
      out.write("    height: 50px;\n");
      out.write("    font-size: 16px;\n");
      out.write("\tpadding:15px;\n");
      out.write("\twidth:30%;\t\n");
      out.write("\tborder-radius: 25px;\n");
      out.write("\tmargin-left:20%;\n");
      out.write("}\n");
      out.write("h2\n");
      out.write("{\t\n");
      out.write("\tmargin-left:20%;\n");
      out.write("}\n");
      out.write("h1{\n");
      out.write("    margin-left: 30%;\n");
      out.write("}\n");
      out.write("hr\n");
      out.write("{\n");
      out.write("width:0%;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("    margin-left: 340px;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    margin-left: 180px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");

            
String msg=request.getParameter("msg");
if("valid".equals(msg)){
    
      out.write("\n");
      out.write("<center><font color=\"red\" size=\"5\">Successfully Added</font></center>\n");
}
      out.write('\n');

    if("invalid".equals(msg)){
        
      out.write("\n");
      out.write("    }\n");
      out.write("    <center><font color=\"red\" size=\"5\">Some thing Went Wrong! Try Again !</font></center>\n");
}
      out.write("\n");
      out.write("  \n");
      out.write("    ");

        int id=1;
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select max(id) from donor1");
            if(rs.first()){
                id=rs.getInt(1);
                id=id+1;
            }
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("               \n");
      out.write("                <h1 style=\"color: red;\">Donor Form</h1>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("           ");
 
        }
        catch(Exception e)
        {
        
        }
        
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"addNewDonorAction\" method=\"post\">\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
out.println(id);
      out.write("\">\n");
      out.write("                <h2>Name</h2>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Name\" name=\"name\" required><hr>\n");
      out.write("                <h2>Father Name</h2>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Father Name\" name=\"father\" required><hr>\n");
      out.write("                <h2>Date</h2>\n");
      out.write("                <input type=\"date\" placeholder=\"Enter Date\" name=\"date\" required><hr>\n");
      out.write("                <h2>Mobile Number</h2>\n");
      out.write("                <input type=\"number\" placeholder=\"Enter Mobile Number\" name=\"mobilenumber\" required><hr>\n");
      out.write("                <h2>Gender</h2>\n");
      out.write("                <select name=\"gender\">\n");
      out.write("                    <option value=\"Male\">Male</option> \n");
      out.write("                    <option value=\"Female\">Female</option> \n");
      out.write("                    <option value=\"Other\">Other</option> \n");
      out.write("                      \n");
      out.write("                    \n");
      out.write("                </select>\n");
      out.write("                <h2>Email</h2>\n");
      out.write("                <input type=\"email\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("                <hr>\n");
      out.write("                <h2>Blood Group</h2>\n");
      out.write("                <select name=\"bloodgroup\">\n");
      out.write("                    <option value=\"A+\" >A+</option>  \n");
      out.write("                    <option value=\"A-\" >A-</option>  \n");
      out.write("                    <option value=\"B+\" >B+</option>  \n");
      out.write("                    <option value=\"B-\" >B-</option>  \n");
      out.write("                    <option value=\"O+\" >O+</option>  \n");
      out.write("                    <option value=\"O-\" >O-</option>  \n");
      out.write("                    <option value=\"AB+\" >AB+</option>  \n");
      out.write("                    <option value=\"AB-\" >AB-</option>  \n");
      out.write("                    \n");
      out.write("                </select>\n");
      out.write("                <hr>\n");
      out.write("                <h2>Address</h2>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter Address\" name=\"address\" required><hr>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <div class=\"btn\">\n");
      out.write("                    <button type=\"submit\" class=\"button\">Save</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h3><center>copy right jkkt  :: 2023  </center></h3>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
