<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>E+智慧食堂</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript" src="java/js.js"></script>
</head>
<body onload="changeColor()">
	<div>
		<div id="wq">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/wq.jpg"> <br />
			<br /> <a href="login.jsp">登录</a> <a href="regist.jsp">注册</a>
		</div>
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
			<div class="logo">
				<img src="images/logo.gif">
				<p class="logo1">E+食堂</p>
			</div>
			<div id="search">
				<form>
					<input type="search" placeholder="搜索订餐信息" name="search1" /> <input
						type="submit" class="button" />
				</form>
			</div>
		</div>
		<div id="second">
			<div class="left">
				<div>全部分类</div>
				<div>
					<ul id="nav_li">
						<li class="nav_li" onmouseover="change('f1_cur','block')"
							onmouseout="change('f1_cur','none')"><span> 第一餐厅</span>
							<div id="f1_cur">
								<a href=""> <span style="font-size: 20px; color: #000;">第一餐厅</span>
									<hr></a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a>
								<a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a> <a href="">煲仔饭</a> <a
									href="">豆腐汤</a> <a href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a
									href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a href="">可乐肋排</a> <a
									href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a> <a
									href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a>

							</div></li>
						<li class="nav_li" onmouseover="change('f2_cur','block')"
							onmouseout="change('f2_cur','none')"><span> 第二餐厅</span>
							<div id="f2_cur">
								<a href=""> <span style="font-size: 20px; color: #000;">第二餐厅</span>
									<hr></a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a>
								<a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a> <a href="">煲仔饭</a> <a
									href="">豆腐汤</a> <a href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a
									href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a href="">可乐肋排</a> <a
									href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a> <a
									href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a>

							</div></li>
						<li class="nav_li" onmouseover="change('f3_cur','block')"
							onmouseout="change('f3_cur','none')"><span> 第三餐厅</span>
							<div id="f3_cur">
								<a href=""> <span style="font-size: 20px; color: #000;">第三餐厅</span>
									<hr></a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a>
								<a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a> <a href="">煲仔饭</a> <a
									href="">豆腐汤</a> <a href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a
									href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a href="">可乐肋排</a> <a
									href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a> <a
									href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a>

							</div></li>
						<li class="nav_li" onmouseover="change('f4_cur','block')"
							onmouseout="change('f4_cur','none')"><span> 第四餐厅</span>
							<div id="f4_cur">
								<a href=""> <span style="font-size: 20px; color: #000;">第四餐厅</span>
									<hr></a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a>
								<a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a> <a href="">煲仔饭</a> <a
									href="">豆腐汤</a> <a href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a
									href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a href="">可乐肋排</a> <a
									href="">煲仔饭</a> <a href="">豆腐汤</a> <a href="">蒸茄子</a> <a
									href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a href="">苹果向阳花</a> <a
									href="">可乐肋排</a> <a href="">煲仔饭</a> <a href="">豆腐汤</a> <a
									href="">蒸茄子</a> <a href="">虾米蒸冬瓜</a> <a href="">腰果雪花酥</a> <a
									href="">苹果向阳花</a> <a href="">可乐肋排</a>

							</div></li>
						<li class="nav_li"><a href="">超市直达</a></li>
						<li class="nav_li"><a href="">菜品评价</a></li>
						<li class="nav_li"><a href="">关于我们</a></li>
					</ul>
				</div>
			</div>
			<div class="right">
				<div class="right1">
					<ul class="ull">
						<li class="right2"><a href="main"> 餐前预定</a></li>
						<li class="right2"><a href="">菜品位置查询</a></li>
						<li class="right2"><a href="">智能取餐柜</a></li>
						<li class="right2"><a href="second.jsp">服务评价</a></li>
						<li class="right2"><a href="cart">历史订单</a></li>
					</ul>
				</div>

			</div>
		</div>
		<div style="display: inline-block; width: 900px;">
			<div id="imgs">
				<a href="">
					<div id="img">
						<img src="images/food1.jpg"> <img src="images/food2.jpg">
						<img src="images/food3.jpg">
					</div>
				</a>
			</div>
			<div class="img2">
				<div class="img1">
					<img src="images/food6.jpg">
				</div>
				<div class="img1">
					<img src="images/food5.jpg">
				</div>
				<div class="img1">
					<img src="images/food4.jpg">
				</div>
			</div>
			<div class="img3">
				<hr>
				<a href=""><img src="images/food7.jpg"></a> <a href=""><img
					src="images/food8.jpg"></a>
			</div>
		</div>
		<div id="three">
			<div class="three1">
				<ul>
					<li class="t1" onmouseout="change('t1_cur','block')"
						onmousemove="change('t1_cur','block')"><span>第一食堂</span>
						<div id="t1_cur">
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food9.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food10.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food11.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
						</div></li>
					<li class="t2" onmousemove="change('t2_cur','block')"
						onmouseout="change('t2_cur','none')"><span>第二食堂</span>
						<div id="t2_cur">
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food12.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food13.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food14.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
						</div></li>
					<li class="t3" onmousemove="change('t3_cur','block')"
						onmouseout="change('t3_cur','none')"><span>第三食堂</span>
						<div id="t3_cur">
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food9.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food10.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food11.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
						</div></li>
					<li class="t4" onmousemove="change('t4_cur','block')"
						onmouseout="change('t4_cur','none')"><span>第四食堂</span>
						<div id="t4_cur">
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food12.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food13.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
							<div class="t11">
								<a href="" title="点击订餐"><img src="images/food14.jpg"></a>
								<button class="button" style="top: 15px;">点击购买</button>
							</div>
						</div></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="four">
		<div class="ftop">
			<p>精品推荐</p>
		</div>
		<div>
			<div class="ft1">
				<div class="ft1_0">
					<img src="images/food15.jpg">
				</div>
				<p class="ft1_1">
					<a href="">FAMILY烘焙坊</a>
				</p>
				<hr />
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;地址：昌平区南丰路沙河地铁站对面物美超市一层</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;电话：88008880</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;营业时间：周一至周日 09：00-21:00</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;消费：人均55</p>
				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/logo2.jpg">
			</div>
			<div class="ft1">
				<div class="ft1_0">
					<img src="images/food16.jpg">
				</div>
				<p class="ft1_1">
					<a href=""> BASIC COFFEE 本质咖啡</a>
				</p>
				<hr />
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;地址：朝阳区景恒街建外SOHO东区9号别墅西南角三层</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;电话：88008880</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;营业时间：周一至周日 09：00-21:00</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;消费：人均55</p>
				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/logo2.jpg">
			</div>
			<div class="ft1">
				<div class="ft1_0">
					<img src="images/food17.jpg">
				</div>
				<p class="ft1_1">
					<a href="">王府茶楼养生宴</a>
				</p>
				<hr />
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;地址：西城区南菜园街乙1号（西二环白纸坊桥东第二红绿灯南侧150米路西）

				</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;电话：88008880</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;营业时间：周一至周日 09：00-21:00</p>
				<br>
				<p class="ft1_2">&nbsp;&nbsp;&nbsp;&nbsp;消费：人均55</p>
				<hr />
				&nbsp;&nbsp;&nbsp;&nbsp;<img src="images/logo2.jpg">
			</div>
		</div>

		<div id="end">
			<hr />
			<br>&nbsp;&nbsp;
			<div class="end1">
				<h2>用户帮助</h2>
				<br /> <a href="">申请退款</a> <br /> <a href="">查看密码</a><br /> <a
					href="">常见问题</a><br /> <a href="">用户协议</a><br /> <a href="">隐私政策</a><br />
				<a href="">反诈骗公告</a><br />
				<br />
			</div>
			<div class="end1">
				<h2>商家合作</h2>
				<br /> <a href="">美食商家入驻</a><br /> <a href="">开店提醒</a><br /> <a
					href="">综合商家入驻</a><br /> <a href="">商家开票申请</a><br /> <a href="">使用E+排队</a><br />
				<a href="">E+点评</a><br />
				<br />
			</div>
			<div class="end1">
				<h2>代理商加盟</h2>
				<br /> <a href="">智能支付</a><br /> <a href="">非餐饮代理商招募</a><br /> <a
					href="">E+联盟</a><br /> <a href="">线上分销</a><br /> <a href="">服务商招募</a><br />
				<br /> <br />
			</div>
			<div class="end1">
				<h2>公司信息</h2>
				<br /> <a href="">关于我们</a><br /> <a href="">投资者关系</a><br /> <a
					href="">加入我们</a><br /> <a href="">法律声明</a><br /> <a href="">价格说明募</a><br />
				<a href="">E+点评规则</a><br /> <a href="">E+服务条款</a><br />
			</div>
			<div class="end1">
				<h4>对网站的印象如何</h4>
				<form>
					<input type="radio" name="11" value="1" checked="checked">
					非常好<br /> <input type="radio" name="11" value="2"> 特别好<br />
				</form>
				<h4>你喜欢什么菜品</h4>
				<form action="1.html" method="post">
					<label for="zhang"></label> <input type="checkbox" name="11"
						value="1" checked="checked"> 红烧肉<br /> <input
						type="checkbox" name="11" value="2" checked="checked"> 清蒸鱼<br />
					<input type="checkbox" name="11" value="3"> 都喜欢<br />
					<script type="text/javascript">
						function show() {
							alert("感谢您的支持");
						}
					</script>
					<input type="submit" onclick="show()" value="登录"> <input
						type="reset" value="重新填写" /> <input type="submit" onclick="show()"
						name="submit" />
				</form>
				<input type="text" list="ad" placeholder="请输入所在地区" />
				<datalist id="ad">
					<option>中国</option>
					<option>美国</option>
					<option>日本</option>

				</datalist>
			</div>
			<div
				style="background-color: #a2a2a2; font-size: 12px; text-align: center; width: 1072px">
				<br>
				<p>
					山东理工大学&nbsp;|&nbsp;软件1705&nbsp;|&nbsp;王青&nbsp;|&nbsp;联系电话1234567890x</p>
				<p>版权所有： 2019-9999
					王青集团&nbsp;|&nbsp;法律公告&nbsp;|&nbsp;隐私保护&nbsp;|&nbsp;产品安全</p>
				<br />
			</div>

		</div>

	</div>
</body>
</html>