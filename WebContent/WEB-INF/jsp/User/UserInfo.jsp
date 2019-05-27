<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/style/css/UserInfo.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/style/css/home.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resource/style/css/UserFans.css">
<script
	src="${pageContext.request.contextPath }/resource/js/jquery-3.3.1.js"></script>
<title>个人中心</title>
</head>
<body style="background-color:rgb(210,216,220)">
<%@include file="../../../Top_Buttom/Top.jsp"%>
	<div  style="padding-top:50px;"></div>
	<div>
		<div id="app">
			<div data-v357a65ed class="container view">
				<div data-v-357a65ed="" class="left_box">
					<ul data-v-357a65ed="" class="aside">
						<li data-v-357a65ed="" class=""><a data-v-357a65ed="" href=""
							class="zl">个人资料</a></li>
						<li data-v-357a65ed="" class=""><a data-v-357a65ed="" href="${pageContext.request.contextPath }/fans/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=1"
							class="zl">我的粉丝</a></li>
						<li data-v-357a65ed="" class=""><a data-v-357a65ed="" href="${pageContext.request.contextPath }/follow/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=1"
							class="zl">我的关注</a></li>
					</ul>
					<ul data-v-357a65ed="" class="aside">
						<li data-v-357a65ed=""><a data-v-357a65ed="" href="${pageContext.request.contextPath }/UserBlog/${UserNumber }?UserName=${UserName }&page=1"
							target="_blank" class="zl">我的博客</a></li>
						<li data-v-357a65ed=""><a data-v-357a65ed="" href="${pageContext.request.contextPath }/Recommend/${UserNumber }?UserName=${UserName}"
							target="_blank" class="zl">推荐博主</a></li>
					</ul>
				</div>
			</div>
			<div data-v-357a65ed class="view-container" id="area1" style="position: absolute; top:60px;left:280px;" >
				<h3>个人资料</h3>
					用&nbsp户&nbsp手&nbsp机&nbsp号&nbsp&nbsp：<font>${ UserNumber }</font>
					<br>
					<br>
					
					用&nbsp户&nbsp昵&nbsp称&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp：<font>${UserName }</font>
					<div style="padding-top:40px;">
						<input type="button" onclick="changemessage()" value="修改信息">
					</div>					
			</div>
			<div data-v-357a65ed class="view-container" id="area2" style="position: absolute; top:40px;left:280px; display: none;">
				<h3>个人资料</h3>
				<form action="${pageContext.request.contextPath }/ChangeMessage" method="post">
					<input type="text" value="${UserNumber }" style="display:none;" name="usernumber">									
					用&nbsp户&nbsp昵&nbsp称&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="username">
					<br>
					<br>
					
					新&nbsp&nbsp&nbsp&nbsp密&nbsp&nbsp&nbsp&nbsp&nbsp码&nbsp&nbsp&nbsp<input type="text" name="password">
					<br>
					<div style="padding-top:40px;">
						<input type="submit" value="确认修改">
					</div>					
				</form>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	function changemessage(){
		document.getElementById("area1").style.display="none";
		document.getElementById("area2").style.display="";
	}
</script>
</html>