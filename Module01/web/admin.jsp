<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/18
  Time: 下午 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/base01.jsp" %>
<%@include file="/css.jsp" %>
<html>
<head>
    <title>后台登陆</title>
</head>
<body>
<div class="container" style="width: 300px; height: 500px" align="center">
    <form class="form-signin" method="post" action="UserSignIn?action=verifyAdmin">
        <h2 class="form-signin-heading">登录后台</h2>
        <label for="inputUserName" class="sr-only">管理员</label>
        <input type="text" id="inputUserName" name="inputUserName" class="form-control" placeholder="用户名" required
               autofocus>
        <br>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="inputPassword" class="form-control" placeholder="密码"
               required>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        <br>
    </form>

</div> <!-- /container -->
</body>
</html>
