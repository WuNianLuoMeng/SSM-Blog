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
					关注： <a href="${pageContext.request.contextPath }/follow/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=1">${FollowNum }</a> 
					<br>
					粉丝： <a href="${pageContext.request.contextPath }/fans/${BlogUserNumber }?BlogUserName=${BlogUserName }&UserNumber=${UserNumber }&UserName=${UserName }&page=1">${FansNum }</a>
					<br>
					
					<a id="follow1" style="display:none" href="${pageContext.request.contextPath }/AddFollow/?first=${UserNumber}&first_name=${UserName }&second=${BlogUserNumber }&second_name=${BlogUserName }&BlogId=${BlogId }">+加关注</a>
					<font id="follow2" style="display:none">已关注</font>
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
	/*加关注显示*/
	/*已关注显示*/
	var isfollow = "${isfollow}";
	if(isfollow==1){
		var UserNumber="${UserNumber }";
		var BlogUserNumber="${BlogUserNumber }";
		if(UserNumber==BlogUserNumber){
			document.getElementById("follow2").style.display="none";	
		} else{
			document.getElementById("follow2").style.display="";
		}		
		document.getElementById("follow1").style.display="none";
	} else{
		document.getElementById("follow2").style.display="none";
		var UserNumber="${UserNumber }";
		var BlogUserNumber="${BlogUserNumber }";
		if(UserNumber==BlogUserNumber){
			document.getElementById("follow1").style.display="none";	
		} else{
			document.getElementById("follow1").style.display="";
		}
	}
	/*提示是否关注成功*/
	var flag = "${flag}";
	if(flag!=""&&flag!=null){
		alert("关注成功！");
	}
});
</script>
</html>