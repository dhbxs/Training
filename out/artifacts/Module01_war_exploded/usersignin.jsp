<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/18
  Time: 上午 7:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/base01.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>注册</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container" style="width: 300px; height: 500px" align="center">
    <form class="form-signin" method="post" action="UserSignIn">
        <%--@declare id="inputemail"--%><h2 class="form-signin-heading">请注册</h2>
        <label for="inputUserName" class="sr-only">用户名</label>
        <input type="text" id="inputUserName" name="inputUserName" class="form-control" placeholder="用户名" required
               autofocus>
        <br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="密码"
               required>
        <br>
        <label for="inputPosition" class="sr-only">Password</label>
        <input type="text" id="inputPosition" name="inputPosition" class="form-control" placeholder="用户所在地"
               required>
        <br>
        <label for="inputEmail" class="sr-only">Password</label>
        <input type="email" id="inputEmail" name="inputEmail" class="form-control" placeholder="邮箱地址"
               required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
        <br>
    </form>
</div> <!-- /container -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
