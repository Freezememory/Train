<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/29
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"    isELIgnored="false" %>
<html>
<head>
    <title>列车时刻表</title>
</head>
<body>

<!-- 通过车次显示表,展示数据 -->
<table border="2" cellspacing="0" cellpadding="0"width="100%"height="100">

    <tr>
        <th>站点排序</th>
        <th>站名</th>
        <th>到达时间</th>
        <th>发车时间</th>
        <th>操作</th>
        <button type="button">
            <!-- 增加信息 -->
            <a href="skip">添加</a>
        </button>
    </tr>
    <!-- 遍历通过车次查询出的数据 -->
    <x:forEach items="${information}" var="information">
    <tr>
        <td>${information.siteId }</td>
        <td>${information.standName }</td>
        <td>${information.arrivalTime }</td>
        <td>${information.drivingTime }</td>
        <td>
            <button type="button">
                <!-- 删除当前项 -->
                <a href="deletetraininformation?id=${information.id }">删除</a>
            </button>
            <button type="button">
                <!-- 修改当前项 -->
                <a href="querybyid?id=${information.id}">修改</a>
            </button>
        </td>
    </tr>
    </x:forEach>
</body>
</html>
