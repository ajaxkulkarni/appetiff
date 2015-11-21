package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rns.tiffeat.web.util.Constants;

public final class admin_005fadd_005fdaily_005fcontent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <title>TiffEat</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css\">\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" type=\"text/css\">\r\n");
      out.write("<!--  <link rel=\"stylesheet\" href=\"css/meals_select.css\">-->\r\n");
      out.write("    ");
 if(Constants.ASSETS_ROOT == "/resources" ) { 
      out.write("\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">  \r\n");
      out.write("  ");
}else { 
      out.write("\r\n");
      out.write("  <link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("  ");
} 
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\" class=\"index\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Navigation -->\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header page-scroll\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#page-top\">tiffEat</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container-fluid -->\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<div class=\"tiffin_name>\">\r\n");
      out.write("<h2>Mahalaxmi tiffin service</h2>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"wrapper1\">\r\n");
      out.write("<div class=\"col-lg-12\">\r\n");
      out.write("<a href = \"admin.htm?vendorEmail=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Back</a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<form action=\"addDailyContent\" method=\"post\">         \r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("                <div class=\"row Lunch\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"col-md-5 type\">\r\n");
      out.write("                         <p>VEG</p>\r\n");
      out.write("                         \t<input type=\"hidden\" name=\"mealId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mealId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <h5>Main Course</h5>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" name=\"mainItem\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <h5>Chapati/roti/paratha</h5>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" name=\"subItem1\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <h5>Rice/Dal</h5>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" name=\"subItem2\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <h5>Salad</h5>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" name=\"subItem3\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-6\">\r\n");
      out.write("                                    <h5>Extra</h5>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"text\" name=\"subItem4\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                            <div class=\"row rowdiv\">\r\n");
      out.write("                                <div class=\"col-md-5\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"Add\" class=\"form-control\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>    \r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("</div>\r\n");
      out.write("</body>   \r\n");
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
    // /WEB-INF/pages/admin_add_daily_content.jsp(21,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/meals_select.css");
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
    // /WEB-INF/pages/admin_add_daily_content.jsp(23,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("../../resources/assets/css/meals_select.css");
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
    // /WEB-INF/pages/admin_add_daily_content.jsp(71,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    // /WEB-INF/pages/admin_add_daily_content.jsp(71,20) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/admin_add_daily_content.jsp(71,20) '${mealType}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${mealType}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write(" \t\t\t\t\t <label class=\"options\" for=\"option-1\">\r\n");
          out.write("                      <input type=\"radio\" id=\"option-1\" class=\"\" name=\"mealType\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" autofocus/>\r\n");
          out.write("                      <span class=\"\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                    </label>\r\n");
          out.write("\t\t\t      \t");
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
}
