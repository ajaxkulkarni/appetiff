package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.rns.tiffeat.web.util.Constants;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t");
 if(Constants.ASSETS_ROOT == "/resources" ) { 
      out.write("\r\n");
      out.write(" \t<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\t");
 }else{ 
      out.write("\r\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Admin | Home</title>\r\n");
      out.write("</head>\r\n");
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
      out.write("    <!-- Header \r\n");
      out.write("    <header>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                   \r\n");
      out.write("                    <div class=\"intro-text\">\r\n");
      out.write("                        <span class=\"name\">Vendorsssss</span>\r\n");
      out.write("                        \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </header>-->\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("    <br />\r\n");
      out.write("\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><strong>ID</strong></td>\r\n");
      out.write("\t\t\t<td><strong>Name</strong></td>\r\n");
      out.write("\t\t    <td><strong>Address</strong></td>\r\n");
      out.write("\t\t\t<td><strong>Phone_No</strong></td>\r\n");
      out.write("\t\t\t<td><strong>Rating</strong></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("<div class=\"col-lg-12\">\r\n");
      out.write("\r\n");
      out.write("    <a href=\"addVendor.htm\"><button class=\"button\">Add Vendor</button></a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<div class=\"view_order\">\r\n");
      out.write("<a href = \"allOrders.htm\">View Orders</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("<br />\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("\t<div class=\"demo-card\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <div class=\"card-header\">\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"card-block\">\r\n");
      out.write("            <!-- <h4 class=\"card-title\">\r\n");
      out.write("\t\t\tLunch</h4> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"mealtype\">\r\n");
      out.write("\t\t\t<h4>Quick Orders:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.quickOrderCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h4><br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h4>Schedule orders:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.scheduledOrderCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"col-md-4\">\r\n");
      out.write("\t<div class=\"demo-card\">\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"card-block\">\r\n");
      out.write("            <!-- <h4 class=\"card-title\">\r\n");
      out.write("\t\t\tDinner</h4> -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"mealtype\">\r\n");
      out.write("\t\t\t<h4>Lunch Orders: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(admin.lunchOrders)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("</h4><br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<h4>Dinner Orders:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(admin.dinnerOrders)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("             </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>  \r\n");
      out.write("</div>\r\n");
      out.write(" \t\t\t\t\t \r\n");
      out.write("                                 \r\n");
      out.write("    <br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  <div class=\"row\">\r\n");
      out.write("\t<div class=\"rns\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                      Design By <a href=\"http://www.resoneuronance.com/\"><strong>Team Resoneuronance</strong></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\t</div>-->\r\n");
      out.write("\t\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t<div class=\"footer-below\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-12\">\r\n");
      out.write("                      Copyright &copy; 2015 tiffEat.com\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
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
    // /WEB-INF/pages/admin_home.jsp(13,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /WEB-INF/pages/admin_home.jsp(15,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/css/freelancer.css");
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
    // /WEB-INF/pages/admin_home.jsp(17,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("../../resources/assets/css/bootstrap.min.css");
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
    // /WEB-INF/pages/admin_home.jsp(18,16) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("../../resources/assets/css/freelancer.css");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
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
    // /WEB-INF/pages/admin_home.jsp(83,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/admin_home.jsp(83,2) '${vendors}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${vendors}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/admin_home.jsp(83,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("vendor");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\t\r\n");
          out.write("\t\t\t<form action=\"vendorDetails\" method=\"post\">\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("    \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.address}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.rating}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t<input type=\"hidden\" name=\"email\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vendor.email}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t<td><!-- <a href=\"meals.html\">View</a> -->\r\n");
          out.write("\t\t\t<input type=\"submit\" value=\"View\"/></td>\r\n");
          out.write("\t\t\t</form>\r\n");
          out.write("    \t\t</tr>\r\n");
          out.write("    \t");
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
