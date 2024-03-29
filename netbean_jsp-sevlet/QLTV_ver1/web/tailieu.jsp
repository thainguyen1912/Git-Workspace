<%@page import="dao.db_connection"%>
<%@page import="dao.TheLoai_DAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="enity.TaiLieu"%>
<%
    ServletContext context = getServletContext();
    context.setAttribute("context", "delete_tli");
    db_connection db = new db_connection();
    TheLoai_DAO thldao = new TheLoai_DAO(db);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <%@ page contentType="text/html; charset=UTF-8" %>
        <title>Quản Lý Tài Liệu</title>
        <jsp:include page="head.jsp" />
    </head>
    <body>
        <%
            ArrayList<TaiLieu> list_tli = (ArrayList<TaiLieu>) request.getAttribute("list_tli");
        %>
        <jsp:include page="title_admin.jsp" />
        <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
            <jsp:include page="user_status.jsp" />
            <ul class="nav menu" style="margin: 0px">
                <li class="table_hover"><a href="thongtin_admin.jsp"><span class="glyphicon glyphicon-th-list"></span> Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="suathongtin_admin.jsp"><span class="glyphicon glyphicon-th-list"></span> Sửa Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="TheLoai_Servlet"><span class="glyphicon glyphicon-th-list"></span> Quản Lý Thể Loại</a></li>
                <li class="active table_hover"><a href="TaiLieu_Servlet"><span class="glyphicon glyphicon-book"></span> Quản Lý Tài Liệu</a></li>
                <li class="table_hover"><a href="NhanVien_Servlet"><span class="glyphicon glyphicon-briefcase"></span> Quản Lý Nhân Viên</a></li>
                <li class="table_hover"><a href="DocGia_Servlet"><span class="glyphicon glyphicon-user"></span> Quản Lý Độc Giả</a></li>
                <li class="table_hover"><a  onclick="return xacNhan()" href="Logout_Servlet"><span class="glyphicon glyphicon-off"></span> Đăng Xuất</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
            <div class="row">
                <ol class="breadcrumb">
                    <li><a href="TaiLieu_Servlet">
                            <em class="fa fa-home"></em>
                        </a></li>
                    <li class="active">Quản Lý Tài Liệu</li>
                </ol>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <h1 style="width: 40%" class="page-header">Quản Lý Tài Liệu</h1>
                </div>
            </div>
        </div>
        <div class="container" style="margin-left: 226px; width: 1100px">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div style="width: 40%; float: left" class="col-sm-8"><h2>Danh Sách <b>Tài Liệu</b></h2></div>
                        <form action="Search_TaiLieu_Servlet">
                            <div style="width:48%; float: left">
                                <input id="matl" type="text" name="matl_search" style="font-size: 14px;border-radius: 4px;height: 30px;border-style: groove;width: 220px; margin-left: 38%;" placeholder="  search here.. " required>
                                <a><button style="background-color: #30a5ff" type="" class="btn btn-info add-new"><span class="fa fa-search"></span>  Search</button></a>
                            </div>
                        </form>
                        <div style="width: 12%" class="col-sm-4">
                            <a href="them_tailieu.jsp"><button style="background-color: #30a5ff" type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button></a>
                        </div>
                    </div>
                </div>
                <table class="table table-bordered table_hover" id="table" style="border-radius:14px;border-style: hidden ">
                    <thead>
                        <tr>
                            <th >Mã Tài Liệu</th>
                            <th>Tên Tài Liệu</th>
                            <th>Tên Thể Loại</th>
                            <th>Số Lượng</th>
                            <th>Nhà Xuất Bản</th>
                            <th>Năm Xuất Bản</th>
                            <th>Tác Giả</th>
                            <th>Giá Tiền</th>
                            <th style="width: 17%">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (TaiLieu tli : list_tli) {%>
                        <tr>
                            <td><%=tli.getMaTaiLieu()%></td>
                            <td><%=tli.getTenTaiLieu()%></td>
                            <td><%=thldao.getTenTheLoai(tli.getMaTheLoai())%></td>
                            <td><%=tli.getSoLuong()%></td>
                            <td><%=tli.getNhaXuatBan()%></td>
                            <td><%=tli.getNamXuatBan()%></td>
                            <td><%=tli.getTacGia()%></td>
                            <td><%=tli.getGiaTien()%></td>
                            <td>
                                <a href="sua_tailieu.jsp?matli=<%=tli.getMaTaiLieu()%>&tentli=<%=tli.getTenTaiLieu()%>&mathl=<%=tli.getMaTheLoai()%>&sl=<%=tli.getSoLuong()%>&nhaxb=<%=tli.getNhaXuatBan()%>&namxb=<%=tli.getNamXuatBan()%>&tg=<%=tli.getTacGia()%>&giatien=<%=tli.getGiaTien()%>" class="edit" title="Edit" data-toggle="tooltip">
                                    <button type="button" class="btn btn-warning">
                                        <span class="fa fa-pencil mr-5"></span>Sửa
                                    </button>
                                </a>
                                <a onclick="return xacNhan()" href="Manager_TaiLieu_Servlet?maTLI=<%=tli.getMaTaiLieu()%>"class="delete" title="Delete" data-toggle="tooltip">
                                    <button type="button" class="btn btn-danger">
                                        <span class="fa fa-trash mr-5"></span>Xóa
                                    </button>
                                </a>
                            </td>
                        </tr> 
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div> 
    </body>
</html>
