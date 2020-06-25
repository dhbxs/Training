<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/18
  Time: 下午 4:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" %>
<%@ include file="/base02.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="club.dhbxs.bean.User" %>
<%@ page import="java.util.List" %>
<%@ page import="club.dhbxs.bean.Repository" %>
<%@ page import="java.math.BigDecimal" %>

<html>
<head>
    <title>购物车</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    List<Repository> reList = (List<Repository>) session.getAttribute("cartList");
    BigDecimal total = BigDecimal.valueOf(0);
    if (reList == null) {
        response.sendRedirect("home01.jsp");
    } else {
        for (Repository repository : reList) {
            total = total.add(repository.getRePrice());
        }
    }
%>
<div class="page-header" align="center">
    <h1><%=user.getUserName()%>的购物车
        <small>
            <a href="https://dhbxs.club"> dhbxs.club </a>
        </small>
    </h1>
</div>
<div align="center">
    <form action="${baseUrl}/Cart?action=buyCart" method="post" style="width: 80%">
        <table class="table table-hover">
            <thead>
            <tr>
                <td>名称</td>
                <td>销量</td>
                <td>库存</td>
                <td>价格</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${cartList}" var="repositories">
                <tr>
                    <td style="vertical-align: middle!important;">${repositories.reName}</td>
                    <td style="vertical-align: middle!important;">${repositories.reBuyNum}</td>
                    <td style="vertical-align: middle!important;">${repositories.reNum}</td>
                    <td style="vertical-align: middle!important;">${repositories.rePrice}</td>
                    <td style="vertical-align: middle!important;"><a class="btn btn-default"
                                                                     href="../../DeleteFromCart?productId=${repositories.reId}"
                                                                     role="button">删除</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="2" style="vertical-align: middle!important;">
                    <div class="input-group">
                        <span class="input-group-addon" id="sizing-addon2">收货地址</span>
                        <input type="text" name="address" class="form-control" placeholder="Address"
                               style="width: 200%"/>
                    </div>
                </td>
                <td style="vertical-align: middle!important;">
                    <span class="label label-danger">未付款</span>
                </td>
                <td valign="center" style="vertical-align: middle!important;">
                    <span class="label label-warning">总价:<%=total%></span>
                </td>
                <td>
                    &nbsp;&nbsp;&nbsp;
                </td>
            </tr>
            <tr>
                <td colspan="4" style="vertical-align: middle!important;">
                    &nbsp;&nbsp;&nbsp;
                </td>
                <td style="vertical-align: middle!important;">
                    <button class="btn btn-lg btn-primary btn-block" type="submit"
                            style="width: fit-content; height: fit-content">立即下单
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
