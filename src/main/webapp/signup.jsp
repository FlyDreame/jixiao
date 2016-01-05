<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>注册-地方政府绩效考核系统</title>

    <link href="./libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/signup/style.css"/>

</head>
<body>
<div class="home">
    <div class="container fase-in">
        <div class="row">
            <div class="col-sm-6">
                <a href="index.html" class="home-title">地方政府绩效考核系统</a>
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
            <div class="text-center login-title">系统注册</div>
            <form action="/signup.do" method="post">
                <div class="form-group">
                    <label for="exampleInputId">账号</label>
                    <input type="text" class="form-control" id="exampleInputId" placeholder="账号" name="username">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword">密码</label>
                    <input type="password" class="form-control" id="exampleInputPassword" placeholder="密码" name="password">
                </div>
                <div class="form-group">
                    <label for="InputPasswordAgain">确认密码</label>
                    <input type="password" class="form-control" id="InputPasswordAgain" placeholder="确认密码">
                </div>
                <div class="form-group">
                    <label for="InputLei">政府分类</label>
                    <select class="form-control" id="InputLei" name="departcategory">
                        <option value="1">党群团体类</option>
                        <option value="2">司法行政执法类</option>
                        <option value="3">综合管理类</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="InputBumen">政府部门</label>
                    <select class="form-control" id="InputBumen" name="department">
                        <option value="1">市人大办公室</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-block btn-success">注册</button>
            </form>
        </div>
    </div>
</div>
<div class="footer-con">
    <span class="footer">Copyright ©南航302班. All Rights Reserved.</span>
</div>
<script src="./libs/js/jquery.js"></script>
<script src="./libs/js/bootstrap.min.js"></script>
<script src="./js/signup.js"></script>
</body>
</html>