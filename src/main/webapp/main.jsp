<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页-地方政府绩效考核系统</title>

    <link href="./libs/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./css/main/style.css"/>

</head>
<body>
<div class="home">
    <div class="container fase-in">
        <div class="row">
            <div class="col-sm-6">
                <a href="" class="home-title">地方政府绩效考核系统</a>
            </div>
            <div class="col-sm-6 home-links">
                <div class="btn-group">
                    <button type="button" class="btn btn-info  dropdown-toggle btn-user" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                       ${user.username}<span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu">
                        <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>  个人资料</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-send" aria-hidden="true"></span>  消息</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>  设置</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="/logout.do"><span class="glyphicon glyphicon-log-out" aria-hidden="true"></span>  登出</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container home-main">
    <div class="row top_center">
        <div class="col-sm-8">
            <div id="carousel-example-generic" class=" carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="./img/main/gundong.png" alt="...">
                        <div class="carousel-caption">
                            ...
                        </div>
                    </div>
                    <div class="item">
                        <img src="./img/main/gundong1.png" alt="...">
                        <div class="carousel-caption">
                            ...
                        </div>
                    </div>
                    <div class="item">
                        <img src="./img/main/gundong2.png" alt="...">
                        <div class="carousel-caption">
                            ...
                        </div>
                    </div>
                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="col-sm-4 message-tab">
            <div>

                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">置顶消息</a></li>
                    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">最新动态</a></li>
                    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">最新通知</a></li>
                    <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">还未处理</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="home">置顶消息</div>
                    <div role="tabpanel" class="tab-pane" id="profile">最新动态</div>
                    <div role="tabpanel" class="tab-pane" id="messages">最新通知</div>
                    <div role="tabpanel" class="tab-pane" id="settings">还未处理</div>
                </div>

            </div>
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