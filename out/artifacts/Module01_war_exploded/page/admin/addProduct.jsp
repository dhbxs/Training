<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/19
  Time: 下午 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base03.jsp" %>
<html>
<head>
    <title>添加商品</title>
</head>
<body>
<div class="page-header" align="center">
    <h1>添加商品
        <small>
            <a href="https://dhbxs.club"> dhbxs.club </a>
        </small>
    </h1>
</div>
<br>
<form name="adminAdd" action="../../AddIntoRepository?action=addInto" method="post">
    <div class="input-group">
        <span class="input-group-addon" id="basic-addon1">商品名称</span>
        <input type="text" class="form-control" placeholder="Product Name" aria-describedby="basic-addon1"
               name="reName"/>
    </div>

    <div class="input-group">
        <span class="input-group-addon">单价：人民币</span>
        <input type="text" class="form-control" name="rePrice"/>
        <span class="input-group-addon">元</span>
    </div>

    <div class="input-group">
        <span class="input-group-addon">数量</span>
        <input type="number" class="form-control" name="reNum"/>
        <span class="input-group-addon">件</span>
    </div>

    <div class="input-group">
        <span class="input-group-addon">描述</span>
        <input type="text" class="form-control" name="describe"/>
    </div>

    <div align="center" class="input-group">
        <span class="input-group-addon">图片地址</span>
        <input type="text" class="form-control" name="imgUrl"/>
        <span class="input-group-addon">url</span>
    </div>
    <br>
    <p align="right">
        <button class="btn btn-lg btn-primary btn-block" type="submit"
                style="width: fit-content; height: fit-content">立即添加
        </button>
    </p>
</form>
</body>
</html>
