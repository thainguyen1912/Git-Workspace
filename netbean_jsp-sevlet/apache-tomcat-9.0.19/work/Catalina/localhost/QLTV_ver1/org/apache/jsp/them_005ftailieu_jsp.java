/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-06-05 11:30:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.TheLoai_DAO;
import dao.db_connection;
import dao.TaiLieu_DAO;
import enity.TaiLieu;
import java.util.ArrayList;
import enity.NhanVien;

public final class them_005ftailieu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.TheLoai_DAO");
    _jspx_imports_classes.add("enity.NhanVien");
    _jspx_imports_classes.add("enity.TaiLieu");
    _jspx_imports_classes.add("dao.TaiLieu_DAO");
    _jspx_imports_classes.add("dao.db_connection");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        db_connection db=new db_connection();
        TaiLieu_DAO tlidao=new TaiLieu_DAO(db);
        TheLoai_DAO tlodao=new TheLoai_DAO(db);
        ArrayList<TaiLieu> tli=tlidao.getAll();
        String maTaiLieuMoi="";
            String maTaiLieuCu=tli.get(tli.size()-1).getMaTaiLieu().toString();
            int soTaiLieuMoi=Integer.valueOf(maTaiLieuCu.substring(3, maTaiLieuCu.length()).toString()) + 1;
           
            if(soTaiLieuMoi<=9) maTaiLieuMoi="TL_000"+soTaiLieuMoi;
            if(soTaiLieuMoi>=10&&soTaiLieuMoi<=99) maTaiLieuMoi="TL_00"+soTaiLieuMoi;
            if(soTaiLieuMoi>=100&&soTaiLieuMoi<=999) maTaiLieuMoi="TL_0"+soTaiLieuMoi;
            if(soTaiLieuMoi>=1000) maTaiLieuMoi="TL_"+soTaiLieuMoi;
            
            ArrayList<String> list_matlo=tlodao.getAllMaTheLoai();
            
            ArrayList<String> list_tentlo=tlodao.getAllTenTheLoai();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Thêm Tài Liệu</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/Google_font_download.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            select option{\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function kiemtra_form() {\n");
      out.write("                var tentli = document.getElementById('tentli').value;\n");
      out.write("                var soluong = document.getElementById('soluong').value;\n");
      out.write("                var nhaxb = document.getElementById('nhaxb').value;\n");
      out.write("                var namxb = document.getElementById('namxb').value;\n");
      out.write("                var tacgia = document.getElementById('tacgia').value;\n");
      out.write("                \n");
      out.write("                if (tentli == '') {\n");
      out.write("                    alert('Bạn chưa nhập tên tài liệu');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    if (soluong == '') {\n");
      out.write("                        alert('Bạn chưa nhập số lượng tài liệu');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    else {\n");
      out.write("                        if (isNaN(soluong) == true) {\n");
      out.write("                            alert('Xin hãy kiểm tra lại tính hợp lệ của trường \"Số Lượng\"');\n");
      out.write("                            return false;\n");
      out.write("                        } \n");
      out.write("                        else {\n");
      out.write("                            if (nhaxb == '') {\n");
      out.write("                                alert('Bạn chưa nhập tên nhà xuất bản');\n");
      out.write("                                return false;\n");
      out.write("                            }\n");
      out.write("                            else {\n");
      out.write("                                if (namxb == '') {\n");
      out.write("                                    alert('Bạn chưa nhập năm xuất bản');\n");
      out.write("                                    return false;\n");
      out.write("                                }\n");
      out.write("                                else {\n");
      out.write("                                    if (isNaN(namxb) == true) {\n");
      out.write("                                        alert('Xin hãy kiểm tra lại tính hợp lệ của trường \"Năm Xuất Bản\"');\n");
      out.write("                                        return false;\n");
      out.write("                                    }\n");
      out.write("                                    else {\n");
      out.write("                                        if (tacgia == '') {\n");
      out.write("                                            alert('Bạn chưa nhập tên tác giả');\n");
      out.write("                                        }\n");
      out.write("                                        else\n");
      out.write("                                            return true;\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css3.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><span>Home</span>Admin</a>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.container-fluid -->\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("            <div class=\"profile-sidebar\">\n");
      out.write("                <div class=\"profile-userpic\">\n");
      out.write("                    <img src=\"images/meo1.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"profile-usertitle\">\n");
      out.write("                    <div class=\"profile-usertitle-name\" style=\"font-size: 14px\">\n");
      out.write("                        ");

                            NhanVien nv = (NhanVien) session.getAttribute("user");
                        
      out.write("\n");
      out.write("                        ");
      out.print(nv.getHoTen());
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"profile-usertitle-status\"><span class=\"indicator label-success\"></span>Online</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divider\"></div>\n");
      out.write("            <ul class=\"nav menu\">\n");
      out.write("                <li class=\"active\"><a><em class=\"fa fa-dashboard\">&nbsp;</em>Thêm Tài Liệu</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div><!--/.sidebar-->\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li><a href=\"TheLoai_Servlet\">\n");
      out.write("                            <em class=\"fa fa-home\"></em>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"active\">Thêm Tài Liệu</li>\n");
      out.write("                </ol>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("            <div class=\"container\" style=\"margin-left: 226px; width: 1100px\">\n");
      out.write("                <div class=\"table-wrapper\" >\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-lg-12\">\n");
      out.write("                                    <h1 style=\"margin-bottom: 5px\" class=\"page-header\">Thêm Tài Liệu</h1>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <form action=\"Manager_TaiLieu_Servlet\" onsubmit=\"return kiemtra_form()\">\n");
      out.write("                                <table class=\"table table-bordered\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"width: 100px\" >Mã Tài Liệu</th>\n");
      out.write("                                            <th>Tên Tài Liệu</th>\n");
      out.write("                                            <th style=\"width: 150px\" >Tên Thể Loại</th>\n");
      out.write("                                            <th style=\"width: 87px\">Số Lượng</th>\n");
      out.write("                                            <th>Nhà Xuất Bản</th>\n");
      out.write("                                            <th>Năm Xuất Bản</th>\n");
      out.write("                                            <th>Tác Giả</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"matli\" id=\"matli\" value=\"");
      out.print(maTaiLieuMoi );
      out.write("\" readonly=\"true\"></td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"tentli\" id=\"tentli\"></td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <select name=\"matlo\" style=\"border: 1px solid #ddd; height: 46px;width: 100%;border-radius: 5px\">\n");
      out.write("\n");
      out.write("                                                    ");
for (int i = 0; i < list_matlo.size(); i++) {
      out.write("\n");
      out.write("                                                    <option value=\"");
      out.print(list_matlo.get(i));
      out.write('"');
      out.write('>');
      out.print(list_tentlo.get(i));
      out.write("</option>\n");
      out.write("                                                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                                </select> \n");
      out.write("                                            </td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"soluong\" id=\"soluong\"></td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"nhaxb\" id=\"nhaxb\"></td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"namxb\" id=\"namxb\"></td>\n");
      out.write("                                            <td><input type=\"text\" class=\"form-control\" name=\"tacgia\" id=\"tacgia\"></td>\n");
      out.write("\n");
      out.write("                                        </tr> \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>    \n");
      out.write("                                <div class=\"col-sm-4\" style=\"margin-left: 46%\">\n");
      out.write("                                    <a><button style=\"background-color: #30a5ff\" type=\"submit\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus add\"></i> Add New</button></a>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                                        ");
ServletContext context=getServletContext();
                                         context.setAttribute("context", "add_tli");
                                        
      out.write("                     \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("\n");
      out.write("        </div>\t\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
