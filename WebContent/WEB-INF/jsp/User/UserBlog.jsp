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
	<%@ include file="../../../../Top_Buttom/Left.jsp" %>
	<div style="padding-top: 50px;"></div>
	<div id="Content" style="margin-left:250px;width:1000px;background-color:rgb(255,255,255)" >
		<h1 style="padding-left:20px;">博客内容</h1>
		<hr/>
		<c:forEach items="${Data}" var="item">
			<div style="padding-left:20px;">
				<a href="${pageContext.request.contextPath }/LookBlog?BlogId=${item.blogid }&UserName=${UserName }&UserNumber=${UserNumber }">${item.blogtitle}</a>
				<br>
				<br>				
				<font style="font-size:15px;color:rgb(61,68,76)">Time:${item.blogdata }</font>				
				<font style="font-size:15px;color:rgb(61,68,76); padding-left:20px;">阅读量:${item.blogtraffic }</font>
				<a href="${pageContext.request.contextPath }/EditBLog?BlogId=${item.blogid }&UserName=${UserName }" style="padding-left: 10px; color:rgb(61,68,76);">编辑</a>
				<a href="${pageContext.request.contextPath }/DeleteBlog?BlogId=${item.blogid }&UserNumber=${UserNumber }&UserName=${UserName }" style="padding-left: 5px; color:rgb(61,68,76);">删除</a>				
			</div>		
			<hr style="color:rgb(210,213,214)"/>
			<br>           
        </c:forEach>
        <br>
        <br>
        <div style="padding-left:400px;">
        	<a href="${pageContext.request.contextPath }/UserBlog/${UserNumber }?UserName=${BlogUserName }&page=${ProPage }" class="previous" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">&laquo; 上一页</a>
			<a href="${pageContext.request.contextPath }/UserBlog/${UserNumber }?UserName=${BlogUserName }&page=${NextPage }" class="next" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">下一页 &raquo;</a>
        </div>
        <br>
        <br>
        
	</div>
</body>
</html>