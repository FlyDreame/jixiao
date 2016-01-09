<%--
  Created by IntelliJ IDEA.
  User: me
  Date: 2016/1/8
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">绩效考核后台管理</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <li class="${param.inclass}"><a href="/user/index.do"><i class="fa fa-user"></i> 个人资料</a></li>
            <li class="${param.peclass}"><a href="performance.html"><i class="fa fa-bar-chart-o"></i> 绩效查看</a></li>
            <li class="${param.adclass}"><a href="/user/address_book.do"><i class="fa fa-table"></i> 通讯录</a></li>
            <li class="${param.taclass}"><a href="task.html"><i class="fa fa-dashboard"></i> 绩效任务</a></li>
            <li class="${param.neclass}"><a href="/user/somenews.do"><i class="fa fa-font"></i> 公告</a></li>
            <li class="${param.meclass}"><a href="/user/view_mess.do"><i class="fa fa-desktop"></i> 消息</a></li>
        </ul>

        <ul class="nav navbar-nav navbar-right navbar-user">
            <li class="dropdown user-dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                        class="fa fa-user"></i> ${sessionScope.departname} <b
                        class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#"><i class="fa fa-user"></i> 个人资料</a></li>
                    <li><a href="#"><i class="fa fa-desktop"></i> 返回前台</a></li>
                    <li class="divider"></li>
                    <li><a href="/logout.do"><i class="fa fa-power-off"></i> 登出</a></li>
                </ul>
            </li>
        </ul>
    </div><!-- /.navbar-collapse -->
</nav>
