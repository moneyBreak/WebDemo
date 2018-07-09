<%--
  Created by IntelliJ IDEA.
  User: money
  Date: 2018/7/5
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <style>
        #box{
            width:300px;
            height: 260px;
            position: fixed;
            top:50%;
            left: 50%;
            margin-left: -150px;
            margin-top: -130px;
        }
        .form-box{
            padding-top:0px;
        }
    </style>

    <script src="../js/jquery.min.js"></script>
    <script src="../js/particle.js"></script>
</head>
<body>
<canvas class="particle"></canvas>
<div class="panel panel-default" id="box">
    <div class="panel-body form-box">
        <h3>欢迎登陆！</h3>
        <form role="form" action="login" method="post">
            <div class="form-group">
                <input type="text" id="username" name="username" class="form-control"placeholder="账号:" >
            </div>
            <div class="form-group">
                <input type="password" id="pass" name="pass" class="form-control" placeholder="密码:">
            </div>
            <div class="form-group">
                <div class="col-sm-6" style="padding-left: 0px;">
                    <input type="text"  name="check" class="form-control" placeholder="验证码:">
                </div>
                <div class="col-sm-6"><img src="authimage"  class="img-responsive"></div>
            </div>
            <div class="form-group" >
                <input type="submit"  class="form-control btn btn-info  " value="登录" >
            </div>
            <div id="message"></div>
        </form>
    </div>
</div>
</body>
</html>
