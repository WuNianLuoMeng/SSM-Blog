<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
<div id="sideBar" style="top:70px;position:relative">
		<!-- 第一块 个人信息 -->
		<div id="sideBarMain">
			<div class="newsItem">
				<div id="blog-news">
					昵称： <a href="">${BlogUserName }</a> 
					<br> 
					关注： <a href="${pageContext.request.contextPath }/follow/${UserNumber }?UserName=${UserName }&page=1">${FollowNum }</a> 
					<br>
					粉丝： <a href="${pageContext.request.contextPath }/fans/${UserNumber }?UserName=${UserName }&page=1">${FansNum }</a>
					<br>
					
					<a id="follow" href="${pageContext.request.contextPath }/AddFollow/?first=${UserNumber}&first_name=${UserName }&second=${BlogUserNumber }&second_name=${BlogUserName }">+加关注</a>
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
									<form action="${pageContext.request.contextPath }/Search" method="get">
										<input type="text" id="q" name="content" class="input_my_zzk">
										<input type="text" style="display:none" value="${UserNumber }" name="UserNumber">
										<input type="text" style="display:none" value="${UserName }" name="UserName">
										<input type="text" style="display:none" value="${BlogUserName }" name="BlogUserName">										
										<input type="text" style="display:none" value="1" name="page">
										<input type="submit" value="找找看" id="btnZzk" class="btn_my_zzk">
									</form>
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
</body>
<script>
$().ready(function() {
	var usernumber = "${UserNumber }";
	var blogusernumber = "${BlogUserNumber }";
	if(blogusernumber==null||blogusernumber==""){
		document.getElementById("follow").style.display="none";
	} else if(usernumber!=blogusernumber){
		document.getElementById("follow").style.display="";
	} else{
		document.getElementById("follow").style.display="none";
	}
});
</script>
</html>