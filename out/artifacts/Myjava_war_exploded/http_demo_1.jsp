<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的第一个jsp</title>
<script type="text/javascript" src="${ctx}/static/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function show() {
		alert("我是弹框")
	}
</script>
</head>
<body>
	<font color="#0000ff">
		<h3>jsp测试页面</h3> The time now is:<%=new java.util.Date()%>
	</font>
	<br />
	<button onclick="show()">登陆</button>
</body>
</html>