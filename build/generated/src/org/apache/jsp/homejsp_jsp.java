package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homejsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"css/hwci.css\"/>\n");
      out.write("      <style>\n");
      out.write("\n");
      out.write("      </style>\n");
      out.write("       </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"main\">\n");
      out.write("     <header>\n");
      out.write("         <img id=\"logo1\" src=\"logo/logo_1.png\">  \n");
      out.write("         <div id=\"log\">\n");
      out.write("    <h1>Healthy Wealthy Clean India</h1>\n");
      out.write("    <h3>Swatch Bharat Started With a Change in Your Habit Stop Littering </h3>\n");
      out.write("</div>\n");
      out.write("         <div id=\"menu\">\n");
      out.write("             <ul>\n");
      out.write("                 <a href=\"homejsp.jsp\"> <li>Home</li></a>\n");
      out.write("                 <a href=\"#\"><li>About</li></a>\n");
      out.write("                     <a href=\"contectus.jsp\"><li>Contact</li></a>\n");
      out.write("                 <a href=\"#\"><li>Admin</li></a>\n");
      out.write("                     <a href=\"login.jsp\"><li>Login</li></a>\n");
      out.write("             </ul>\n");
      out.write("         </div>\n");
      out.write("        </header>    \n");
      out.write("             <div id=\"link\">\n");
      out.write("                 <a href=\"#\">  <img id=\"img1\" src=\"img/Facebook.PNG\"/></a>\n");
      out.write("               <a href=\"#\">  <img id=\"img2\" src=\"img/Twitter.PNG\"/></a>\n");
      out.write("               <a href=\"#\">  <img id=\"img3\" src=\"img/Youtube.PNG\"/></a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"sec\">\n");
      out.write("        <div id=\"title\">\n");
      out.write("            <h4>Ek Soch Swatchta Ki Or</h4>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"photo_frame\">\n");
      out.write("            \n");
      out.write("            <!--images-->\n");
      out.write("            <marquee onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\n");
      out.write("                <img class=\"ban\" src=\"img/3-331580533.JPG\">\n");
      out.write("                <img class=\"ban\" src=\"img/5_66.jpg\">\n");
      out.write("                <img class=\"ban\" src=\"img/swachh-bharat-abhiyan-in-delhi.jpg\">\n");
      out.write("                <img class=\"ban\" src=\"img/images1.jpg\">\n");
      out.write("                <img class=\"ban\" src=\"img/images (4).jpg\">\n");
      out.write("                <img class=\"ban\" src=\"img/images (3).jpg\">\n");
      out.write("            </marquee>        \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"Box1\">\n");
      out.write("                <div id=\"v1\">\n");
      out.write("                    <video height=\"100%\" width=\"85%\" controls>\n");
      out.write("                        <source src=\"videos/[MP4 360p] Animation film on Water, Sanitation & Hygiene - Open Defecation.mp4\">\n");
      out.write("                    </video>   \n");
      out.write("                </div>\n");
      out.write("                <div id=\"con1\">\n");
      out.write("                    <h2>  Do not Spread the Trash Anywhere</h2>\n");
      out.write("                    <p>We should not spread garbage waste because it helps us and our family to be in denger and the name of society is also bad, we must always put garbage in the dustbin and people should also have to do this.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"Box2\">\n");
      out.write("                \n");
      out.write("             <div id=\"con2\">\n");
      out.write("                    <h2>  Cleaning with a Smile</h2>\n");
      out.write("                    <p>If someone trash garbage, then do not get angry at him, just pick him up form the garbage and put in the dustbin and after this persion will be ashamed and they will not do this next time and will prevent people from doing this too becouse this our duty.</p>\n");
      out.write("                </div>\n");
      out.write("            <div id=\"v2\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"  style=\"margin-left: 15%\"controls>\n");
      out.write("                        <source src=\"videos/[MP4 360p] Clean India , Green India - Awareness Short Film.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("             </div>\n");
      out.write("            <div id=\"Box3\">\n");
      out.write("                <div id=\"v3\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"controls>\n");
      out.write("                    <source src=\"videos/[MP4 480p] HYGIENE - THE WAY OF LIFE_ A Plan India supported animation film on _WASH_ - YouTube.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("                <div id=\"con3\">\n");
      out.write("                    <h2>   Hygiene The way of Life</h2>\n");
      out.write("                    <p>We should always keep our home and locality in need, so that we can take care of the health of our peoples around u us, if we do not keep our area clean then many kinds of diseases can spread and it can lead to terrible troubles diseases suck as dengue, malaria, fularia, dairrhea all these diseases are associated with our stomach urine.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div id=\"Box4\">\n");
      out.write("                \n");
      out.write("             <div id=\"con4\">\n");
      out.write("                    <h2>  Organic waste converter Green environment India</h2>\n");
      out.write("                    <p>With the help of Compost Machine, we can use unused vegetable and fruits very well, with the hep of which fertile can make compost Whereby, in today's era, tree can be found and crops can receive a nectar gift</p>\n");
      out.write("                </div>\n");
      out.write("            <div id=\"v4\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"  style=\"margin-left: 15%\"controls>\n");
      out.write("                    <source src=\"videos/[MP4 480p] Organic waste converter Greenviron India.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("             </div>\n");
      out.write("            <div id=\"Box5\">\n");
      out.write("                 <div id=\"v5\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"controls>\n");
      out.write("                    <source src=\"videos/Bapu Ka Sapna Swachh Bharat Apna - NFDC & SBSFF - Short Movie Documentry Film - Vikash Edition.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("                <div id=\"con5\">\n");
      out.write("                    <h2> Bapu's dream</h2>\n");
      out.write("                    <p>Bapu wanted our country to be beautiful and clean in which there is no disease in which there is no problem in which there is no problem For which he was very proud and adopted many strategies to make it successful.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"Box6\">\n");
      out.write("                <div id=\"con6\">\n");
      out.write("                    <h2>   A story cleansing</h2>\n");
      out.write("                    <p>Nowadays there is no time in anyone's life, because of which they want to get more benefit in lesser work Because of which Boy's home was clean and he retreated from cleaning his area, due to which many diseases spread.</p>\n");
      out.write("                </div>\n");
      out.write("            <div id=\"v6\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"  style=\"margin-left: 15%\"controls>\n");
      out.write("                    <source src=\"videos/Swachh Bharat - A story which touches your heart - Chai Stories.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("        </div>\n");
      out.write("            <div id=\"Box7\">\n");
      out.write("                  <div id=\"v7\">\n");
      out.write("                <video height=\"100%\" width=\"85%\"controls>\n");
      out.write("                    <source src=\"videos/Swachh Survekshan 2018 Anthem.mp4\">\n");
      out.write("                    </video>\n");
      out.write("                   </div>\n");
      out.write("                <div id=\"con7\">\n");
      out.write("                    <h2>  A song dedicated to cleanliness</h2>\n");
      out.write("                    <p>Many times, it is necessary to use an adjective to bring something to the people and if a song is needed to make a place in the heart of the people, then</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("        <footer>\n");
      out.write("            <div id=\"fot1\">\n");
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
      out.write("                <h6>Healthy Wealthy Clean India</h6>\n");
      out.write("                \n");
      out.write("                <p id=\"pet1\">Swatch Bharat Mission is Way of to clean the all around<br> india\n");
      out.write("                in the form of Healthy India because people of india<br> is don't infected by any diseases</p>\n");
      out.write("                <img id=\"img4\" src=\"logo/Swatch-Bharat.png\">\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <div id=\"Title\">\n");
      out.write("            \n");
      out.write("          <marquee scrollamount=\"4\" >\n");
      out.write("              <spam id='ped'>Mission Swatch Bharat aspired to realize Gandhi Ji's dream of a Clean India through Jan Bhagidari. Together we can make a big difference.&nbsp;&starf;&nbsp;&copy;&nbsp;Copyright 2017-18 HTML CSS All Rights Reserved</spam>\n");
      out.write("          </marquee>\n");
      out.write("           \n");
      out.write("        </div>\n");
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
