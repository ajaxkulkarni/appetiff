package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fview_005forders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/tablesort.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\">\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Fonts -->\r\n");
      out.write("<link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Montserrat:400,700\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"http://code.jquery.com/jquery-1.10.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    function cancel(orderId) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("        \ttype : \"POST\",\r\n");
      out.write("            url : 'cancelCustomerOrder',\r\n");
      out.write("            data: \"order=\" + orderId,\r\n");
      out.write("            success : function(data) {\r\n");
      out.write("                //$('#result').html(data);\r\n");
      out.write("                alert(\"Here:\" +data);\r\n");
      out.write("            },\r\n");
      out.write("            error: function(e){\r\n");
      out.write("            \talert('Error in canceling!' + e);\r\n");
      out.write("        \t}\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"hscroll\">\r\n");
      out.write("<title>Today's orders</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"page-top\" class=\"index\">\r\n");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t <div class=\"navbar-header page-scroll\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#page-top\">tiffEat</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container-fluid --> </nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t<form action=\"orders.htm\">\r\n");
      out.write("\t\t\t<div class=\"wrapper1\">\r\n");
      out.write("<div class=\"col-lg-12\">\r\n");
      out.write("<a href = \"admin.htm?vendorEmail=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Back</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t<select name=\"status\" class=\"form-control option_dropdown\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<button type=\"submit\" value=\"Filter\">Filter</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<form action=\"delilverTiffins\" method=\"post\">\r\n");
      out.write("\t\t<table class=\"table-sort table-sort-search\" border=\"1\">\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 18px\"><strong>ID</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Name</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Email</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Phone</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Area</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Address</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Order\r\n");
      out.write("\t\t\t\t\t\t\t\tdate</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Order\r\n");
      out.write("\t\t\t\t\t\t\t\tformat</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Order\r\n");
      out.write("\t\t\t\t\t\t\t\tprice</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Meal\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Meal\r\n");
      out.write("\t\t\t\t\t\t\t\tcode</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Vendor</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Order\r\n");
      out.write("\t\t\t\t\t\t\t\ttime</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Payment\r\n");
      out.write("\t\t\t\t\t\t\t\tType</strong></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<td class=\"table-sort\" style=\"padding: 0 35px\"><strong>Order\r\n");
      out.write("\t\t\t\t\t\t\t\tstatus</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"deliver_report\">\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Deliver Tiffins\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"downloadExcel\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"Generate report\" />\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"http://code.jquery.com/jquery-1.10.1.min.js\"></script>\r\n");
      out.write("\t<script src=\"http://yandex.st/highlightjs/7.3/highlight.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("            // For Demo Purposes\r\n");
      out.write("            $(function () {\r\n");
      out.write("                $('table.table-sort').tablesort();\r\n");
      out.write("                hljs.initHighlightingOnLoad(); // Syntax Hilighting\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("       \r\n");
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
    // /WEB-INF/pages/admin_view_orders.jsp(11,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/bootstrap.min.css");
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
    // /WEB-INF/pages/admin_view_orders.jsp(16,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/css/freelancer.css");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/admin_view_orders.jsp(89,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/admin_view_orders.jsp(89,5) '${orderStatus}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orderStatus}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/admin_view_orders.jsp(89,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/pages/admin_view_orders.jsp(143,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/admin_view_orders.jsp(143,5) '${orders}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${orders}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/admin_view_orders.jsp(143,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("order");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/pages/admin_view_orders.jsp(144,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status == null || status == order.status}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"table-sort\">\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 18px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.customer.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.customer.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.customer.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.area}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.mealFormat}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.meal.price}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.meal.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.meal.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.meal.vendor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.mealType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.paymentType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<td style=\"padding: 0 35px\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.status}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t</tr>\r\n");
        out.write("\t\t\t\t\t\t");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/pages/admin_view_orders.jsp(161,36) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.date}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/pages/admin_view_orders.jsp(161,36) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/pages/admin_view_orders.jsp(180,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.meal.status == 'DISPATCH' && order.status == 'ORDERED'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"checkbox\" name=\"orders\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />Deliver</td>\r\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/pages/admin_view_orders.jsp(185,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.status == 'ORDERED'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"button\" value=\"Cancel\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\tonclick=\"cancel(");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")\"></td>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_c_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/pages/admin_view_orders.jsp(219,7) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/js/tablesort.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }
}
