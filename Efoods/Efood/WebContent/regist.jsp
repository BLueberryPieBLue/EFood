<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
<style>
span#regist_span, span#pass_span, span#pass1_span {
	color: red;
}
</style>
<script type="text/javascript">
	$(function() {
		usernameFlage = false;
		passwordFlag = false;
		$("#username").blur(function() {
			username = $("#username").val();

			$.ajax({
				url : "CheckUsernameServlet",
				type : "post",
				data : "username=" + username,
				success : function(data) {
					if (data == 1) {
						$("#regist_span").html("用户名可以使用");
						usernameFlage = true;
					} else if (data == 2) {
						$("#regist_span").html("用户名不可以为空");
					} else {
						$("#regist_span").html("用户名已存在");
					}
				},
			});
		})
		$("#password").blur(function() {
			password = $("#password").val();
			if (password == "") {
				$("#pass1_span").html("密码不可以为空");
			} 
		})
		$("#repassword").blur(function() {
			password = $("#password").val();
			repassword = $("#repassword").val();
			if (password == "" && repassword == "") {
				$("#pass_span").html("密码不可以为空");
			} else if (password == repassword) {
				$("#pass_span").html("密码一致");
				passwordFlag = true;
			} else if (password != repassword) {
				$("#pass_span").html("密码不一致");
			}
		})
		$("form").submit(function() {
			return usernameFlage && passwordFlag;
		})
	});
</script>
</head>

<body>
	<div>
		<div id="top">
			<div id="topfirst">
				<ul class="ull">
					<li><a href="login.jsp">登录</a></li>
					<li class="line">|</li>
					<li><a href="regist.jsp">注册</a></li>
				</ul>
				<ul style="position: relative; left: 160px">
				<li><a href="home.jsp">Home</a></li>
					<li class="line">|</li>
					<li><a href="main">我要订餐</a></li>
					<li class="line">|</li>
					<li><a href="cart">我的订餐</a></li>
					<li class="line">|</li>
					<li><a href="">我的二维码</a></li>
					<li class="line">|</li>
					<li><a href="">智能取餐柜查询</a></li>
					<li class="line">|</li>
					<li><a href="main">窗口位置查询</a></li>
					<li class="line">|</li>
					<li><a href="">商家中心</a></li>
					<li class="line">|</li>
					<li><a href="second.jsp">问题反馈</a></li>
				</ul>
			</div>
		</div>
		<div style="position: absolute; top: 100px; left: 300px; font-size: 40px;">E+食堂</div>
		<div class="form1">
			<h1 align="center">欢迎注册</h1>
			<form action="regist" method="post" align="center">
				用户名称:<input type="text" name="username" id="username" /><span id="regist_span">${regist_msg}</span> <br> <br> 
				用户密码:<input type="password" id="password" name="password" /> <span id="pass1_span"></span> <br><br> <br> 
				确认密码:<input type="password" id="repassword" name="repassword" /><span id="pass_span"></span> <br><br> 
				<input type="submit" value="注册">
			</form>
		</div>
	</div>
</body>
</html>