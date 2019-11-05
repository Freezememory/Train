<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/22
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"    isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户登录</title>
</head>
<body>
<br>

${ msg }  </br>

<form action="/SSM/user/login2" method="post">
    <table>
        <tr>
            <td>用户名:</td>
            <td><input id="username" name="username" type="username"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
<form action="/SSM/user/regit"  method="post">
    <table>
        <tr>
            <td><input type = "submit"  value = "注册" ></td>
        </tr>
    </table>
</form>
</body>
</html>

