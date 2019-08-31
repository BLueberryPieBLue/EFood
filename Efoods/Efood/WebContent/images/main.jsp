<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>菜单列表</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript"src="scripts/jquery-1.7.2.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
		<div id="top">
			<div id="topfirst">
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
<div style="margin:0 auto;width:1000px" >
		
		<h1 align="center">欢迎<font color="blue">${sessionScope.loginUser.username}</font>登录  <a href='/Efood/LogoutServlet'>退出</a></h1>
		<h1 align="center">菜单列表</h1>
		<form action="" method="post" align="center" style="margin:0 auto;width:700px">
			<table border="1px" align="center" width="70%"cellspacing="0px">
				<tr>
					<th>ID</th>
					<th>菜品名称</th>
					<th>菜品单价</th>
					<th>加入购物车</th>
				</tr>
			<c:if test="${!empty dishes}">
		    	<c:forEach items="${dishes}" var="dishes">
		    		<tr>
		    			<td>${dishes.id}</td>
		    			<td>${dishes.dishname}</td>
		    			<td>${dishes.price}</td>
		    			<td><a href='/Efood/PurchaseServlet?id=${dishes.id}'>点击购买</a></td>
		    		</tr>
		    	</c:forEach>
		    </c:if>
			</table>
				<!-- <input type="submit" value="查看订单"/> -->
				<a href='/Efood/CartServlet'>查看订单</a>
			</form>
</div>
</body>
</html>