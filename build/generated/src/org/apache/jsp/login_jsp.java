package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/login.css\">\n");
      out.write("        <style>\n");
      out.write("            #rect{\n");
      out.write("              height: 200px;\n");
      out.write("              width: 48%;\n");
      out.write("              background-color: pink;\n");
      out.write("              margin: 10px;\n");
      out.write("              float:left;\n");
      out.write("                 }\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <img id=\"logo1\" src=\"logo/logo_1.png\">\n");
      out.write("<!--            <h1>Healthy Wealthy Clean India</h1>\n");
      out.write("            <h3>Swatch Bharat Started With a Change in Your Habit Stop Littering </h3-->\n");
      out.write("<div id=\"log\">\n");
      out.write("    <h1>Healthy Wealthy Clean India</h1>\n");
      out.write("    <h3>Swaatch Bharat Started With a Change in Your Habit Stop Littering </h3>\n");
      out.write("</div>\n");
      out.write("<img id=\"logo2\" src=\"logo/logo2.png\">\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <div id=\"head\">\n");
      out.write("            \n");
      out.write("            <div id=\"head1\">\n");
      out.write("            <ul>\n");
      out.write("                <a href=\"homejsp.jsp\"><li>Home</li></a>\n");
      out.write("                 <a href=\"#\"><li>About</li></a>\n");
      out.write("                  <a href=\"contectus.jsp\"><li>Contact Us</li></a>\n");
      out.write("                   <a href=\"#\"><li>Admin</li></a>\n");
      out.write("                   <a href=\"login.jsp\"><li>Login</li></a>\n");
      out.write("               \n");
      out.write("            </ul>    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <img id=\"img1\" src=\"img/baner1.PNG\">   \n");
      out.write("            <h2>LOGIN OR REGISTER </h2>\n");
      out.write("            <div id=\"leck\">\n");
      out.write("                <span><b>LOGIN</b></span><b>FORM</b>\n");
      out.write("                <img id=\"line\" src=\"logo/line2.png\">\n");
      out.write("                <form>\n");
      out.write("                    <span class=\"sp1\">Enter User Name : </span><input type=\"text\" placeholder=\"User Name\"><br>\n");
      out.write("                    <span class=\"sp1\">Enter Password : </span><input tyoe=\"password\" placeholder=\"Password\"><br>\n");
      out.write("                    <input style=\"border:none;margin-left: 150px; width: 200px\" type=\"submit\" value=\"Login\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"right\">\n");
      out.write("                 <span><b>REGISTER</b></span><b>FORM</b>\n");
      out.write("                <img id=\"line\" src=\"logo/line2.png\">\n");
      out.write("                <form>\n");
      out.write("                    <span class=\"sp1\">Enter User Name : </span><input type=\"text\" placeholder=\"User Name\"><br>\n");
      out.write("                    <span class=\"sp1\">Enter Email : </span><input tyoe=\"email\" placeholder=\"example@gmail.com\"><br>\n");
      out.write("                    <span class=\"sp1\">Enter Password : </span><input tupe=\"password\" placeholder=\"Password\"><br>\n");
      out.write("                    <span class=\"sp1\">Enter Re-Password : </span><input tupe=\"password\" placeholder=\"Re-Password\"><br>\n");
      out.write("                    <input style=\"border:none;margin-left: 150px; width: 200px\" type=\"submit\" value=\"Register\">\n");
      out.write("                </form>\n");
      out.write(" \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <footer>\n");
      out.write("               <div id=\"fot1\">\n");
      out.write("          <h5>Navigation</h5>\n");
      out.write("            <ol>\n");
      out.write("                \n");
      out.write("                <a href=\"#top\"><li>Home</li></a>\n");
      out.write("                <a href=\"#\"><li>About</li></a>\n");
      out.write("                <a href=\"contectus.jsp\"><li>Contact</li></a>\n");
      out.write("                <a href=\"login.jsp\"><li>Login</li></a>\n");
      out.write("            </ol>\n");
      out.write("          </div>\n");
      out.write("            <div id=\"fot2\">\n");
      out.write("              <h6>Healthy Wealthy Clean India</h6>\n");
      out.write("               <p id=\"pet1\">Swatch Bharat Mission is Way of to clean the all around<br> india\n");
      out.write("                in the form of Healthy India because people of india<br>  is don't infected by any diseases</p>\n");
      out.write("                <img id=\"img4\" src=\"logo/Swatch-Bharat.png\">\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <div id=\"sub_fut\">\n");
      out.write("            <marquee scrollamount=\"4\" >\n");
      out.write("              <spam id='ped'>Mission Swatch Bharat aspired to realize Gandhi Ji's dream of a Clean India through Jan Bhagidari. Together we can make a big difference.&nbsp;&starf;&nbsp;&copy;&nbsp;Copyright 2017-18 HTML CSS All Rights Reserved</spam>\n");
      out.write("          </marquee>\n");
      out.write("        </div>\n");
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
