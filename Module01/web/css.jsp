<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/18
  Time: 上午 9:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String baseUrl = request.getContextPath();
    pageContext.setAttribute("baseUrl", baseUrl);
%>
<link href="${baseUrl}/css/bootstrap.min.css" rel="stylesheet">
<script src="${baseUrl}/js/jquery-3.4.1.min.js"></script>
<script src="${baseUrl}/js/bootstrap.min.js"></script>
