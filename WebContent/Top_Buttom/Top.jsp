<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resource/style/css/home.css">
<script src="./resource/js/jquery-3.3.1.js"></script>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<div class="MAIN">
		<div class="menu">
			<ul style="list-style: none">
				<li>
					<a href="">博客乐园</a> 
				 	<a href="${pageContext.request.contextPath }/WriteBlog">写博客</a>
					<a href="">关于</a>
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					&nbsp&nbsp&nbsp&nbsp&nbsp &nbsp&nbsp&nbsp&nbsp&nbsp
					<a href="${pageContext.request.contextPath }/Login" id="href1">登录</a>
					<a href="${pageContext.request.contextPath }/Detail/${UserNumber }" id="href2">${ UserName }</a>
				<a href="${pageContext.request.contextPath }/Logout">退出</a></li>
			</ul>
		</div>
	</div>
</body>
<script>
//渲染界面前所要执行的函数
$().ready(function() {
	if(${ UserNumber}==""){
		document.getElementById("href1").style.display="";
		document.getElementById("href2").style.display="none";
	} else{
		document.getElementById("href1").style.display="none";
		document.getElementById("href2").style.display="";
	}
});

</script>
</html>