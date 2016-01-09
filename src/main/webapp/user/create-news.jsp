<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>公告 - 绩效考核后台管理</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/summernote.css">
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <c:if test="${0 == sessionScope.userlevel}"><c:import url="nav.jsp"><c:param name="cnclass"
                                                                                 value="active"/></c:import></c:if>
    <c:if test="${1 == sessionScope.userlevel}"><c:import url="nav1.jsp"><c:param name="cnclass"
                                                                                  value="active"/></c:import></c:if>
    <c:if test="${2 == sessionScope.userlevel}"><c:import url="nav2.jsp"><c:param name="cnclass"
                                                                                  value="active"/></c:import></c:if>

    <div id="page-wrapper">

        <div class="row">
            <div class="col-lg-12">
                <h1>发布公告 </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 默认主页</a></li>
                    <li class="active"><i class="fa fa-font"></i> 发布公告</li>
                </ol>
            </div>
        </div><!-- /.row -->

        <div class="row">
            <div class="col-lg-10 col-lg-offset-1">
                <div class="input-group">
                    <span class="input-group-addon">公告标题：</span>
                    <input type="text" class="form-control" aria-describedby="basic-addon1" id="news-title">
                </div>
                <p></p>
                <div id="summernote">Hello Summernote</div>
                <button class="btn btn-default btn-lg btn-block" id="news-submit">发布</button>
            </div>

        </div>


    </div><!-- /#page-wrapper -->

</div><!-- /#wrapper -->

<!-- JavaScript -->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/summernote.min.js"></script>
<script src="js/createnews.js"></script>

</body>
</html>