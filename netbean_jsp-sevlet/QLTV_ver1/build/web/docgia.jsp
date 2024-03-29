<%@page import="enity.DocGia"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<DocGia> list_dg = (ArrayList<DocGia>) request.getAttribute("list_dg");
    ServletContext context = getServletContext();
    context.setAttribute("context", "delete_dg");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <%@ page contentType="text/html; charset=UTF-8" %>
        <title>Quản Lý Độc Giả</title>
        <jsp:include page="head.jsp" />
    </head>
    <body>
        <jsp:include page="title_admin.jsp" />
        <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
            <jsp:include page="user_status.jsp" />
            <ul class="nav menu" style="margin: 0px">
                <li class="table_hover"><a href="thongtin_admin.jsp"><span class="glyphicon glyphicon-th-list"></span> Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="suathongtin_admin.jsp"><span class="glyphicon glyphicon-th-list"></span> Sửa Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="TheLoai_Servlet"><span class="glyphicon glyphicon-th-list"></span> Quản Lý Thể Loại</a></li>
                <li class="table_hover"><a href="TaiLieu_Servlet"><span class="glyphicon glyphicon-book"></span> Quản Lý Tài Liệu</a></li>
                <li class="table_hover"><a href="NhanVien_Servlet"><span class="glyphicon glyphicon-briefcase"></span> Quản Lý Nhân Viên</a></li>
                <li class="active table_hover"><a href="DocGia_Servlet"><span class="glyphicon glyphicon-user"></span> Quản Lý Độc Giả</a></li>
                <li class="table_hover"><a  onclick="return xacNhan()" href="Logout_Servlet"><span class="glyphicon glyphicon-off"></span> Đăng Xuất</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
            <div class="row">
                <ol class="breadcrumb">
                    <li><a href="DocGia_Servlet">
                            <em class="fa fa-home"></em>
                        </a></li>
                    <li class="active">Quản Lý Độc Giả</li>
                </ol>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <h1 style="width: 40%" class="page-header">Quản Lý Độc Giả</h1>
                </div>
            </div>
        </div>	
        <div style="margin-left: 226px; width: 1100px" class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div style="width: 40%; float: left" class="col-sm-8"><h2>Danh Sách <b>Độc Giả</b></h2></div>
                        <form action="Search_DocGia_Servlet">
                            <div style="width:48%; float: left">
                                <input id="madg" type="text" name="madg_search" style="font-size: 14px;border-radius: 4px;height: 30px;border-style: groove;width: 220px; margin-left: 38%;" placeholder="  search here.. " required>
                                <a><button style="background-color: #30a5ff" type="" class="btn btn-info add-new"><span class="fa fa-search"></span>  Search</button></a>
                            </div>
                        </form>
                        <div style="width: 12%" class="col-sm-4">
                            <a href="them_docgia.jsp"><button style="background-color: #30a5ff" type="button" class="btn btn-info add-new"><i class="fa fa-plus"></i> Add New</button></a>
                        </div>
                    </div>
                </div>
                <table class="table table-bordered table_hover" id="table" style="border-radius:14px;border-style: hidden ">
                    <thead>
                        <tr>
                            <th style="width: 100px">Mã Độc Giả</th>
                            <th>Họ Tên</th>
                            <th style="width: 90px">Giới Tính</th>
                            <th>Ngày Sinh</th>
                            <th>Đối Tượng</th>
                            <th>Ngày Cấp</th>
                            <th>Ngày Hết Hạn</th>
                            <th>Mật Khẩu</th>
                            <th>Số Lượng Tài Liêu</th>
                            <th>Số Lượng Mỗi Tài Liệu</th>
                            <th>Số Ngày Mượn</th>
                            <th>Số Dư Tài Khoản</th>
                            <th style="width: 17%">Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (DocGia docgia : list_dg) {%>
                        <tr>
                            <td><%=docgia.getMaDocGia()%></td>
                            <td><%=docgia.getHoTen()%></td>
                            <td><%=docgia.getGioiTinh() == 1 ? "Nam" : "Nữ"%></td>
                            <td><%=docgia.getNgaySinh()%></td>
                            <td><%=docgia.getDoiTuong()%></td>
                            <td><%=docgia.getNgayCap()%></td>
                            <td><%=docgia.getNgayHetHan()%></td>
                            <td><%=docgia.getMatKhau()%></td>
                            <td><%=docgia.getSoLuongTaiLieu()%></td>
                            <td><%=docgia.getSoLuongMoiTaiLieu()%></td>
                            <td><%=docgia.getSoNgayMuon()%></td>
                            <td><%=docgia.getSoDuTaiKhoan()%></td>
                            <td>
                                <a 
                                   href="sua_docgia.jsp?madg=<%=docgia.getMaDocGia()%>&hoten=<%=docgia.getHoTen()%>&gioitinh=<%=docgia.getGioiTinh()%>&ngaysinh=<%=docgia.getNgaySinh()%>&doituong=<%=docgia.getDoiTuong()%>&ngaycap=<%=docgia.getNgayCap()%>&ngayhethan=<%=docgia.getNgayHetHan()%>&matkhau=<%=docgia.getMatKhau()%>&soluongtailieu=<%=docgia.getSoLuongTaiLieu()%>&soluongmoitailieu=<%=docgia.getSoLuongMoiTaiLieu()%>&songaymuon=<%=docgia.getSoNgayMuon()%>&sodutaikhoan=<%=docgia.getSoDuTaiKhoan()%>"
                                   class="edit" title="Edit" data-toggle="tooltip"
                                >
                                <button type="button" class="btn btn-warning">
                                    <span class="fa fa-pencil mr-5"></span>Sửa
                                </button>
                                </a>
                                <a onclick="return xacNhan()" href="Manager_DocGia_Servlet?madg=<%=docgia.getMaDocGia()%>"class="delete" title="Delete" data-toggle="tooltip">
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
