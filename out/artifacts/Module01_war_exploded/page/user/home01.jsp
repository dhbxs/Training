<%--
  Created by IntelliJ IDEA.
  User: 17235
  Date: 2020/6/17
  Time: 下午 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="club.dhbxs.bean.Repository" %>
<%@ page import="java.util.List" %>
<%@ include file="/base02.jsp" %>

<html>
<head>
    <title>灯火不休时的小铺</title>
</head>

<body>
<div class="page-header" align="center">
    <h1>灯火不休时的小铺
        <small>
            <a href="https://dhbxs.club"> dhbxs.club </a>
        </small>
    </h1>
</div>
<br>
<%
    List<Repository> rList = new ArrayList<Repository>();
    rList = (List<Repository>) session.getAttribute("r");
%>
<form method="post" action="${baseUrl}/Cart?action=addCart">
    <table class="table table-hover"
    ">

    <thead>
    <tr align="center" valign="center">
        <th align="center" valign="center">操作</th>
        <th align="center" valign="center">商品名称</th>
        <th align="center" valign="center">月销</th>
        <th align="center" valign="center">价格</th>
        <th align="center" valign="center">描述</th>
        <th align="center" valign="center">图片</th>
    </tr>
    </thead>

    <tbody>
    <%
        for (int i = 0; i < rList.size(); i++) {
    %>
    <tr>
        <td valign="middle" style="vertical-align: middle!important;"><input type="checkbox" name="cart" value="<%if (rList.get(i) != null)
					out.print(rList.get(i).getReId());%>">
        </td>
        <td valign="middle" style="vertical-align: middle!important;">
            <%
                if (rList.get(i) != null)
                    out.print(rList.get(i).getReName());
            %>
        </td>
        <td valign="middle" style="vertical-align: middle!important;">
            <%
                if (rList.get(i) != null)
                    out.print(rList.get(i).getReBuyNum());
            %>
        </td>
        <td valign="middle" style="vertical-align: middle!important;">
            <%
                if (rList.get(i) != null)
                    out.print(rList.get(i).getRePrice());
            %>
        </td>
        <td valign="middle" style="vertical-align: middle!important;">
            <%
                if (rList.get(i) != null)
                    out.print(rList.get(i).getReDescrip());
            %>
        </td>
        <td valign="middle" style="vertical-align: middle!important;">
            <%
                if (rList.get(i) != null) {
                    String url = rList.get(i).getImgUrl();
            %>
            <img height="100px" width="100px" src="<%=url%>"/>
            <%
                }
            %>

        </td>

    </tr>
    <%
        }
    %>
    </tbody>
    </table>
    <p align="right">
        <button class="btn btn-lg btn-primary btn-block" type="submit"
                style="width: fit-content; height: fit-content">加入购物车
        </button>
    </p>
    </div>
</form>
<br>
</body>
</html>
