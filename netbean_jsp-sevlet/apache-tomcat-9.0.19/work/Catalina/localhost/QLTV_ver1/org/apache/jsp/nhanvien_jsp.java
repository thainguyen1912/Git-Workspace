/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-06-05 10:34:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import enity.NhanVien;

public final class nhanvien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("enity.NhanVien");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Quản Lý Nhân Viên</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/Google_font_download.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/css3.css\">\n");
      out.write("        \n");
      out.write("            <style type=\"text/css\">\n");
      out.write("\n");
      out.write("            .table-title {\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                margin: 0 0 10px;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 6px 0 0;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("            .table-title .add-new {\n");
      out.write("                float: right;\n");
      out.write("                height: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 12px;\n");
      out.write("                text-shadow: none;\n");
      out.write("                min-width: 100px;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                line-height: 13px;\n");
      out.write("            }\n");
      out.write("            .table-title .add-new i {\n");
      out.write("                margin-right: 4px;\n");
      out.write("            }\n");
      out.write("            table.table {\n");
      out.write("                table-layout: fixed;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            table.table th:last-child {\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                cursor: pointer;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                min-width: 24px;\n");
      out.write("            }    \n");
      out.write("            table.table td a.add {\n");
      out.write("                color: #27C46B;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #E34724;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }\n");
      out.write("            table.table td a.add i {\n");
      out.write("                font-size: 24px;\n");
      out.write("                margin-right: -1px;\n");
      out.write("                position: relative;\n");
      out.write("                top: 3px;\n");
      out.write("            }    \n");
      out.write("            table.table .form-control {\n");
      out.write("                height: 32px;\n");
      out.write("                line-height: 32px;\n");
      out.write("                box-shadow: none;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("            table.table .form-control.error {\n");
      out.write("                border-color: #f50000;\n");
      out.write("            }\n");
      out.write("            table.table td .add {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("        </style>    \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function xacNhan(){\n");
      out.write("                var re=confirm(\"Bạn có muốn tiếp tục không ?\")\n");
      out.write("                if(re==true) return true\n");
      out.write("                else return false\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList<NhanVien> list_nv = (ArrayList<NhanVien>) request.getAttribute("list_nv");
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\"><span>Home</span>Admin</a>\n");
      out.write("                    </ul>\n");
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
      out.write("                <li><a href=\"TheLoai_Servlet\"><em class=\"fa fa-dashboard\">&nbsp;</em> Quản Lý Thể Loại</a></li>\n");
      out.write("                <li><a href=\"TaiLieu_Servlet\"><em class=\"fa fa-calendar\">&nbsp;</em> Quản Lý Tài Liệu</a></li>\n");
      out.write("                <li class=\"active\"><a href=\"NhanVien_Servlet\"><em class=\"fa fa-bar-chart\">&nbsp;</em> Quản Lý Nhân Viên</a></li>\n");
      out.write("                <li><a href=\"DocGia_Servlet\"><em class=\"fa fa-toggle-off\">&nbsp;</em> Quản Lý Độc Giả</a></li>\n");
      out.write("                <li><a href=\"Logout_Servlet\"><em class=\"fa fa-power-off\">&nbsp;</em> Đăng Xuất</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <ol class=\"breadcrumb\">\n");
      out.write("                    <li><a href=\"#\">\n");
      out.write("                            <em class=\"fa fa-home\"></em>\n");
      out.write("                        </a></li>\n");
      out.write("                    <li class=\"active\">Quản Lý Nhân Viên</li>\n");
      out.write("                </ol>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Quản Lý Nhân Viên</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div style=\"margin-left: 226px; width: 1100px\" class=\"container\">\n");
      out.write("            <div class=\"table-wrapper\">\n");
      out.write("                <div class=\"table-title\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8\"><h2>Danh Sách <b>Nhân Viên</b></h2></div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <a href=\"them_nhanvien.jsp\"><button style=\"background-color: #30a5ff\" type=\"button\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus\"></i> Add New</button></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <table class=\"table table-bordered\" id=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Mã Nhân Viên</th>\n");
      out.write("                            <th>Họ Tên</th>\n");
      out.write("                            <th>Chức Vụ</th>\n");
      out.write("                            <th>Tài Khoản</th>\n");
      out.write("                            <th>Mật Khẩu</th>\n");
      out.write("                            <th>Quyền</th>\n");
      out.write("                            <th>Actions</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");
for (NhanVien nhanvien : list_nv) {
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(nhanvien.getMaNhanVien());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nhanvien.getHoTen());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nhanvien.getChucVu());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nhanvien.getTaiKhoan());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nhanvien.getMatKhau());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(nhanvien.getQuyen());
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <a href=\"sua_nhanvien.jsp?manv=");
      out.print(nhanvien.getMaNhanVien());
      out.write("&hoten=");
      out.print(nhanvien.getHoTen());
      out.write("&chucvu=");
      out.print(nhanvien.getChucVu());
      out.write("&taikhoan=");
      out.print(nhanvien.getTaiKhoan());
      out.write("&matkhau=");
      out.print(nhanvien.getMatKhau());
      out.write("&quyen=");
      out.print(nhanvien.getQuyen());
      out.write("\" class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                                <a onclick=\"return xacNhan()\" href=\"Manager_NhanVien_Servlet?manv=");
      out.print(nhanvien.getMaNhanVien());
      out.write("\"class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                            </td>\n");
      out.write("                        </tr> \n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                    ");
ServletContext context=getServletContext();
                       context.setAttribute("context", "delete_dg");
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
