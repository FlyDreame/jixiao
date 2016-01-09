<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>通讯录 - 绩效考核后台管理</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <c:if test="${0 == sessionScope.userlevel}"><c:import url="nav.jsp"><c:param name="abclass"
                                                                                 value="active"/></c:import></c:if>
    <c:if test="${1 == sessionScope.userlevel}"><c:import url="nav1.jsp"><c:param name="abclass"
                                                                                  value="active"/></c:import></c:if>
    <c:if test="${2 == sessionScope.userlevel}"><c:import url="nav2.jsp"><c:param name="abclass"
                                                                                  value="active"/></c:import></c:if>


    <div id="page-wrapper">

        <div class="row">
            <div class="col-lg-12">
                <h1>通讯录 </h1>
                <ol class="breadcrumb">
                    <li><a href="index.jsp"><i class="fa fa-dashboard"></i> 默认主页</a></li>
                    <li class="active"><i class="fa fa-table"></i> 通讯录</li>
                </ol>
            </div>
        </div><!-- /.row -->

        <div class="row">
            <div class="col-lg-3">
                <div class="panel panel-primary">
                    <div class="panel-heading">通讯录名单</div>
                    <div class="panel-body">
                        <ul class="nav nav-pills nav-stacked">
                            <c:forEach items="${requestScope.msguser}" var="msg">
                                <li role="presentation" class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button"
                                       aria-haspopup="true" aria-expanded="false">
                                            ${msg.name}<span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu">
                                        <c:forEach items="${msg.bu}" var="oneuser">
                                            <li role="presentation" class="msguser"><a href="javascript:void(0);"
                                                                                       userid="${oneuser.id}">${oneuser.name}</a>
                                            </li>
                                        </c:forEach>
                                    </ul>
                                </li>
                            </c:forEach>
                            <li role="presentation" class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button"
                                   aria-haspopup="true" aria-expanded="false">
                                    xxx管理部门 <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    ...
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-9">
                <div class="panel panel-primary">
                    <c:if test="${empty mess}">
                        <div class="panel-heading" id="kuang" userid="">对话框</div>
                    </c:if>
                    <c:if test="${not empty mess}">
                        <div class="panel-heading" id="kuang" userid="${mess.fromid}">${mess.fromname}</div>
                    </c:if>
                    <div class="panel-body">
                        <c:if test="${not empty mess}">
                            <div class="ab-mes" id="message-main">
                                <div class="row">
                                    <div class="col-lg-10">
                                        <div class="alert alert-info" role="alert">${mess.content}</div>
                                    </div>
                                </div>
                            </div>
                        </c:if>
                        <div class="ab-mes-kuang">
                            <textarea class="form-control" rows="3" id="response-content"></textarea>
                            <p></p>
                            <button class="btn btn-primary btn-lg btn-block" id="message-submit">发送</button>

                        </div>

                    </div>
                </div>
            </div>
        </div>

    </div><!-- /#page-wrapper -->

</div><!-- /#wrapper -->

<!-- JavaScript -->
<script src="js/jquery-1.10.2.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/address-book.js"></script>


</body>
</html>