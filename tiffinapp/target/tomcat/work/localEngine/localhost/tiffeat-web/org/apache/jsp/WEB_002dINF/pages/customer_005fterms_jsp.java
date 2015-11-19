package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rns.tiffeat.web.util.Constants;
import com.rns.tiffeat.web.util.Constants;

public final class customer_005fterms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/pages/header.jsp");
    _jspx_dependants.add("/WEB-INF/pages/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>TiffEat | Terms and Conditions</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"drawer drawer-left\">\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Roboto:400,300,700,500' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!-- ../../resources -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">  \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" media=\"all\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\"> \r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"drawer drawer-left\" >\r\n");
      out.write("\r\n");
      out.write("<!--    Drawer navbar-->\r\n");
      out.write("<header role=\"banner\">\r\n");
      out.write("    <div class=\"drawer-header\">\r\n");
      out.write("        <button type=\"button\" class=\"drawer-toggle drawer-hamburger\" id=\"drawer_button1\">\r\n");
      out.write("            <span class=\"sr-only\">toggle navigation</span>\r\n");
      out.write("            <span class=\"drawer-hamburger-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"drawer-main drawer-default\">\r\n");
      out.write("        <nav class=\"drawer-nav\" role=\"navigation\">\r\n");
      out.write("        <div class=\"drawer-brand\"><a href=\"home.htm\" id=\"drawer_link1\"><span class=\"tiff\">Tiff</span><span class=\"eat\">Eat</span></a></div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"drawer-menu\">\r\n");
      out.write("            \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            \t<li class=\"drawer-menu-item\"><a href=\"home.htm\" id=\"drawer_link1\">Make an Order</a></li>\r\n");
      out.write("                <li class=\"drawer-menu-item\"><a href=\"terms.htm\" id=\"drawer_link1\">Privacy Policy</a></li>\r\n");
      out.write("                <li class=\"drawer-menu-item\"><a href=\"aboutUs.htm\" id=\"drawer_link1\">About Us</a></li>\r\n");
      out.write("                <li class=\"drawer-menu-item\"><a href=\"contactUs.htm\" id=\"drawer_link1\">Contact Us</a></li>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"drawer-footer\"><span></span></div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"drawer-overlay\">\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\" id=\"toggle_button1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"home.htm\">\r\n");
      out.write("                    <h4 class='tiff'>Tiff<span class=\"eat\">Eat</span></h4>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container demo_div\">\r\n");
      out.write("            \r\n");
      out.write("            <h4 class=\"demo_heading\">Terms of use, privacy policy and disclaimer</h4>\r\n");
      out.write("            <div class=\"demo_card\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"demo\">\r\n");
      out.write("\r\n");
      out.write("                <p>\r\n");
      out.write("                    The following terms and conditions constitute a binding agreement between you (hereinafter referred to as \"You\", \"Your\" or \"User\"), and Resoneuronance Software Solutions Private Limited (hereinafter referred to as \"TIFFEAT\", \"We\", \"Us\" and \"Our\"), the operator of \"TIFFEAT\" (the \"Portal\") and related Portals, services on/in which these Terms of Use is posted or referenced.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    By subscribing to or using any of our services you agree that you have read, understood and are bound by the Terms, regardless of how you subscribe to or use the services.<strong> If you do not agree with these terms, you cannot use the services. </strong>These Terms and various other policies are binding as per the provisions of the<em> </em>\r\n");
      out.write("                    <em>\r\n");
      out.write("\t\tInformation Technology (Intermediaries guidelines) Rules, 2011 formulated under the Information Technology Act of 2000.\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</em>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    In these Terms, references to \"you\", \"your\" or \"user\" shall mean the end user accessing TIFFEAT, its contents and using the Services offered through TIFFEAT, and \"we\", \"us\" and \"our\" shall mean TIFFEAT, <a href=\"http://www.tiffeat.com/\">www.tiffeat.com</a> and its affiliates. Portal shall mean and include Tiffeat Website, Mobile Application provided by TIFFEAT. \"Participating Vendor\" or \"vendors\" is a third party, which has agreed to co-operate with TIFFEAT to prepare and/or deliver the Goods or Services\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    These terms of use, together with our PRIVACY POLICY and DISCLAIMER, (each of which are incorporated herein by reference, and collectively, this \"Agreement\") govern your use of the Services, both as a non-registered user and as a registered user.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Please note that we offer the Services \"AS IS\" and without warranties. If you are registering an account or using the Services on behalf of an individual or entity other than yourself, you represent that you are authorized by such individual or entity to accept this Agreement on such individual's or entity's behalf.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tINTRODUCTION\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1.1 </strong> Welcome to the www.TIFFEAT.com (the âPortalâ). TIFFEAT is an Internet based content and a platform filled with unique features providing the end users with easy and simple ways to order online Tiffin/food from Participating Tiffin Vendors, inter alia; operated by \"TIFFEAT\",\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1.2 </strong> The Tiffin/ food ordered through the Portal will be prepared by the Participating Tiffin Vendor and further shall be delivered by TIFFEAT to the End User;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1.3 </strong> TIFFEAT provide an Online Platform which can be used by the End Users:\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    a. to order Tiffin/food from participating local Tiffin Vendors (<strong>Participating Vendors</strong>);\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    b. to post your own reviews, comments about your experience in ordering food provided by the Participating Vendors.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    c. to read reviews about the food Services offered by the <strong>Participating Vendors</strong>;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    1.4 The Services are also available apart from website on various operating systems, such as Android, Java, Blackberry, and IOS, Windows Phone / tablets/laptops inter alia.<strong> </strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    1.5 TIFFEAT grants you the non-exclusive, non-transferable, non-sublicensable, limited right and license to install and use TIFFEAT Portal solely and exclusively for your personal use and the devices that you own or control. This license does not allow you to use the licensed application on any tablet, mobile Phone that you do not own or control, and you may not distribute or make the Licensed Application available over a network where it could be used by multiple devices at the same time.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1.4 </strong> Use of the Portal is offered to you conditioned on acceptance without modification of all the terms, conditions, Privacy Policy and notices contained in these Terms, as may be posted on the Portal from time to time. TIFFEAT at its sole discretion reserves the right not to accept a User from registering on the Portal without assigning any reason thereof.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>1.5 </strong> Unless otherwise indicated or anything contained to the contrary or any proprietary material owned by a third party and so expressly mentioned, TIFFEAT owns all Intellectual Property Rights to and into the Portal, including, without limitation, any and all rights, title and interest in and to copyright, related rights, patents, utility models, trademarks, trade names, service marks, designs, know-how, trade secrets and inventions (whether patentable or not), goodwill, source code, meta tags, databases, text, content, graphics, icons, and hyperlinks. You acknowledge and agree that you shall not use, reproduce or distribute any content from the Portal belonging to www.TIFFEAT.com without obtaining authorization from TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>2. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tELIGIBILITY\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>2.1 </strong> You must be 18 years of age or older to register, use the Services, or visit or use the Portal in any manner. By registering, visiting and using the Portal or accepting this Agreement, you represent and warrant to TIFFEAT that you are 18 years of age or older, and that you have the right, authority and capacity to use the Portal and the Services available through the Portal, and agree to and abide by this Agreement.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>3. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tTERMS OF PURCHASE\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>3.1 </strong> All prices listed on the Website are correct at the time of publication and have been input as received by the vendor. While we give great care to keep them up to date, the final price charged to you by the vendor can change at the time of delivery based on the latest menu and prices of the vendor.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>3.2 </strong> All prices listed on the Website for Food Delivery by the Participating Vendor listed on the Website reflect the price the Participating Vendor charges at the time of listing. In case the price listed is not current and the vendor informs us immediately after placing the order, we will put our best effort to contact you to inform you about the price difference and you can choose to opt-out of the order at that time. The total price for Food Delivery, Goods or Services ordered, including delivery charges and other charges, will be displayed on the Website when you place your order.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>3.3 </strong> You agree to pay all fees and charges incurred in connection with your purchases, orders including taxes as applicable. The final charges for your order may be different than those stated on the Portal and in case of such differences in the quoted charges; TIFFEAT shall have exclusive right to decide upon the final charges to be paid for the respective purchases.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4. </strong>\r\n");
      out.write("                    <strong>USE</strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tOF SERVICE BY USER\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.1 </strong> You must create / register an online account with us if you desire to utilize certain online facilities provided through our Portal. You shall provide accurate information in the account and we shall not be responsible for the data maintained in the account.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.2 </strong> To register an online account you may need to input on our Portal certain personal information which may include your name, address, contact details, payment details and other personal information that may be offered on the Portal from time to time. Use of any personal information you provide to us during the account creation process is governed by our Privacy Policy.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.3 </strong> You may also be able to register to use the Services of the Portal by logging into your account with your credentials from certain third party social networking Portals. You confirm that you are the owner of any such social media account and that you are entitled to disclose your social media login information to us. You authorize us to collect your authentication information, and other information that may be available on or through your social media account consistent with your applicable settings and instructions.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.4 </strong> You are responsible to keep the password confidential and immediately notify us if you suspect any unauthorized use of your email address or any breach of security, or if any authorized third party becomes aware of that password. You agree that if you disclose to any person your user name or password, they are authorized to act as your agent for the purposes of using the Services on our Portal. You are entirely responsible to maintain the confidentiality of your password.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.5 </strong> We request all accounts to be registered with a regularly accessed, valid personal e-mail address, so that we can communicate with you. We reserve the right to close without any prior notice, any accounts which have been registered with third partyâs e-mail address or with temporary e-mail addresses. Users may be required to re-validate their accounts if we believe they have been using an invalid e-mail address.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>4.6 </strong> By creating an account, you agree to receive certain communications from us and / or the Participating Vendors, including, but not limited to, order confirmations and cancellations. Such communications shall be via phone, e-mail or other method as determined by us and / or the Participating Vendors.\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tRIGHTS AND OBLIGATIONS OF USER\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5.1 </strong> The User shall provide TIFFEAT with all necessary access to such information as may be required by the TIFFEAT;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5.2 </strong> The User will be solely responsible for procuring and maintaining its network connections and telecommunications links from its systems to the TIFFEATâs data centers, and all problems, conditions, delays, delivery failures and all other loss or damage arising from or relating to the User's network connections or telecommunications links or caused by the internet.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5.3 </strong> User represents that it is not a direct competitor of the TIFFEAT. User understands and acknowledges that if it is found that the User is a direct competitor of the TIFFEAT, or using the for monitoring the availability, security, performance, functionality, or for any other benchmarking or competitive purposes without TIFFEATâs express written consent, the Userâs access to the services stands permanently suspended with forfeiture of any fees paid and the agreement deemed to be terminated without prior notice.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5.4 </strong> The User shall use all reasonable endeavors to prevent any unauthorized access to, or use of, the Services and, in the event of any such unauthorized access or use, promptly notify the TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>5.5 </strong> The User at the time of delivery shall verify the seal of the delivery box. If the User observes any tampering over the seal of the delivery box, User shall bring this fact to the Delivery Executiveâs notice and deny the delivery. User shall be entitled for refund for such delivery.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>6. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tRIGHTS OF TIFFEAT\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>6.1 </strong> We reserve the right to charge subscription and/or membership fees from the Users at any time as deemed appropriate by us for the Services provided through TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>6.2 </strong> We reserve the rights to decline any new registration or to cancel any existing registration at any time without giving prior notice to the User. You acknowledge and agree that if we disable access to your account, you may be prevented from accessing the Services, your account details or any files or other content, which is contained in your account.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>6.3 </strong> We also reserve the right to alter the Goods or Services available for sale on the Portal and to stop listing Vendors, or any Participating Vendors and their Goods or Services.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>6.4 </strong> We may not accept Payments if we have a reason to believe that a particular payment instrument is being used by an unauthorized person or a payment made in disagreement with applicable laws, in particular for illegal purposes.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tADDITIONAL TERMS &amp; CONDITIONS FOR DELIVERY SERVICES:\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.1 </strong> All food preparations and Tiffin packaging are the sole responsibility of the Participating Vendor accepting the order.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.2 </strong> All deliveries are the sole responsibility of TIFFEAT. Please be aware that we will do everything we can to meet the delivery time as specified, however delivery times may be affected by factors beyond our control and therefore cannot be guaranteed. We will inform you if we become aware of an unexpected delay.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.3 </strong> On receipt of the online order by the User, TIFFEAT shall acknowledge and provide confirmation of the online order to the User via E-Mail and SMS (Short Message Service).\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.4 </strong> The fact that you receive an automatic confirmation does not necessarily mean that we will be able to deliver your order. Any online order that you place with us is subject to product availability with the Participating Vendors and delivery capacity by TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.5 </strong> By placing your online order, you warrant to us that all the information provided to us in such order is accurate and correct. Incorrect details provided by you, may lead to problems or delays in delivery, so please ensure that you have included your correct address (including postcode), email address and contact telephone number when ordering. You also warrant that any debit card / credit card / net banking details that you provide are of your own and that you have sufficient funds to make the payment.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.6 </strong> Kindly note that some of the goods served by the Participating Vendors may be suitable for certain age ranges only. You must check that the product description you are ordering is suitable for the intended recipient.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.7 </strong> If the online order placed by you for Delivery is not available or if there is not within the delivery capacity, we and / or the Participating Vendors will let you know by via E-Mail, SMS (Short Message Service) or phone call.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.8 </strong> You must ensure that at the time of delivery, adequate arrangements, including proper access to our Delivery Executive where necessary, are in place for the safe delivery of such goods. We cannot be held liable for any damage, cost or expense incurred to such goods or premises where this arises as a result of a failure to provide adequate access or arrangements for delivery.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.9 </strong> If you fail to accept the delivery at the time of delivery, or we are unable to deliver at the nominated time due to your failure to provide appropriate instructions, or authorizations, then such goods shall be deemed to have been delivered to you and all risk and responsibility in relation to such goods shall pass to you. Any storage, insurance and other costs which we and/or Participating Vendors incur as a result of the inability to deliver shall be your responsibility and you shall indemnify us and/or Participating Vendors in full for such cost.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.10 </strong> In the unlikely event that we deliver a wrong item, you have the right to reject the delivery of the wrong item and you shall be fully refunded for the missing item. If we only do a partial delivery, our staff will inform you or propose a replacement for missing items to complete your order. You have the right to refuse a partial order before delivery and get a refund.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.11 </strong> TIFFEAT is merely providing a platform to enable the User to order online for food from the Participating Vendors. We endeavors to deal with reputable third parties who provide quality products; however we shall not be liable for any acts or omission by the Participating Vendors including deficiency in quality or quantity of any goods delivered by us.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.12 </strong> Any dispute arising between the User and the Participating Vendors shall be resolved between the User and the Participating Vendors. TIFFEAT shall not be liable under any circumstances for any disputes arising between the User and the Participating Vendors.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>7.13 </strong> Please note in case you have made your order for Delivery of food and your payment has been authorized, you will not be able to cancel your order nor will you be entitled to a refund.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>8. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tCANCELLATION AND REFUND\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>8.1 </strong>\r\n");
      out.write("                    <strong>For One Time order: </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    One time Order once confirmed by the user, cannot be cancelled and the amount would not be refundable in any circumstance.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>8.2 </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tFor Scheduled Order:\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Scheduled order shall mean and include the orders for the Tiffin from TIFFEAT on monthly or weekly basis as provided by the Portal. Such order shall require subscribing the Tiffins from TIFFEAT for certain specific period by paying the amount through the Wallet as available on the Portal with an option to choose the Vendor of Userâs choice each time. The cost for Tiffin each shall be deductable from such Wallet per Tiffin Basis. Such user may cancel their Tiffin for one or consecutive times giving prior intimation to TIFFEAT through the portal facility as available. Such intimation of cancellation shall be given at least 4hours before the delivery time. Cancellation complying with the above conditions will be deemed as Cancellable and the cost for such Tiffin as cancelled will not be deducted from the User Wallet and in case already deducted, shall be adjustable in the next tiffin order or may be refunded to the TIFFEAT Wallet at the sole discretion of TIFFEAT.\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>8.3 </strong> If the delivery is not executed during first attempt due to incorrect or insufficient address, recipient/user not at home, address found locked or refusal to accept, the User shall still be charged for such order made. The User shall not be entitled for refund on such order.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9. </strong>\r\n");
      out.write("                    <strong>PAYMENT</strong>\r\n");
      out.write("                    <strong>TERMS AND REFUND POLICY:</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9.1 </strong> TIFFEATâs Services are available on the basis of transaction model, as per the requirements of Participating Vendors. The payment terms may differ for the type of service availed by the User. The terms of payments are subject to change from time to time without prior notice.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9.2 </strong> TIFFEAT declares that it does not render banking services. TIFFEAT may use the services of one or more third party, processors and/or financial institutions to provide the Services of processing the transactions. Modes of Payment available at TIFFEAT Portal include Cash on delivery, Credit or Debit Card, Netbanking, PayU Money and Wallet Service as available on the Portal. TIFFEAT reserves right to modify, add, alter or delete any mode of payment available.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9.3 </strong> Once TIFFEAT has confirmed correctness of the Payment made by the User, TIFFEAT shall automatically inform the User of such Payment by posting an appropriate announcement in the Userâs Account.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9.4 </strong> TIFFEAT shall not be responsible for making refunds to the User, in case of refund it shall be the responsibility of the Participating Vendors to refund such amount in accordance with their cancellation and refund policy.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>9.5 </strong> All Payments are deemed to be chargeable / invoiced in Indian Rupees (INR) while all allied charges including but not limited to foreign exchange cost, cost as per Reserve Bank of India (RBI) Rules in case of foreign transaction is to be borne by the User.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>10. </strong>\r\n");
      out.write("                    <strong>VOUCHERS</strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t, PROMOTIONS AND DISCOUNTS:\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>10.1 </strong> We may from time to time offer vouchers, discounts, promotions or gift cards to our members free of charge or for value. We may from time to time permit Participating Vendors to offer their own vouchers, discounts or promotions for use in conjunction with ordering the Services provided in the Portal.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>10.2 </strong> Any vouchers, discounts, promotions or gift cards offered through the Portal cannot be redeemed or refunded for cash with us or the Participating Vendors or used beyond their respective expiry dates.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>10.3 </strong> You are solely responsible for the security of any vouchers, promotions or gift cards that you open through using our Portal. We shall not responsible for any loss or damage of any vouchers, promotions or gift cards and shall not have any obligation to replace them.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>10.4 </strong> We have no obligation to redeem any vouchers, discounts, promotions or gift cards which appear to our opinion has been tampered with or forged.\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>11. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tUSER SUBMISSIONS\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>11.1 </strong> Anything that you submit to the Portal and/or provide to us, including but not limited to, questions, reviews, comments, feedback and suggestions (collectively \"Submissions\") will become our sole and exclusive property and shall not be returned to you. In addition to the rights applicable to any Submission, when you post comments or reviews to the Portal, you also grant us the right to use the name / username that you submit, in connection with such review, comment, feedback or other content. We may, but shall not be obligated to, remove or edit any Submissions.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>11.2 </strong> As per these Terms, you are solely responsible for every material or content uploaded on to the Portal. User Submissions do not reflect the opinion of TIFFEAT. We do not review the contents in any way before they appear on the Portal. We do not verify, endorse or otherwise vouch for the contents of any user or any content generally posted or uploaded on to the Portal. You can be held legally liable for the contents and may be held legally accountable if your contents or material include, for example, defamatory comments or material protected by copyright, trademark etc.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>12. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tUSE OF CONTENT\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>12.1 </strong> All of the Content available at <a href=\"http://www.tiffeat.com/\">www.TIFFEAT.com</a> is owned by us or our licensors and is protected by copyright, trademark, patent, and trade secret laws, other proprietary rights. You acknowledge that the Services and any underlying technology or software used in connection with the Services contain TIFFEATâs proprietary information. We give you permission to use the aforementioned content for personal, non-commercial purposes only and do not transfer any intellectual property rights to you by virtue of permitting your use of the Services. You may print, download, and store information from the Portal for your own convenience, but you may not copy, distribute, republish (except as permitted in this paragraph), sell, or exploit any of the content, or exploit the Portal or Services in whole or in part, for any commercial gain or purpose whatsoever. Except as expressly and unambiguously provided herein, neither TIFFEAT nor its suppliers grant you any express or implied rights, and all rights in the Portal and the Services not expressly granted to you are retained by TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13. </strong>\r\n");
      out.write("                    <strong>WARRANTIES</strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t, REPRESENTATIONS AND LIMITATIONS\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.1 </strong> We have no special relationship with or fiduciary duty to you. You acknowledge that we have no control over, and no duty to take any action regarding: which users gain access to the Portal and/or the Services; what content you access via the Portal and/or the Services; what effects the content on the Portal and/or the Services may have on you; how you may interpret or use the content on the Portal and/or the Services; or what actions you may take as a result of having been exposed to the content on the Portal and/or the Services. You release us from all liability for you having acquired or not acquired content through the Portal and/or the Services. The Portal and/or the Services may contain, or direct you to Portals containing, information that some people may find offensive or inappropriate. We make no representations concerning any content contained in or accessed through the Portal and/or the Services, and we will not be responsible or liable for the accuracy, copyright compliance, legality or decency of material contained in or accessed through the Portal and/or the Services. We make no representations or warranties regarding suggestions or recommendations of Services or Services offered or purchased through the Portal and/or the Services. We provide the Portal and the Services \"As Is\", \"With All Faults\" and \"As Available.\" We make no express or implied warranties or guarantees about the Services. To the maximum extent permitted by law, we hereby disclaim all such warranties, including all statutory warranties, with respect to the Services and the Portal, including without limitation any warranties that the Services are merchantable, of satisfactory quality, accurate, fit for a particular purpose or need, or non-infringing. We do not guarantee that the results that may be obtained from the use of the Services will be effective, reliable or accurate or will meet your requirements. We do not guarantee that you will be able to access or use the Services (either directly or through third-party networks) at times or locations of your choice. We are not responsible for the accuracy, reliability, timeliness or completeness of information provided by users of the Services or any other data or information provided or received through the Services. Except as expressly set forth herein, TIFFEAT make no warranties about the information systems, software and functions made accessible through the Services or any other security associated with the transmission of sensitive information. TIFFEAT does not warrant that the Portal or the Services will operate error-free, bug-free or free from defects, that loss of data will not occur, or that the Services, software or Portal are free of computer viruses, contaminants or other harmful items.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.2 </strong> All of our Services are thoroughly researched, and descriptions are, to the best of our knowledge, accurate and correct. The information contained on this Portal:\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    a) is for general information only and does not profess to be all-inclusive;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    b) is not intended as a substitute for qualified advice; and\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    c) may contain, or be linked to, advice, statements or opinions of third parties, information providers or content providers and use of or reliance on any such advice, statements or opinions is at the user's own risk.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.3 </strong> The user acknowledge and agree that any material and/or data downloaded at Portal is done entirely at users own discretion and risk and they will be solely responsible for any damage to their electronic device or loss of data that results from the download of such material and/or data.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.4 </strong> TIFFEAT shall not be liable for any kind of legal issues between user using the service and Participating Vendors for lack of services, lack of food quality, any food issue, and any legal issue.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.5 </strong> TIFFEAT shall not be liable for kind of food quality, ambience, hygiene, legal issues, Government permission related issues on behalf of Participating Vendors.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.6 </strong> TIFFEAT does not allow and shall not be liable for selling of any unauthorized substance, material, drug or medicine or any material prohibited under law by the Participating Vendors.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>13.7 </strong> TIFFEAT does not allow and shall not be liable for ordering, purchasing for any liquor or alcohol containing substance from the Participating Vendors.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>14. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tLINKS TO THIRD PARTY WEBSITE\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>14.1 </strong> The Portal may include links to other websites/portal, including links provided as automated search results. Some of these website/Portals may contain materials that are objectionable, unlawful, or inaccurate. These links are provided for your convenience only and we do not endorse any advertisement, products or other materials available on these website/Portals or the Services and Services they provide. You acknowledge and agree that we are not responsible or liable for the content or accuracy of these other website/Portals. The users are requested to verify the accuracy of all information on their own before undertaking any reliance on such information.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>15. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tINDEMNIFICATION\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>15.1 </strong> Upon a request by us, you agree to defend, indemnify, and hold harmless us, our employees, contractors, officers, directors, agents, parent, other affiliated companies, suppliers, successors, and assigns from all liabilities, claims, demands and expenses, including attorney's fees, made by any third party that arise from or are related to (a) your access to the Portal, (b) your use of the Services, or (c) the violation of this Agreement (including without limitation the Terms of Use, the Additional Terms inter alia), or of any intellectual property or other right of any person or entity, by you or any third party using your Credentials. The foregoing indemnification obligation does not apply to liabilities, claims and expenses arising as a result of our own gross negligence or intentional misconduct.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>16. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tRESERVATION OF RIGHTS\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong> </strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>16.1 </strong> We reserve all rights, including but not limited to any and all copyrights, trademarks, patents, trade secrets, and any other proprietary right that we may have in our Portal, its content, and Services that may be provided. The use of our rights and property requires our prior written consent. We are not providing you with any implied or express licenses or rights by making Services available to you and you will have no rights to make any commercial uses of our Portal or service without our prior written consent.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tPRIVACY POLICY\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.1 </strong> Data protection is a matter of trust and your privacy is important to us. We shall therefore only use your name and other information which relates to you in the manner set out in this Privacy Policy. Please note that we may disclose information about you to third parties or government authorities if we believe that such a disclosure is reasonably necessary to (i) take action regarding suspected illegal activities; (ii) enforce or apply our Terms and Privacy Policy; (iii) comply with legal process or other government inquiry, such as a search warrant, subpoena, statute, judicial proceeding, or other legal process/notice served on us; or (iv) protect our rights, reputation, and property, or that of our users, affiliates.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.2 </strong> We use procedural and technological security measures that are designed to safeguard your Personally Identifiable Information from loss, unauthorized access, disclosure, alteration or destruction. We may use encryption, password protection, and other security measures to help prevent unauthorized access to your Personally Identifiable Information.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.3 </strong> We will only collect information where it is necessary for us to do so and we will only collect information if it is relevant to our dealings with you. We will keep your information for as long as we are either required to by law or as is relevant for the purposes for which it was collected.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.4 </strong> You can visit the Portal and browse without having to provide personal details and during your visit to the Portal you remain anonymous.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.5 </strong> None of the information we gather can be used by the public (visitors, other members, and anyone not employed by TIFFEAT or its affiliates) to identify a specific individual.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.6 </strong> We do not collect any personally identifiable information about you unless you voluntarily submit such information to us, by using our Services or by filling out a form or survey.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.7 </strong> We do not sell, rent, share, trade or give away any of your private information without your permission except to the financial institution that processes your credit card transactions. We reserve the right to disclose your personally identifiable information as required by law and when we believe that disclosure is necessary to protect our rights and/or comply with a judicial proceeding, court order, or legal process served on our Portal.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>17.8 </strong> This online Privacy Policy applies only to information collected through our Portal and not to information collected offline.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>18. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tCOOKIES\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>18.1 </strong> A cookie is a small amount of information sent from our web server to your computer. We use cookies when someone logs into our Portal, to maintain that login session and to retain login information, if requested. We do not use cookies to track your Internet activity before or after you leave our Portal. Any activity while you are at the TIFFEAT Portal may be tracked. We do not use your IP address to identify you personally.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>18.2 </strong> You may refuse to accept cookies by activating the setting on your browser which allows you to refuse the setting of cookies. However, if you do that, you may not be able to use some features on the Portal. Unless you have adjusted your browser setting so that it will refuse cookies, our system will issue cookies when you log on to our Portal. Please note that our advertisers may also use cookies, over which we have no control. Please remember, cookies do not contain confidential information such as your home address, telephone number or credit card details. We do not exchange cookies with any third party Portals or external data suppliers.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>19. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tYOUR PERSONAL INFORMATION\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>19.1 </strong> In order to access certain features of the Service, you must provide certain personal information about yourself. You may voluntarily submit, and hereby authorize TIFFEAT, its employees, agents and others operating on its behalf to use and/or disclose, personal information about you, including, without limitation, your name, address, social security number and contact information; payment card information; and other information that is either requested by TIFFEAT or voluntarily provided (\"Personal Information\") in order to provide the Services to you, in accordance with our Privacy Policy.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>20. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tUser Conduct &amp; Rules\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>20.1 </strong> You agree and undertake to use the Portal strictly abiding by the following principles:\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    i. You will not promote or try to gain unauthorized access or exceed the scope of authorized access to TIFFEAT and its connected network\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    ii. You will not attempt to gain unauthorized access to any portion or feature of TIFFEAT Portal, or any other systems or networks connected to TIFFEAT Portal\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    iii. You will not interfere with another user's use of the TIFFEAT Portal\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    iv. You will not violate any law currently in force in India or outside\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    v. You will not attempt or otherwise impersonate another person during the use of TIFFEAT Portal\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    vi. You will not probe, scan or breach the vulnerability of TIFFEAT Portal or any network connected to TIFFEAT Portal\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    vii. You will not use any automatic device, program, or methodology including but not limited to \"deep-link\", \"page-scrape\", \"robot\", \"spider\" or other such means, or any similar manual process, to access, acquire or copy any portion of the TIFFEAT Portal or any content within\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    viii. You will not Decompile, reverse engineer, disassembles or otherwise attempt to derive source code from the Services whatsoever;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    ix. You will not upload, publish, host, transmit, display, modify, update or share any information that, in the sole discretion of TIFFEAT:\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    a. Involves an illegal or unauthorized use of copyrighted work\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    b. Is not belonging to you or to which you have no rights\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    c. Refers to any Portal or URL that contains material that is inappropriate for TIFFEAT\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    d. Contains software viruses, computer code, files or programs designed to interrupt, destroy or limit the functionality of any computer resource\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    e. Is grossly racial, harmful, sexual, harassing, defamatory, obscene, pornographic or otherwise unlawful in any manner whatsoever\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    x. You will not engage in any activity that inflicts an unreasonable or abnormal load on the TIFFEAT Portal or any systems or networks connected to the TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    xi. You will not use the Portal or any content for any purpose that is unlawful or prohibited by these Terms of Use\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    xii. You will not violate any of the terms and conditions of this agreement or any other terms and conditions contained elsewhere within TIFFEAT.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21. </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tMISCELLANEOUS\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.1 </strong>\r\n");
      out.write("                    <strong>Electronic Contracting; Copyright Dispute</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Your affirmative act of using the Services and/or registering for the Services constitutes your electronic signature to this Agreement, which includes our Privacy Policy, Acceptable Use Policy and Additional Terms, and your consent to enter into agreements with us electronically.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.2 </strong>\r\n");
      out.write("                    <strong>Changes to These Terms of Use</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    We may change these Terms of Use and the other documents consisting of the Agreement at any time, as we reasonably deem appropriate. Upon any such change, we will post the amended terms on the Portal; we may also attempt to notify you in some other way. Your continued use of the Portal and/or the Services following such posting shall constitute your affirmative acknowledgement of the Terms of Use or other applicable Agreement document, the modification, and agreement to abide and be bound by the Terms of Use or other applicable Agreement document, as amended. We encourage you to periodically review these Terms of Use. If at any time you choose not to accept these terms of use, including following any such modifications hereto, then you must stop using the Portal and the Services.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.3 </strong>\r\n");
      out.write("                    <strong>Entire Agreement</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    This Agreement and any supplemental terms, policies, rules and guidelines posted through the Services, including the Privacy Policy, Disclaimer, constitute the entire agreement between you and us and supersede all previous written or oral agreements. If any part of this Agreement is held invalid or unenforceable, that portion shall be construed in a manner consistent with applicable law to reflect, as nearly as possible, the original intentions of the parties, and the remaining portions shall remain in full force and effect. The failure of TIFFEAT to exercise or enforce any right or provision of this Agreement shall not constitute a waiver of such right or provision. The failure of either party to exercise in any respect any right provided for herein shall not be deemed a waiver of any further rights hereunder.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.4 </strong>\r\n");
      out.write("                    <strong>Headings</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    The headings of the sections of this Agreement are for convenience only, do not form a part hereof, and in no way limit, define, describe, modify, interpret or construe the meaning, scope or intent of this Agreement or any terms or conditions therein.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.5 </strong>\r\n");
      out.write("                    <strong>Assignment</strong>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    We may assign this contract at any time, including without limitation to any parent, subsidiary, or any affiliated company, or as part of the sale to, merger with, or other transfer of our company to another entity. You may not assign, transfer or sublicense this Agreement to anyone else and any attempt to do so in violation of this section shall be null and void.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.6 </strong>\r\n");
      out.write("                    <strong>Termination</strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    You can stop using the Services at any time and without notice to us. Similarly, we may terminate access to the Services to you or any other users or stop offering the Service at any time without notice. Such termination will be without any liability on us.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.7 </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tAmendments To The Services\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    TIFFEAT may terminate, change, suspend or discontinue any aspect of this Portal, including the availability of any features of the Portal or scheme at any time and without notice. TIFFEAT also reserves the right, at its sole discretion, to change, modify, add or remove any portion of these terms in whole or in part, at any time and without notice. TIFFEAT may terminate the authorization, rights and license given above at any time and without notice. Your continued use of this Portal after any changes to these terms are posted will be considered acceptance of those changes.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.8 </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tForce Majeure\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    We shall not be liable to the User or be deemed to be in breach of this Agreement by reason of any delay in performing or any failure to perform any of our obligations if the delay or failure was due to any cause beyond our reasonable control. Without prejudice to the generality of the foregoing the following shall be regarded as causes beyond our reasonable control:\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    a) act of God, explosion, flood, tempest, fire or accident;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    b) war or threat of war, sabotage, insurrection, civil disturbance or requisition;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    c) acts of restrictions, regulations, bye-laws, prohibitions or measures of any kind on the part of any governmental parliamentary or local authority;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    d) import or export regulations or embargoes;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    e) interruption of traffic, strikes, lock-outs, other industrial actions or trade disputes (whether involving employees of TIFFEAT or of a third party);\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    f) interruption of Service or operation, difficulties in obtaining raw materials labour fuel parts or machinery;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    g) power failure or breakdown in machinery.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    h) upon the happening of any one of the events set out in Condition (a) TIFFEAT may at its option:-\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    i. fully or partially suspend delivery/performance while such event or circumstances continues;\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    ii. terminate any Contract so affected with immediate effect by notifying the User and TIFFEAT shall not be liable for any loss or damage suffered by the User as a result thereof.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.9 </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tBreaches Of These Terms And Conditions\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Without prejudice to the userâs other rights under these terms and conditions, if you breach any of these terms and conditions in anyway, we may take such action as deemed appropriate to deal with the breach, including seeking of legal remedy, suspending your access to the Portal, prohibiting you from accessing the Portal, blocking computers using your IP address from accessing the Portal and / or contacting your internet service provider to request that they block your access to the Portal.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <strong>21.10 </strong>\r\n");
      out.write("                    <strong>\r\n");
      out.write("\t\tGoverning Law\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</strong>\r\n");
      out.write("                </p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    These terms shall be governed by and constructed in accordance with the laws of India without reference to conflict of laws principles and disputes arising in relation hereto shall be subject to the exclusive jurisdiction of the courts at Pune, Maharashtra India.\r\n");
      out.write("                    <p>\r\n");
      out.write("                    </p>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Footer</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("          <!--  Start of Footer-->\r\n");
      out.write("    \t<div class=\"container-fluid footer\">\r\n");
      out.write("        <p>Designed by <a href=\"http://resoneuronance.com/\">Resoneuronance</a></p>\r\n");
      out.write("   \t\t</div>\r\n");
      out.write("    <!--  End Of Footer-->\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/iScroll/5.1.1/iscroll-min.js\"></script>\r\n");
      out.write("    <script src=\"//cdn.rawgit.com/ungki/bootstrap.dropdown/3.3.1/dropdown.min.js\"></script>\r\n");
      out.write("    <script src=\"js/star-rating.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <!-- drawer js -->\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f14(_jspx_page_context))
        return;
      out.write("\"></script>     \r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f15(_jspx_page_context))
        return;
      out.write("\"></script>   \r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_c_005furl_005f16(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("  $(\".drawer\").drawer();\r\n");
      out.write("});\r\n");
      out.write("    </script>  \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/header.jsp(17,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/contactUs.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/pages/header.jsp(18,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/home.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/pages/header.jsp(19,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/tiffin_order.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/pages/header.jsp(20,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/star-rating.min.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/pages/header.jsp(21,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/quick_daily_order.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/pages/header.jsp(22,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/tiffin_summary.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/pages/header.jsp(23,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/payment_details.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f7.setParent(null);
    // /WEB-INF/pages/header.jsp(24,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f7.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/login_page.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
    if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f8.setParent(null);
    // /WEB-INF/pages/header.jsp(25,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f8.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/register_page.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
    if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f9.setParent(null);
    // /WEB-INF/pages/header.jsp(26,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f9.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/drawer.min.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
    if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f10.setParent(null);
    // /WEB-INF/pages/header.jsp(27,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f10.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/add_money.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
    if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f11.setParent(null);
    // /WEB-INF/pages/header.jsp(28,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f11.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/FAQ.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
    if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f12.setParent(null);
    // /WEB-INF/pages/header.jsp(29,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f12.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/css/style.css", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
    if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/pages/header.jsp(68,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email == null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            \t\t<li class=\"drawer-menu-item\"><a href=\"customerLogin.htm\" id=\"drawer_link1\">Login</a></li>\r\n");
        out.write("                \t<!-- <li class=\"drawer-menu-item\"><a href=\"registerCustomer.htm\" id=\"drawer_link1\">Register</a></li> -->\r\n");
        out.write("            \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/pages/header.jsp(76,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t<li class=\"drawer-menu-item\"><a href=\"logout.htm\" id=\"drawer_link1\">Logout</a></li>\r\n");
        out.write("                \t<li class=\"drawer-menu-item\"><a href=\"customerHome.htm\" id=\"drawer_link1\">Home</a></li>\r\n");
        out.write("                \t<li class=\"drawer-menu-item\"><a href=\"quickOrders.htm\" id=\"drawer_link1\">Quick Orders</a></li>\r\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/pages/header.jsp(104,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.email != null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
        out.write("                <p class=\"navbar-text navbar-right\" id=\"navbar_link1\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</p>\r\n");
        out.write("            </div>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f13.setParent(null);
    // /WEB-INF/pages/footer.jsp(27,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f13.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/js/star-rating.js", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
    if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f14.setParent(null);
    // /WEB-INF/pages/footer.jsp(28,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f14.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/js/wow.min.js", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f14 = _jspx_th_c_005furl_005f14.doStartTag();
    if (_jspx_th_c_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f15.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f15.setParent(null);
    // /WEB-INF/pages/footer.jsp(29,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f15.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/js/custom.js", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f15 = _jspx_th_c_005furl_005f15.doStartTag();
    if (_jspx_th_c_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f16 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f16.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f16.setParent(null);
    // /WEB-INF/pages/footer.jsp(30,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f16.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resources}/js/jquery.drawer.min.js", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f16 = _jspx_th_c_005furl_005f16.doStartTag();
    if (_jspx_th_c_005furl_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f16);
    return false;
  }
}
