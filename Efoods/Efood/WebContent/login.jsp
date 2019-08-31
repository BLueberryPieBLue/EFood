<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
	<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<style type="text/css">
		span#login_span{
			color:red;
		}
	</style>
	<script type="text/javascript">
	function clearLoginMsg(){
		var spaEle=document.getElementById("login_span");
		spaEle.innerHTML="";
	}
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
			<h1 align="center">欢迎登录</h1><br/><br/>
			<form action="login" method="post"align="center">
				用户名称 :<input type="text" name="username" onfocus="clearLoginMsg();"/>
				<span id ="login_span">${requestScope.login_msg}</span>
				<br/><br/><br/>
				用户密码 :<input type="password" name="password"/>
				<br/><br/><br/>
				<input type="submit" value="Login"/>
			
			</form>
		</div>
	</div>
	</body>

</html>
