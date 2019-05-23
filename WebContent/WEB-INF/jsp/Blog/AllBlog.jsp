<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>所有博客</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/UserBlog.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resource/style/css/home.css">
<script src="${pageContext.request.contextPath }/resource/js/jquery-3.3.1.js"></script>
</head>
<body style="background-color:rgb(210,216,222)">
<%@include file="../../../../Top_Buttom/Top.jsp" %>
<div style="padding-top: 50px;"></div>
	<div id="Content" style="margin-left:200px;width:1000px;background-color:rgb(255,255,255)" >
		<h1 style="padding-left:20px;">博客内容</h1>
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
        <div style="padding-left:400px;">
        	<a href="${pageContext.request.contextPath }/AllBlog?UserNumber=${UserNumber }&UserName=${UserName }&page=${ProPage }" class="previous" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">&laquo; 上一页</a>
			<a href="${pageContext.request.contextPath }/AllBlog?UserNumber=${UserNumber }&UserName=${UserName }&page=${NextPage }" class="next" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">下一页 &raquo;</a>
        </div>
        <br>
        <br>
        
	</div>
</body>
</html>