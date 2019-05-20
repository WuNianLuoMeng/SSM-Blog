<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/css/write_blog_success.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写文章成功</title>
</head>
<body>
	<div class="MAIN">
		<div class="A">
			<p>文章发布成功！</p>
		</div>
		<div class="B">
			<div class="C">
				<input type="button" value="写新文章"
					onclick="window.location = '${pageContext.request.contextPath}/WriteBlog?UserNumber=${UserNumber }&UserName=${UserName }';"> <input
					type="button" value="返回主界面" onclick="window.location = '${pageContext.request.contextPath}/Home?UserNumber=${UserNumber }&UserName=${UserName }';">
			</div>
		</div>
	</div>
</body>
</html>