<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head lang="en">
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/AmazeUI-2.4.2/assets/css/amazeui.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/style/dlstyle.css" />
</head>
<script type="text/javascript">
</script>
<body>

	<div class="login-boxtitle">
		<a href=""><img alt="logo"
			src="${pageContext.request.contextPath}/resource/images/logobig.png" /></a>
	</div>

	<div class="login-banner">
		<div class="login-main">
			<div class="login-banner-bg">
				<!-- 				<span></span><img src="../../images/big.jpg" /> -->
			</div>
			<div class="login-box">
				<h3 class="title">登录博客系统</h3>
				<div class="clear"></div>
				<div class="login-form">
					<form action="" method="post">
						<div class="user-name">
							<label for="user"><i class="am-icon-user"></i></label> <input
								type="text" name="number" id="user" placeholder="手机号">
						</div>
						<div class="user-pass">
							<label for="password"><i class="am-icon-lock"></i></label> <input
								type="password" name="" id="password" placeholder="请输入密码">
						</div>
					</form>
				</div>

				<div class="login-links">
					<label for="remember-me"><input id="remember-me"
						type="checkbox">记住密码</label> <a href="#" class="am-fr">忘记密码</a> 
						<a  href="${pageContext.request.contextPath}/Registe" class="zcnext am-fr am-btn-default">注册</a> <br />
				</div>
				<div class="am-cf">
					<input type="submit" name="" value="登 录"
						class="am-btn am-btn-primary am-btn-sm">
				</div>
			</div>
		</div>
	</div>
</body>

</html>