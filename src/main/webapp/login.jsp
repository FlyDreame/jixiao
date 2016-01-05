<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录-地方政府绩效考核系统</title>

    <link href="./libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/login/style.css"/>

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
    </div>
</div>
<div class="container home-main">
    <div class="row">
        <div class="col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <div class="text-center login-title">系统登录</div>
            <form action="/login.do" method="post">
                <div class="form-group">
                    <label for="exampleInputId">账号</label>
                    <input type="text" class="form-control" id="exampleInputId" placeholder="账号" name="username">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="密码" name="password">
                </div>
                <button type="submit" class="btn btn-block btn-success">登录</button>
            </form>
        </div>
    </div>
</div>
<div class="footer-con">
    <span class="footer">Copyright ©南航302班. All Rights Reserved.</span>
</div>
<script src="./libs/js/jquery.js"></script>
<script src="./libs/js/bootstrap.min.js"></script>
</body>
</html>