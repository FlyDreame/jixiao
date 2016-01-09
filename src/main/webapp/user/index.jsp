<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>绩效考核后台管理</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <!-- Page Specific CSS -->
    <link rel="stylesheet" href="css/morris-0.4.3.min.css">
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <c:if test="${0 == sessionScope.userlevel}"><c:import url="nav.jsp"><c:param name="inclass"
                                                                                 value="active"/></c:import></c:if>
    <c:if test="${1 == sessionScope.userlevel}"><c:import url="nav1.jsp"><c:param name="inclass"
                                                                                  value="active"/></c:import></c:if>
    <c:if test="${2 == sessionScope.userlevel}"><c:import url="nav2.jsp"><c:param name="inclass"
                                                                                  value="active"/></c:import></c:if>
    <div id="page-wrapper">

        <div class="row">
            <div class="col-lg-12">
                <h1>默认主页 </h1>
                <ol class="breadcrumb">
                    <li class="active"><i class="fa fa-dashboard"></i> 默认主页</li>
                </ol>

            </div>
        </div><!-- /.row -->

        <div class="row">
            <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <form action="/user/updateuser.do" method="post">
                    <div class="form-group">
                        <label for="exampleInputId">名字</label>
                        <input type="text" class="form-control" id="exampleInputId" name="name" value="${user.name}">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">密码</label>
                        <input type="password" class="form-control" id="exampleInputPassword1"
                               name="password">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputId">手机</label>
                        <input type="text" class="form-control" name="phone" value="${user.phone}">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputId">邮箱</label>
                        <input type="text" class="form-control" name="email" value="${user.email}">
                    </div>
                    <button type="submit" class="btn btn-block btn-success">保存</button>
                </form>
            </div>
        </div><!-- /.row -->


    </div><!-- /#page-wrapper -->

</div><!-- /#wrapper -->

<!-- JavaScript -->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/bootstrap.js"></script>

<!-- Page Specific Plugins -->
<script src="js/raphael-min.js"></script>
<script src="js/morris-0.4.3.min.js"></script>
<script src="js/morris/chart-data-morris.js"></script>
<script src="js/tablesorter/jquery.tablesorter.js"></script>
<script src="js/tablesorter/tables.js"></script>

</body>
</html>
