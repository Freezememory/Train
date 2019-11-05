<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"  %>
<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/4/23
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table   style=" background:lightgreen" border="0" cellspacing="0" cellpadding="0"width="100%"height="100">
    <tr>
        <th>起始站</th>
        <th>首乘线路名称/时间</th>
        <th>换乘站</th>
        <th>换乘线路/时间</th>
        <th>到达站</th>
    </tr>

    <x:forEach items="${trainsTranser}" var="trainsTranser">

    <tr>
        <td>            </td>
        <td>
            <a href="${pageContext.request.contextPath }/query/gettrainsinformation?trainsId=${trainsTranser.firstTrainsId}">${trainsTranser.firstTrainsId }</a>
        </td>
        <td>            </td>
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
        <td> ${trainsTranser.arrivalTime}  </td>
        <td>                   </td>
        <td> ${trainsTranser.drivingTime} </td>
        <td>                   </td>
    </tr>
    </x:forEach>
</body>
</html>
