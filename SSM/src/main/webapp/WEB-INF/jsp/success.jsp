<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/22
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"    isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录成功</title>
</head>
<body>
<br>
       ${ msg }  </br>
       <h1  >
           注册成功
       </h1>
<a href="${pageContext.request.contextPath }/user/login">去登录</a>
</body>
</html>
