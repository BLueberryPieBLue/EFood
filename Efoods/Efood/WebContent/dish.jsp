<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加菜品</title>
<script type="text/javascript"src="scripts/jquery-1.7.2.min.js"></script>
<style>
	span#add_span,span#add2_span{
		color:red;
	}
</style>
<script type="text/javascript">
	
	$(function(){
		dishnameFlage= false;
		priceFlag= false;
		$("#dishname").blur(function(){
			dishname=$("#dishname").val();
			$.ajax({
				url:"CheckDishnameServlet",
				type:"post",
				data:"dishname="+dishname,
				success:function(data){
					if(data==1){
						$("#add_span").html("菜名可以使用");
						dishnameFlage=true;
					}else if(data==2){
						$("#add_span").html("菜名不可以为空");
					}else{
						$("#add_span").html("菜名已存在");
					}
				},
			});
			
		})
		
			
		$("#price").blur(function(){
			price=$("#price").val();
			if(price==""){
				$("#add2_span").html("单价不可以为空");
			}else{
				$("#add2_span").html("");
				priceFlag=true;
			}
		})
		$("form").submit(function(){
			return dishnameFlage&&priceFlag;
		})
		
		$(".btn").click(function(){
				id=$(this).attr("id");
				$.ajax({
					url:"DeleteDish",
					type:"post",
					data:"id="+id,
				});
				location.reload();
		})
		$("#add").click(function(){
			dishname=$("#dishname").val();
			price=$("#price").val();
				$.ajax({
					url:"addone",
					type:"post",
					data:{
						"dishname":dishname,
						"price":price,
						},
				});
				location.reload();
		})
	});
</script>
</head>
<body>
		<h1 align="center">添加菜品</h1>
		<form align="center"method="post">
			菜品名称 :<input type="text" name="dishname"id="dishname"/><span id="add_span">${regist_msg}</span>
			<br/>
			菜品单价 :<input type="text" name="price"id="price"/><span id="add2_span"></span>
			<br/>
			<input id="add" type="submit" value="添加"/>
		</form>
		<br>
		<h1 align="center">菜品列表</h1>
		<table border="1px" align="center" width="70%"cellspacing="0px">
			<tr>
				<th>ID</th>
				<th>菜品名称</th>
				<th>菜品单价</th>
				<th>菜品删除</th>
			</tr>
		<c:if test="${!empty dishes}">
	    	<c:forEach items="${dishes}" var="dishes">
	    		<tr>
	    			<td>${dishes.id}</td>
	    			<td>${dishes.dishname}</td>
	    			<td>${dishes.price}</td>
	    			<td><button id="${dishes.id}" class="btn">删除</button></td>
	    		</tr>
	    	</c:forEach>
	    </c:if>
		</table>
</body>
</html>