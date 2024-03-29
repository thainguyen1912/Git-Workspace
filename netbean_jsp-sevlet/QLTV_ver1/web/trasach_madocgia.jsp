<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <%@ page contentType="text/html; charset=UTF-8" %>
        <title>Quản Lý Trả Sách</title>
        <jsp:include page="head.jsp" />
    </head>
    <body>
        <jsp:include page="title_librarian.jsp" />
        <div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
            <jsp:include page="user_status.jsp" />
            <ul class="nav menu" style="margin: 0px">
                <li class="table_hover"><a href="thongtin_thuthu.jsp"><span class="glyphicon glyphicon-th-list"></span> Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="suathongtin_thuthu.jsp"><span class="glyphicon glyphicon-th-list"></span> Sửa Thông Tin Cá Nhân</a></li>
                <li class="table_hover"><a href="muonsach_madocgia.jsp"><span class="glyphicon glyphicon-tasks"></span> Quản Lý Mượn Sách</a></li>
                <li class="active table_hover"><a href="trasach_madocgia.jsp"><span class="glyphicon glyphicon-transfer"></span> Quản Lý Trả Sách</a></li>
                <li class="table_hover"><a href="thongke_baocao.jsp"><span class="glyphicon glyphicon-indent-right"></span> Thống Kê, Báo Cáo</a></li>
                <li class="table_hover"><a  onclick="return xacNhan()" href="Logout_Servlet"><span class="glyphicon glyphicon-off"></span> Đăng Xuất</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
            <div class="row">
                <ol class="breadcrumb">
                    <li><a href="trasach_madocgia.jsp">
                            <em class="fa fa-home"></em>
                        </a></li>
                    <li class="active">Quản Lý Trả Sách</li>
                </ol>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <h1 style="width: 40%; margin-left: 30%" class="page-header">Quản Lý Trả Sách</h1>
                </div>
            </div>
            <form action="Check_DocGia_Servlet_Tra">
                <div style="margin-left: 28%">
                    <div style="overflow: auto;margin-bottom: 8px;">
                        <p style="float: left; margin: 6px; font-size: 16px">Mã Độc Giả</p>
                        <input id="madg" name="madg" style="width: 174px; border-style: groove;border-radius: 4px;height: 32px;float: left" type="text" placeholder=" search here.." required>
                        <div style="float: left; margin-left: 10px">
                            <a><button style="height: 31px;line-height: 2px;" type="submit" class="btn btn-primary"><span class="fa fa-search"></span>  Search</button></a>
                        </div>
                    </div>
                    <div style="clear: both; margin-left: 13%"><p style="color: deeppink;"> <%= (request.getAttribute("mess") == null ? "" : request.getAttribute("mess"))%></p></div>
                </div>
            </form>
        </div>
    </body>
</html>