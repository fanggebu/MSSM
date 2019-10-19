<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--输出,条件,迭代标签库-->
<%--<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析--> --%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录中心</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/datepicker/bootstrap-datetimepicker.min.css">
</head>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/static/datepicker/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/kindeditor-all.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/lang/zh_CN.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/plugins/code/prettify.js" ></script>
<body>
	<form action="<%=basePath%>user/login.action" method="post">
		<input type="text" name="username" placeholder="请输入用户名"><br />
		<input type="text" name="password" placeholder="请输入密码"><br />
		<input type="submit" value="登录">
	</form>
</body>
</html>