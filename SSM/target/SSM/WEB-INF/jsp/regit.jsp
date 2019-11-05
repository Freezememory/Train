<%--
  Created by IntelliJ IDEA.
  User: 王立军
  Date: 2019/3/22
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"    isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册</title>
</head>
<body>
<script type="text/javascript">
    function myfunction()
    {
        if(document.getElementById("username").value=='')
        {
            alert("用户名不能为空");
            return false;
        }
        if(document.getElementById("password").value=='')
        {
            alert("密码不能为空");
            return false;
        }
        return true;
    }
</script>


<form action="/SSM/user/regit2" method="post">
    <table >
        <tr>
            <td>用户名</td>
            <td><input id="username" name="username" type="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input id="password" name="password" type="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"  onclick="return myfunction()"></td>
        </tr>
    </table>
</form>
</body>
</html>
