<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>写博客</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/css/Write.css">
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resource/utf8-jsp/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resource/utf8-jsp/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resource/utf8-jsp/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.3.1.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/utf8-jsp/themes/default/css/ueditor.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/css/editormd.css" />
<script src="${pageContext.request.contextPath}/resource/js/editormd.js"></script>
</head>
<body>
<!-- 引入头部jsp -->
<%@ include file="../../../Top_Buttom/Top.jsp" %>
<div class="Main">
	<form action="${pageContext.request.contextPath }/Write?UserNumber=${UserNumber }&UserName=${UserName }" method="post">
		<div style="padding-top: 80px; padding-left: 300px">			
				<div class="Biaoti">
					<input type="text" name="title" maxlength="100" class="Input_Biaoti"
						id="Input_Biaoti" style="width:800px;" placeholder="文章标题">
				</div>
		</div>
		<div style="padding-left: 300px">
				<div id="test-editormd" class="test-edit">
					<script name="content" id="editor" type="text/plain"
						style="width:800px;height:300px;"></script>
				</div>
				<div class="Button">
					<input type="submit" value="发布博客" name="submit"> <input
						type="button" onclick="" value="返回">
				</div>
		</div>
		</form>
		<br> <br> <br>
</div>
</body>
<script type="text/javascript">

    //实例化编辑器
    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，
    //直接调用UE.getEditor('editor')就能拿到相关的实例
    UE.getEditor('editor',{

		autoClearinitialContent:true,
		//关闭字数统计
		wordCount:false,
		//关闭elementPath
		elementPathEnabled:false,
		//默认的编辑区域高度
		initialFrameHeight:300
		//更多其他参数，请参考ueditor.config.js中的配置项
	});
</script>
</html>