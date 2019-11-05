<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/20
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"    isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>线路查询</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        .divForm{
            position: absolute;/*绝对定位*/
            width: 300px;
            height: 200px;

            border: 1px solid #cccccc;
            text-align: center;/*(让div中的内容居中)*/
            top: 50%;
            left: 50%;
            margin-top: -200px;
            margin-left: -150px;
        }

    </style>
</head>
</head>
<body>



<script type="text/javascript">
    function getTrains()
    {
        if(document.getElementById("trainsId").value=='')
        {
            alert("车次不能为空");
            return false;
        }
        return true;
    }
</script>
<script type="text/javascript">
    function getTrainIm()
    {
        if(document.getElementById("name").value=='')
        {
            alert("站名不能为空");
            return false;
        }
        return true;
    }
</script>
<script type="text/javascript">
    function getTrainInformation()
    {
        if(document.getElementById("startName").value=='')
        {
            alert("起始站不能为空");
            return false;
        }
        if(document.getElementById("endName").value=='')
        {
            alert("到达站不能为空");
            return false;
        }
        return true;
    }
</script>

<div class="divForm">
<form action="/SSM/query/gettrains"  method="post">
    <table>
        <tr>
            <td>车次查询</td>
            <td><input id="trainsId" name="trainsId" type="text"></td>
        </tr>
        <tr>
            <td><input type="submit" value="查询"  onclick=" return  getTrains()"></td>
        </tr>
    </table>
</form>
<form action="/SSM/query/gettrainim" method="post">
    <table>
        <tr>
            <td>站点查询</td>
            <td><input id="name" name="name" type="name"></td>
        </tr>
        <tr>
            <td><input type="submit" value="查询" onclick="return  getTrainIm()"></td>
        </tr>
    </table>
</form>
<form action="/SSM/query/gettrainsid" method="post">
    <table>
        <tr>
            <td>起始站</td>
            <td><input id="startName" name="startName" type="name"></td>
        </tr>
        <tr>
            <td>终点站</td>
            <td><input id="endName" name="endName" type="name"></td>
        </tr>
        <tr>
            <td><input id="" type="submit" value="查询"  onclick="return getTrainInformation() "></td>
        </tr>
    </table>
</form>
</div>

</table>
</body>
</html>
