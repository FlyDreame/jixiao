<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>消息 - 地方政府绩效考核系统</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/message.css">
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <c:if test="${0 == sessionScope.userlevel}"><c:import url="nav.jsp"><c:param name="meclass"
                                                                                 value="active"/></c:import></c:if>
    <c:if test="${1 == sessionScope.userlevel}"><c:import url="nav1.jsp"><c:param name="meclass"
                                                                                  value="active"/></c:import></c:if>
    <c:if test="${2 == sessionScope.userlevel}"><c:import url="nav2.jsp"><c:param name="meclass"
                                                                                  value="active"/></c:import></c:if>


    <div id="page-wrapper">

        <div class="row">
            <div class="col-lg-12">
                <h1>消息 </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 默认主页</a></li>
                    <li class="active"><i class="fa fa-desktop"></i> 消息</li>
                </ol>
            </div>
        </div><!-- /.row -->

        <div class="row">
            <div class="col-lg-10 col-lg-offset-1">
                <c:forEach items="${requestScope.meslist}" var="me">
                    <div class="message-all">
                        <a class="col-sm-11 list-group-item" href="/user/address_book.do?messid=${me.messid}">
                            <div class="message-summary">${me.content}</div>
                            <span class="mews-from"> <i class="fa fa-user"></i>${me.fromname}</span>
                            <span class="time"><i class="fa fa-clock-o"></i> ${me.date} ${me.time}</span>
                        </a>
                        <c:if test="${me.check == 0}">
                            <span class="label label-danger">New</span>
                        </c:if>
                    </div>
                </c:forEach>

            </div>
        </div>


    </div><!-- /#page-wrapper -->

</div><!-- /#wrapper -->

<!-- JavaScript -->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/bootstrap.js"></script>

</body>
</html>