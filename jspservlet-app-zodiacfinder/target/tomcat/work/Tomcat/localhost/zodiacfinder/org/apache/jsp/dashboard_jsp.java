/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-02-27 18:40:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\t\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"ISO-8859-1\">\n");
      out.write("\t\t<title>Document</title>\n");
      out.write("\t\t<style> \n");
      out.write("\t\t\tinput[type=text] {\n");
      out.write("\t\t\t  width: 50%;\n");
      out.write("\t\t\t  padding: 12px 5px;\n");
      out.write("\t\t\t  margin: 8px 0;\n");
      out.write("\t\t\t  box-sizing: border-box;\n");
      out.write("\t\t\t  border: 3px solid #ccc;\n");
      out.write("\t\t\t  -webkit-transition: 0.5s;\n");
      out.write("\t\t\t  transition: 0.5s;\n");
      out.write("\t\t\t  outline: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tinput[type=text]:focus {\n");
      out.write("\t\t\t  border: 3px solid #555;\n");
      out.write("\n");
      out.write("\t\t\t}\n");
      out.write("\t\t.button {\n");
      out.write("  \t\t\tbackground-color: #4CAF50; /* Green */\n");
      out.write("  \t\t\tborder: none;\n");
      out.write("  \t\t\tcolor: white;\n");
      out.write(" \t\t\tpadding: 16px 32px;\n");
      out.write("  \t\t\ttext-align: center;\n");
      out.write("  \t\t\ttext-decoration: none;\n");
      out.write("  \t\t\tdisplay: inline-block;\n");
      out.write("  \t\t\tfont-size: 16px;\n");
      out.write("  \t\t\tmargin: 4px 2px;\n");
      out.write("\t\t\talign-self: center;\n");
      out.write("  \t\t\ttransition-duration: 0.4s;\n");
      out.write("  \t\t\tcursor: pointer;\n");
      out.write("\t\t\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1 {\n");
      out.write("  background-color: white; \n");
      out.write("  color: black; \n");
      out.write("  border: 2px solid #4CAF50;\n");
      out.write("  margin-left: 42.5%;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".button1:hover {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\t\t\t</style>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h2 style = \"background-color: #48D1CC;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tfont-size: xx-large;\"> Zodiac Sign Finder </h2>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t");
 User user = (User) request.getAttribute("user"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\tUserName: ");
      out.print( user.getUserName() );
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\tBirthDate: ");
      out.print( user.getUserBirthDate() );
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\tBirthTime: ");
      out.print( user.getUserBirthTime() );
      out.write("\n");
      out.write("\t<br>\n");
      out.write("\tDistrictName: ");
      out.print( user.getUserDistrict() );
      out.write("\n");
      out.write("\t\t<br>\n");
      out.write("\n");
      out.write("\t\t<h3>Your Zodiac Sign is : CAPRICORN</h3>\n");
      out.write("\t\t<br>\n");
      out.write("\n");
      out.write("\t\t <form  action=\"edit\">  \n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" id=\"userId\"  value=\"");
      out.print( user.getUserId() );
      out.write("\"   />   \n");
      out.write("\t\t\t<input style=\"background-color: #48D1CC; width: 80px;border-radius: 10%;border-color: azure;color:azure;\" type=\"submit\" value=\"Edit\"/>  \n");
      out.write("\t\t</form> \n");
      out.write("\t\t<br>\n");
      out.write("\t\t\n");
      out.write("\t\t<form  action=\"deleteUser\">  \n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" id=\"userId\"  value=\"");
      out.print(user.getUserId() );
      out.write("\"   />   \n");
      out.write("\t\t\t<input style=\"background-color: #48D1CC; width: 80px;border-radius: 10%;border-color: azure;color:azure;\" type=\"submit\" value=\"Delete\"/>  \n");
      out.write("\t\t</form> \n");
      out.write("\t\t<br>\n");
      out.write("\t\t<form  action=\"test\">  \n");
      out.write("\t\t\t<input style=\"background-color: #48D1CC; width: 80px;border-radius: 10%;border-color: azure;color:azure;\" type=\"submit\" value=\"Back\"/>  \n");
      out.write("\t\t</form> \n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
