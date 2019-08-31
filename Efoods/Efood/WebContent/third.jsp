<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>
	关于我们
	</title>
	<link rel="stylesheet" type="text/css" href="css/style2.css">
</head>
<body>
<div>
	<div id="er">
		<img src="images/e.jpg">
		<br>
	<div class="er1">	 支持扫码支付哦<br/><img src="images/e1.gif"><br/></div> </div>
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
<div id="first">
	<div class="f1">
		<h1>订单详情</h1> 
	<!-- 	<img src="images/image.jpg"> -->
	</div>

<div id="second">
	<div class="s1">
		<p>宋**</p>
		<p>
			山东省淄博市山东理工大学西校区三餐
		</p>
	</div>
</div>
<div id="three">
	<form>
	<br/><br/>
	最迟到店:<input type="text" name="id" placeholder="13:00">
	<br/><br/>
	准点送达:<input type="text" list="ad" placeholder="预计几点送达" /><br/><br/>
	最迟送达:<input type="text" name="id"><br/>
     <br/>
	 <br/>
	<datalist id="ad">
	   <option>00:00</option>
       <option>01:00</option>
       <option>02:00</option>
    </datalist>
    <p>感谢您对E+食堂的支持</p>
      <br/>
	 <br/>
	 <h2>请确认订单</h2>
</form>
</div>
<div id="four">
	<div id="f2">一佳小菜>>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="main">再来一单</a>
</div><br/> <hr/>
		<table border="1px" align="center" width="70%"cellspacing="0px">
				<tr>
					<th>ID</th>
					<th>菜品名称</th>
					<th>菜品单价</th>
				</tr>
			<c:if test="${!empty cart}">
		    	<c:forEach items="${cart}" var="cart">
		    		<tr>
		    			<td>${cart.id}</td>
		    			<td>${cart.dishname}</td>
		    			<td>${cart.price}</td>
		    		</tr>
		    	</c:forEach>
		    </c:if>
		    </table>
<div class="f2_1"><div class="f2_10"><img src="images/image20.jpg"></div><div class="f2_11">X1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$21</div></div>
<hr/>
<div class="f2_1"><div class="f2_10"><img src="images/image21.jpg"></div><div class="f2_11">X1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$24</div></div>
<hr/>
<div class="f2_1"><div class="f2_10"><img src="images/image22.jpg"></div><div class="f2_11">X1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$34</div></div>
<hr/>
<div class="f2_1"><div class="f2_10"><img src="images/image23.jpg"></div><div class="f2_11">X4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;$235</div></div>
<hr/>
<div class="f2_1"><div class="f2_10">餐盒</div><div class="f2_12">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; $2</div></div><hr/>
<div class="f2_1"><div class="f2_10">配送费</div><div class="f2_12">&nbsp;&nbsp;&nbsp;$2</div></div><hr/>
<div class="f2_1"><div class="f2_10">在线支付立减优惠</div><div class="f2_12">-$12</div></div><hr/>
<div class="f2_1"><div class="f2_10">分享红包优惠优惠</div><div class="f2_12">-$12</div></div><hr/><hr/>
<div class="f2_1"><div class="f2_10">联系商家</div><div class="f2_12">&nbsp;&nbsp;&nbsp;实付： 110.8</div>
<hr/>
</div>
</div>
<div style="position: relative;top:90px;left: 36px; background-color: #a2a2a2;font-size: 12px; text-align: center;width:980px">
	<br>
	<p>
山东理工大学&nbsp;|&nbsp;软件1705&nbsp;|&nbsp;王青&nbsp;|&nbsp;联系电话1234567890x</p>
	<p>版权所有： 2019-9999 王青集团&nbsp;|&nbsp;法律公告&nbsp;|&nbsp;隐私保护&nbsp;|&nbsp;产品安全</p>
	<br/>
</div>
</div>

</body>
</html>