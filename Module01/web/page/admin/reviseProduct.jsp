<%@ page import="club.dhbxs.bean.Repository" %>
<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/24
  Time: 下午 4:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base03.jsp" %>
<html>
<head>
    <title>修改信息</title>
</head>
<%
    Repository info = (Repository) request.getSession().getAttribute("revise");
%>
<body>
<div class="page-header" align="center">
    <h1>修改商品信息
        <small>
            <a href="https://dhbxs.club"> dhbxs.club </a>
        </small>
    </h1>
</div>
<br>
<div align="center">
    <form name="adminAdd" action="../../ReviseFromRepository?action=revise&&id=<%=info.getReId()%>" method="post"
          style="width: 70%">
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">商品名称</span>
            <input type="text" class="form-control" placeholder="<%=info.getReName()%>"
                   aria-describedby="basic-addon1" name="reName"/>
        </div>

        <div class="input-group">
            <span class="input-group-addon">单价：人民币</span>
            <input type="text" class="form-control" name="rePrice" placeholder="<%=info.getRePrice()%>"/>
            <span class="input-group-addon">元</span>
        </div>

        <div class="input-group">
            <span class="input-group-addon">数量</span>
            <input type="number" class="form-control" name="reNum" placeholder="<%=info.getReNum()%>"/>
            <span class="input-group-addon">件</span>
        </div>

        <div class="input-group">
            <span class="input-group-addon">描述</span>
            <input type="text" class="form-control" name="describe" placeholder="<%=info.getReDescrip()%>"/>
        </div>

        <div align="center" class="input-group">
            <span class="input-group-addon">图片地址</span>
            <input type="text" class="form-control" name="imgUrl" placeholder="<%=info.getImgUrl()%>"/>
            <span class="input-group-addon">url</span>
        </div>
        <br>
        <p align="right">
            <button class="btn btn-lg btn-primary btn-block" type="submit"
                    style="width: fit-content; height: fit-content">立即修改
            </button>
        </p>
    </form>
</div>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
