package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import project.ConnectionProvider;
import java.sql.Connection;

public final class Request_0020form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write(".mySlides {display:none;}\n");
      out.write("\n");
      out.write("input[type=\"text\"], input[type=\"mail\"]\n");
      out.write("{\n");
      out.write("    border: none;\n");
      out.write("    background:silver;\n");
      out.write("    height: 50px;\n");
      out.write("    font-size: 16px;\n");
      out.write("\tmargin-left:2%;\n");
      out.write("\tpadding:15px;\t\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" ");

      String msg=request.getParameter("msg");
      if("valid".equals(msg)){
       
      out.write(" \n");
      out.write("    \n");
      out.write("<center><font color=\"red\" size=\"5\">Form Submitted Successfully</center>\n");

      }
      
      out.write("\n");
      out.write("\n");
      out.write("    ");

    
      if("invalid".equals(msg)){
       
      out.write(" \n");
      out.write("<center><font color=\"red\" size=\"5\">Invalid Data! Try Again</center>\n");

      }
      
      out.write("\n");
      out.write("\n");
      out.write("<center><h1>Enter Your Details to Request for Blood</h1></center>\n");
      out.write("<form action=\"indexFormAction\" method=\"post\">\n");
      out.write("    <center>\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Enter Name\" required>\n");
      out.write("         <input type=\"text\" name=\"mobilenumber\" placeholder=\"Enter Mobile number\" required>\n");
      out.write("          <input type=\"mail\" name=\"email\" placeholder=\"Enter Email Adderess\" required>\n");
      out.write("           <input type=\"text\" name=\"bloodgroup\" placeholder=\"Enter Blood Group\" required>\n");
      out.write("           <button class=\"button1\"><span>Submit</span></button>\n");
      out.write("    </center>\n");
      out.write("</form>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("  <br>\n");
      out.write("  <br>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row1\"> \n");
      out.write("<div class=\"container\"> \n");
      out.write("<br>         \n");
      out.write("<br>\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<h3><center> copy right jkkt  :: 2023  </center></h3>\n");
      out.write("\n");
      out.write("</body>\n");
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
