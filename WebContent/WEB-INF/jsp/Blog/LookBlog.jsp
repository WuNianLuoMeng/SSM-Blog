<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>查看博客</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/home.css">
<script src="${pageContext.request.contextPath }/resource/js/jquery-3.3.1.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/UserBlog.css">
</head>
<body style="background-color:rgb(210,216,222)">
<!-- 引入头部jsp -->
<%@ include file="../../../../Top_Buttom/Top.jsp" %>
<%@ include file="../../../../Top_Buttom/Left.jsp" %>
<div style="padding-top: 50px;"></div>
<div class="list" style="margin-left:300px; background-color: rgb(255,255,255);background-size: contain|cover;height:auto;width:1000px;">
			<h1 style="text-align:center">
				${Title }
			</h1>
			<div style="padding-left: 300px;">
				<font style="font-size:15px;color:rgb(61,68,76)">Time:${BlogDate }</font>				
				<font style="font-size:15px;color:rgb(61,68,76); padding-left:20px;">阅读量:${BlogTraffic }</font>
			</div>		
			<hr style="color:rgb(210,216,222)"/>
			<p style="padding-left:100px;">
				${Content }
			</p>
			<br>
			<br>
</div>
</body>
</html>