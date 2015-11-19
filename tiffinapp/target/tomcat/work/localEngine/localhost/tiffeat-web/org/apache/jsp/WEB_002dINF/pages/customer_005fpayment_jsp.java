package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_005fpayment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<title>Payment</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("Redirecting to payment gateway.. Please do not close or refresh..\r\n");
      out.write("\r\n");
      out.write("<form id = \"payment_form\" action='https://test.payu.in/_payment' method='post'>\r\n");
      out.write("<input type=\"hidden\" name=\"firstname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"surl\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.successUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"key\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.merchantKey}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"hash\" value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.hashKey}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("<input type=\"hidden\" name=\"furl\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.failureUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"txnid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"productinfo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.productInfo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"amount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${payUDetails.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("<input type=\"hidden\" name=\"drop_category\" value=\"COD,CASH,EMI\" />\r\n");
      out.write("\r\n");
      out.write("<input type= \"submit\" value=\"submit\" style=\"display:none\"/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tdocument.getElementById(\"payment_form\").submit();\r\n");
      out.write("</script>\r\n");
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
}
