<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!-- 引入jstl标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
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
<div id="Comment" style="margin-left: 300px; width:1000px; background-color:rgb(255,255,255)">
<h3>评论列表</h3>
<hr>
<c:forEach items="${Date}" var="item" varStatus="index">
<c:if test="${item.flog==0 }">
	<font style="padding-left:10px; font-size: 15px;">${index.count }楼</font>
	<div style="padding-left:10px;">
		<a href="">${item.firstname }</a>:&nbsp${item.commentContent }
		<button id="${index.count }" class="${index.count }" onclick="comment(${index.count })" style="border:none;background-color:rgb(255,255,255);font-size: 15px;">回复</button>
		<form action="${pageContext.request.contextPath }/SubmitCommit" method="POST">
			<input type="text" id="Id${index.count }" name="comment" style="display:none" placeholder="回复的内容"/>
			<input style="display:none" name="firstusername" value="${UserName }"/>
			<input style="display:none" name="firstusernumber" value="${UserNumber }"/>
			<input style="display:none" name="secondusername" value="${item.firstname }"/>
			<input style="display:none" name="secondusernumber" value="${item.firstnumber }"/>
			<input style="display:none" name="flog" value="1"/>
			<input style="display:none" name="blogid" value="${BlogId }"/>
			<input type="submit" id="B${index.count }" style="display:none">
		</form>                                  
		<hr style="background-color:rgb(210,216,222)">
	</div>
</c:if>
<c:if test="${item.flog==1 }">
	<font style="padding-left:10px; font-size: 15px;">${index.count }楼</font>
	<div style="padding-left:10px;">
		<a href="">${item.firstname }</a>&nbsp回复&nbsp<a href="">${item.secondname }</a>:&nbsp${item.commentContent }
		<input type="text" id="Id${index.count }"  style="display:none" placeholder="回复的内容"/>
		<input type="submit" id="B${index.count }" style="display:none">		
		<hr style="background-color:rgb(210,216,222)">
	</div>
</c:if>
</c:forEach>
<form action="${pageContext.request.contextPath }/SubmitCommit" method="POST">
	<input type="text" name="comment" class="Input_Comment" id="Input_Comment" style="margin-left:10px;height: 36px;width:800px;" placeholder="想对作者说点啥">
	<input type="submit" id="BComment" value="确认提交" style="margin-top: 6px;margin-bottom: 6px;height: 30px;
    line-height: 28px;
    min-width: 72px;    color: #fff !important;
    border: 1px solid #ca0c16 !important;
    background-color: #ca0c16 !important;
    -webkit-transition: background-color .1s ease-in-out,border-color .1s ease-in-out;
    transition: background-color .1s ease-in-out,border-color .1s ease-in-out;"/>
    <input style="display:none" name="firstusername" value="${UserName }"/>
	<input style="display:none" name="firstusernumber" value="${UserNumber }"/>
	<input style="display:none" name="secondusername" value="${BlogUserName }"/>
	<input style="display:none" name="secondusernumber" value="${BlogUserNumber }"/>
	<input style="display:none" name="flog" value="0"/>
	<input style="display:none" name="blogid" value="${BlogId }"/>
</form>


<br>
<br>
</div>
</body>
<script>
$().ready(function() {
	var UserNumber = "${UserNumber }";
	var BlogUserNumber = "${BlogUserNumber }";
 	
	if(UserNumber==BlogUserNumber){
		document.getElementById("Input_Comment").style.display="none";		
		document.getElementById("BComment").style.display="none";
	} else{
		document.getElementById("Input_Comment").style.display="";
		document.getElementById("BComment").style.display="";
	}
});
function comment(id){	
	document.getElementById("Id"+id).style.display="";
	document.getElementById("B"+id).style.display="";
	var sum = "${sum}";
	for(var i=1;i<=sum;i++){
		if(i!=id){			
			document.getElementById("Id"+i).style.display="none";
			document.getElementById("B"+i).style.display="none";
		}
	}
}
</script>
</html>