<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>主界面</title>
<link rel="stylesheet" href="./resource/style/css/home.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/UserBlog.css">
<script src="./resource/js/jquery-3.3.1.js"></script>
</head>
<body style="background-color:rgb(210,213,214)">
<!-- 引入头部jsp -->
<%@ include file="./Top_Buttom/Top.jsp" %>
<div style="padding-top: 50px;"></div>
<!-- 热门文章 -->
<div id="Content" style="margin-left:250px;width:1000px;background-color:rgb(255,255,255)" >
		<h1 style="padding-left:20px;">热门博客</h1>
		<hr/>
		<c:forEach items="${Data}" var="item">
			<div style="padding-left:20px;">
				<a href="${pageContext.request.contextPath }/LookBlog?BlogId=${item.blogid }&UserName=${UserName }&UserNumber=${UserNumber }">${item.blogtitle}</a>
				<br>
				<br>				
				<font style="font-size:15px;color:rgb(61,68,76)">Time:${item.blogdata }</font>				
				<font style="font-size:15px;color:rgb(61,68,76); padding-left:20px;">阅读量:${item.blogtraffic }</font>
			</div>		
			<hr style="color:rgb(210,213,214)"/>
			<br>           
        </c:forEach>
        <br>
        <br>        
	</div>
</body>
</html>