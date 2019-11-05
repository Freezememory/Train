<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/29
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="utf-8"    isELIgnored="false" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <!-- 引入BootStrap的CSS -->
    <link rel="stylesheet" type="text/css" href="WEB-INF\bootstrap-3.3.7-dist\css\bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="WEB-INF\bootstrap-3.3.7-dist\css\bootstrap-theme.min.css" />
    <!-- 引入jQuery -->
    <script type="text/javascript" src="static/jQuery/jquery-3.4.0.min.js"></script>

    <script type="text/javascript" src="webapp/static/bootstrap-3.3.7-dist\js\bootstrap.min.js" ></script>

    <title>Title</title>


</head>
<body>
<!-- 通过站点显示表,展示数据 -->
<div>
    <style>
        table
        {   border-collapse:   separate;   border-spacing:   10px;   }
    </style>
<table   class = "table"   style="background:skyblue "   align="center"  border="0" cellspacing="0" cellpadding="0"  width="70%" height="100" >
    <tr>
        <th>车次信息</th>
        <th>起始站/时间</th>
        <th>运行时长</th>
        <th>中间站</th>
        <th>到达站/时间</th>
        <th>坐席</th>
        <th>参考标价</th>
    </tr>

    <!-- 遍历通过车次查询出的数据 -->
    <x:forEach items="${information}" var="information">
    <tr>
        <td>
            <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${information.trainsId}">${information.trainsId }</a>
        </td>
        <td>${information.arrivalTime }</td>
        <td>   </td>
        <td>${information.drivingTime }</td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td>------------------------</td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td> 经停站</td>
        <td>  ${information.startName }  </td>
        <td> </td>
        <td> ${information.endName }</td>
        <td> </td>
        <td> </td>
    </tr>
    </x:forEach>

    <!-- 遍历通过一个车站查询出的数据 -->
    <x:forEach items="${trainim}" var="trainim">
    <tr>
        <td>
            <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${trainim.trainsId}">${trainim.trainsId }</a>
        </td>
        <td>${trainim.arrivalTime }</td>
        <td>   </td>
        <td>   </td>
        <td>${trainim.drivingTime }</td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td>------------------------</td>
        <td>  ${trainim.midName} </td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td> 经停站</td>
        <td>  ${trainim.startName }  </td>
        <td> </td>
        <td>   </td>
        <td> ${trainim.endName }</td>
        <td> </td>
        <td> </td>
    </tr>
    </x:forEach>

    <!-- 遍历通过两个站点查询出的直达数据 -->
    <x:forEach items="${trainsid}" var="trainsid">
    <tr>
        <td>
            <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${trainsid.trainsId}">${trainsid.trainsId }</a>
        </td>
        <td>${trainsid.arrivalTime }</td>
        <td> ${trainsid.hou} 时 ${trainsid.mi} 分</td>
        <td>${trainsid.drivingTime }</td>
        <td> 硬座： ${trainsid.hardSeatFare}</td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td>------------------------</td>
        <td></td>
        <td>  硬卧： ${trainsid.hardSleeperFare}</td>
        <td></td>
    </tr>
    <tr>
        <td> 经停站</td>
        <td>  ${trainsid.startName }  </td>
        <td> </td>
        <td> ${trainsid.endName }</td>
        <td> </td>
        <td> </td>
    </tr>
    </x:forEach>
</div>


    <!-- 换乘Table -->
        <table   style=" background:lightgreen" border="0"   align="center" cellspacing="0" cellpadding="0"width="70%"height="100">
            <tr>
                <th>起始站</th>
                <th>首乘线路名称/时间</th>
                <th>换乘站</th>
                <th>换乘线路/时间</th>
                <th>到达站</th>
            </tr>

            <x:forEach items="${trainsTranser}" var="trainsTranser">

            <tr>
                <td>  总历时： ${trainsTranser.hou} 时 ${trainsTranser.mi} 分          </td>
                <td>
                    <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${trainsTranser.firstTrainsId}">${trainsTranser.firstTrainsId }</a>
                </td>
                <td>   ${trainsTranser.midHou} 时 ${trainsTranser.midMi} 分        </td>
                <td>
                    <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${trainsTranser.secondTrainsId}">${trainsTranser.secondTrainsId }</a>
                </td>
                <td>             </td>
            </tr>
            <tr>
                <td>${trainsTranser.startName}</td>
                <td>---------------------</td>
                <td>${trainsTranser.midName}</td>
                <td>----------------------<td>
                <td>${trainsTranser.endName}</td>
            </tr>
            <tr>
                <td>                   </td>
                <td> ${trainsTranser.drivingTime}  -- ${trainsTranser.midArrivalTime} </td>
                <td>                   </td>
                <td> ${trainsTranser.midDrivingTime} -- ${trainsTranser.arrivalTime} </td>
                <td>                   </td>
            </tr>
            </x:forEach>
</body>
</html>
