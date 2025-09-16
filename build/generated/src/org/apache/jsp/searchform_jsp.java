package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import project.ConnectionProvider;
import java.sql.Connection;

public final class searchform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("<!--        <style>\n");
      out.write("            .h1a{\n");
      out.write("                margin-top:5%;\n");
      out.write("                margin-left:35%;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("            .search{\n");
      out.write("                margin-top:10%;\n");
      out.write("                font-size:30px;                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>-->\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("input[type=\"text\"], input[type=\"password\"], input[type=\"email\"], select,input[type=\"number\"],input[type=\"date\"]\n");
      out.write(" \n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    background:silver;\n");
      out.write("    height: 50px;\n");
      out.write("    font-size: 16px;\n");
      out.write("\tpadding:15px;\n");
      out.write("\twidth:20%;\t\n");
      out.write("\tborder-radius: 25px;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("    margin-left: 340px;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    margin-left: 180px;\n");
      out.write("}\n");
      out.write("            .h1a{\n");
      out.write("                margin-top:5%;\n");
      out.write("                margin-left:35%;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("            .search{\n");
      out.write("                margin-top:10%;\n");
      out.write("                font-size:30px;\n");
      out.write("            }\n");
      out.write("           .btn{\n");
      out.write("    margin-left: 30px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"searchform\" method=\"post\">\n");
      out.write("            ");
   Connection con=ConnectionProvider.getCon();
           Statement stmt=con.createStatement();  
           ResultSet rs=stmt.executeQuery("select * from stock");      
            
          
      out.write("\n");
      out.write("          <div class=\"h1a\">   <h1> Search for Blood</h1></div>\n");
      out.write("       <div class=\"search\">   <center>  Blood Group :   \n");
      out.write("            <select name=\"bloodgroup\" placeholder=\"Select Blood Group\">\n");
      out.write("               ");
  while (rs.next()){
                   
               
      out.write("<option value=\"");
      out.print(rs.getInt(1));
      out.write('"');
      out.write('>');
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("          </center>\n");
      out.write("       \n");
      out.write("            <br><br>\n");
      out.write(" <div class=\"btn\">\n");
      out.write("     <center> <button type=\"submit\" class=\"button\">Search</button></center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
