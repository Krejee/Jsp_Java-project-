package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write(" <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("<style>\n");
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
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("  <a href=\"#default\" class=\"logo\"><img class=\"logo\" src=\"Logo1.png\">\n");
      out.write("      \n");
      out.write("    \n");
      out.write("  <div class=\"header-right\">\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    <a class=\"active\" href=\"index.jsp\">Home</a>\n");
      out.write("    \n");
      out.write("    <a href=\"adminLogin.jsp\">Admin Login</a>\n");
      out.write("      <a href=\"addNewDonor.jsp\">Donor Form</a>\n");
      out.write("      \n");
      out.write("   <a href=\"searchform.jsp\">Search Form</a>\n");
      out.write("   <a href=\"Request form.jsp\">Request Form</a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div style=\"max-width:100%\">\n");
      out.write("  <img class=\"mySlides\"  src=\"slide11.png\" >\n");
      out.write("  <img class=\"mySlides\"  src=\"slide21.png\" >\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("    var i;\n");
      out.write("    var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    for (i = 0; i < x.length; i++) {\n");
      out.write("       x[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    myIndex++;\n");
      out.write("    if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("    x[myIndex-1].style.display = \"block\";  \n");
      out.write("    setTimeout(carousel, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <br>\n");
      out.write(" \n");
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
