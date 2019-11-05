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

    <!-- 引入BootStrap的CSS -->
    <link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" />
    <!-- 引入jQuery -->
    <script type="text/javascript" src="static/jQuery/jquery-3.4.0.min.js"></script>
    <script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js" ></script>
    <title>用户登录</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Document</title>
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
            .bj {
                width: 100%;
                height: 100%;
                background-image: url("static/img/13.jpg");
                background-repeat: no-repeat;
                background-size: 100% 100%;
            }
            body{
                background-image: url("static/img/13.jpg");
                background-repeat:no-repeat;
                background-size:100% 100%;
                background-attachment: fixed;
            }
        </style>
</head>


<body>
<br>  ${ msg }  </br>

<script type="text/javascript">
   /* $(document.body).ready(function () {
        //首次获取验证码
        $("#imgVerify").attr("src","/user/getVerify?"+Math.random());
    });
    //获取验证码
    function getVerify(){
        var src1=document.getElementById('imgVerify')
        src1.src = "/user/getVerify?"+Math.random();
    }
    //校验验证码
    function checkSum(){
        var html1=document.getElementById('loginingForm');
        var inputStr = $("#checks").val();
        if(inputStr!=null && inputStr!="" && inputStr!="验证码:"){
            inputStr = inputStr.toUpperCase();//将输入的字母全部转换成大写
            html1.action="/user/login?inputStr="+inputStr;//提交表单
        }else{
            alert("验证码不能为空!")
        }
    }*/
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

<div class="bj">

<div class="divForm">
    <form action="/SSM/user/login2" method="post">

        <p>
            欢迎登录火车线路查询系统
        </p>
        <p>
            用户名：<input type="text" id = "username" name="username"/>
        </p>
               <p>
                   密 &nbsp;&nbsp;码：<input id = "password" type="password" name="password"/>
               </p>
        <input type="submit" value="登录" onclick= " return myfunction()">
            <%--<div>
            <div class="row cl">
                <div class="formControls col-xs-8 col-xs-offset-3">
                    <input id="checks" class="input-text size-L" type="text" value="验证码:" style="width:150px;" />
                    <img id="imgVerify" src="" alt="点击更换验证码" /><a href="" rel="nofollow">看不清，换一张</a>
                </div>
            </div>
            </div>--%>
    </form>
    <form action="/SSM/user/regit"  method="post">
                <td><input type = "submit"  value = "注册" ></td>
    </form>
</div>
</div>
</body>
</html>

