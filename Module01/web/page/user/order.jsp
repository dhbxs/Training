<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/19
  Time: 上午 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ include file="/base02.jsp" %>

<%
    request.getSession().removeAttribute("cartList");
%>
<html>
<head>
    <title>订单</title>
</head>
<body>
<div class="page-header" align="center">
    <h1>订单完成
        <small>
            <a href="https://dhbxs.club"> dhbxs.club </a>
        </small>
    </h1>
</div>
</body>
</html>
