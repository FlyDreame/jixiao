<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录入口-地方政府绩效考核系统</title>

    <link href="./libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/index/style.css"/>

</head>
<body>
<div class="home">
    <div class="container fase-in">
        <div class="row">
            <div class="col-sm-6">
                <a href="index.jsp" class="home-title">地方政府绩效考核系统</a>
            </div>
            <div class="col-sm-6 home-links">
                <a class="login" href="login.jsp">登录</a>
                <a class="signup" href="signup.jsp">注册</a>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-10 col-sm-offset-1 text-center">
                <h1>${msgtitle}</h1>
                <h2>${msg}</h2>
            </div>
        </div>
        <p class="nothing"></p>
    </div>
</div>
<div class="footer-con">
    <span class="footer">Copyright ©南航302班. All Rights Reserved.</span>
</div>
<script src="./libs/js/jquery.js"></script>
<script src="./libs/js/bootstrap.min.js"></script>
</body>
</html>
