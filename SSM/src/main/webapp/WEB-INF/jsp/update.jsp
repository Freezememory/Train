<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/27
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"    isELIgnored="false"%>
<html>
<head>
    <title>编辑/添加</title>
</head>
<body>
    <form action="updatetraininformation?id=${trains.id}" method="post">
        <input type="hidden" name="id" value="${trains.id}"><br/>
        车次：<input type="text" name="trainsId" value="${trains.trainsId}"><br/>
        站点排序:<input type="text" name="siteId" value="${trains.siteId}"><br/>
        站名:<input type="text" name="standName" value="${trains.standName}"><br/>
        到达时间:<input type="text" name="arrivalTime" value="${trains.arrivalTime}"><br/>
        发车时间:<input type="text" name="drivingTime" value="${trains.drivingTime}"><br/>
        开车时间:<input type="text" name="leftTime" value="${trains.leftTime}"><br/>
        里程:<input type="text" name="mileage" value="${trains.mileage}"><br/>
                 <input type="submit" value="提交">
    </form>



    <form action="/SSM/query/inserttraininformation" method="post">
        <table >
            <tr>
                <td>车次</td>
                <td><input id="trainsId" name="trainsId" type="text"></td>
            </tr>
            <tr>
                <td>站点排序</td>
                <td><input id="siteId" name="siteId" type="text"></td>
            </tr>
            <tr>
                <td>站点</td>
                <td><input id="standName" name="standName" type="text"></td>
            </tr>
            <tr>
                <td>到达时间</td>
                <td><input id="arrivalTime" name="arrivalTime" type="text"></td>
            </tr>
            <tr>
                <td>发车时间</td>
                <td><input id="drivingTime" name="drivingTime" type="text"></td>
            </tr>
            <tr>
                <td>走行时间</td>
                <td><input id="leftTime" name="leftTime" type="text"></td>
            </tr>
            <tr>
                <td>里程</td>
                <td><input id="mileage" name="mileage" type="text"></td>
            </tr>
            <tr>
                <td><input type="submit" value="添加"></td>
            </tr>
        </table>
    </form>




</body>
</html>
