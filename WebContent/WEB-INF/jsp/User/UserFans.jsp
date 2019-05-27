<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>粉丝</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/style/css/home.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/style/css/UserFans.css">
<script
	src="${pageContext.request.contextPath }/resource/js/jquery-3.3.1.js"></script>
</head>
<style>

</style>
<body style="background-color:rgb(210,216,222)">
	<%@include file="../../../Top_Buttom/Top.jsp"%>
	<div style="padding-top: 50px;"></div>
	<div style="padding-left:250px; width:800px;">
		<div data-v-357a65ed="" class="view-container">
			<div data-v-0c56b7f6="" data-v-357a65ed="" class="content view">
				<div data-v-0c56b7f6="" class="bar" style="padding-left:30px;">					
					<h3 data-v-0c56b7f6="" style="padding-left:10px;" class="title">${BlogUserName }的粉丝</h3>
					<span data-v-0c56b7f6="" class="num" style="padding-top:20px;">共 ${Sum } 人</span>
				</div>
				<div style="padding-left:40px;">
					<hr style="color: rgb(210,216,222);">
				</div>
				<ul data-v-0c56b7f6="" class="watch_list">
				<c:forEach items="${Data}" var="item">
					<li data-v-0c56b7f6="" class="item_cont"><a data-v-0c56b7f6=""
						href="" title="qq_25827845"
						target="_blank" class="nick">${item.frontUsername }</a> 
					</li>
					<hr style="color: rgb(210,216,222)"/>
				</c:forEach>
				</ul>				 
			</div>
		</div>
	</div>
	<br>
	<br>
	<div style="padding-left:550px;">
       	<a href="${pageContext.request.contextPath }/fans/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=${ProPage }" class="previous" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">&laquo; 上一页</a>
		<a href="${pageContext.request.contextPath }/fans/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=${NextPage }" class="next" style=" background-color: #f1f1f1;color: black;text-decoration: none;display: inline-block;padding: 8px 16px;">下一页 &raquo;</a>
    </div>
</body>
</html>