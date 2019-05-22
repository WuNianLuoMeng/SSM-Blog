<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户主页</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/UserBlog.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/home.css">
<script src="${pageContext.request.contextPath }/resource/js/jquery-3.3.1.js"></script>
</head>
<body style="background-color:rgb(210,216,222)">
<!-- 引入头部jsp -->
<%@ include file="../../../../Top_Buttom/Top.jsp" %>
	<div id="sideBar" style="top:70px;position:relative">
		<!-- 第一块 个人信息 -->
		<div id="sideBarMain">
			<div class="newsItem">
				<div id="blog-news">
					昵称： <a href="">${UserName }</a> 
					<br> 
					粉丝： <a href="">12</a> 
					<br>
					关注： <a href="">10</a>
					<br>
					
					<a href="">+加关注</a>
				</div>
			</div>
			<!-- 第二块 搜索功能 -->
			<div id="leftcontentcontainer">
				<div id="blog-sidecolumn">
					<div class="sidebar-block" id="sidebar_search">
						<div id="sidebar_search" class="mySearch">
							<h3 class="catListTitle">搜索</h3>
							<div id="sidebar_search_box">
								<div id="widget_my_zzk" class="div_my_zzk">
									<input type="text" id="q" class="input_my_zzk">
									<input type="button" value="找找看" id="btnZzk" class="btn_my_zzk">
								</div>
								<div id="widget_my_zzk" class="div_my_zzk">
									<input type="text" id="q" class="input_my_zzk">
									<input type="button" value="百度搜索" id="btnZzk" class="btn_my_zzk">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 第三块 时间排行榜 -->
			<div id="leftcontentcontainer">
				<div id="blog-sidecolumn">
					<div class="sidebar-block" id="sidebar_search">
						<div id="sidebar_search" class="mySearch">
							<h3 class="catListTitle">时间排行榜</h3>
							<div id="sidebar_search_box">
								<div id="widget_my_zzk" class="div_my_zzk">
									<a>第一篇</a>
								</div>
								<div id="widget_my_zzk" class="div_my_zzk">
									<a>第二篇</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 第四块 阅读排行榜 -->
			<div id="leftcontentcontainer">
				<div id="blog-sidecolumn">
					<div class="sidebar-block" id="sidebar_search">
						<div id="sidebar_search" class="mySearch">
							<h3 class="catListTitle">阅读排行榜</h3>
							<div id="sidebar_search_box">
								<div id="widget_my_zzk" class="div_my_zzk">
									<a>第一篇</a>
								</div>
								<div id="widget_my_zzk" class="div_my_zzk">
									<a>第二篇</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="padding-top: 50px;"></div>
	<div id="Content" style="margin-left:250px;width:1000px;background-color:rgb(255,255,255)" >
		<h1 style="padding-left:20px;">博客内容</h1>
		<hr/>
		<c:forEach items="${Data}" var="item">
			<div style="padding-left:20px;">
				<a href="">${item.blogtitle}</a>
			</div>		
			<br>           
        </c:forEach>
        <br>
        <br>
        <div style="padding-left:400px;">
        	<a href="${pageContext.request.contextPath }/UserBlog/${UserNumber }?UserName=${UserName }&page=${ProPage }" class="previous" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">&laquo; 上一页</a>
			<a href="${pageContext.request.contextPath }/UserBlog/${UserNumber }?UserName=${UserName }&page=${NextPage }" class="next" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">下一页 &raquo;</a>
        </div>
        <br>
        <br>
        
	</div>
</body>
</html>