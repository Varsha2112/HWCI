package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contectus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/contactus.css\"  \n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("       <header>\n");
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
      out.write("            <h2>Contact Us</h2>\n");
      out.write("            <div id=\"left\">\n");
      out.write("                <h4>ADDITIONAL INFORMATION</h4>\n");
      out.write("                <p>Phone No : (123) 653-789</p>\n");
      out.write("                <p>Fax No : +44(123)554-777</p>\n");
      out.write("                <p>Email : <span>hwci@gmail.com</span></p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"right\">\n");
      out.write("                <form>\n");
      out.write("                    <span class=\"sp\">Enter User Name : </span><br> <input type=\"text\" name=\"UserName\" placeholder=\"User Name\"><br>\n");
      out.write("                    <span class=\"sp\">Enter Password : </span><br><input type=\"password\" name=\"Password\" placeholder=\"Password\"><br>\n");
      out.write("                    <span class=\"sp\">Subject : </span><br><input type=\"text\" placeholder=\"Subject\"><br>\n");
      out.write("                    <span class=\"sp\">Attach Document : </span><br><input type=\"file\" placeholder=\"Document\"><br>\n");
      out.write("                    <span class=\"sp\">Comment : </span><br><textarea cols=\"55\" rows=\"7\" placeholder=\"Comment...\"></textarea><br>\n");
      out.write("                    <button type=\"submit\">Submit Request</button>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <footer>\n");
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
