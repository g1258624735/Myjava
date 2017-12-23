<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<%!int a = 10;%>
</head>
<body>
	<!-- <img src="img/logo.png"/> -->
	<p>
		我是首页<%=a%></p>
	<%
		out.print("your address is " + request.getRemotePort());
	%>
	<h2>嵌套网页</h2>
	<jsp:include page="index.html" />

	<h2>使用javaBean实例</h2>
	<jsp:useBean id="demo" class="com.myjava.hello.Demo1" />
	<jsp:setProperty name="demo" property="name" value="我是jsp页面传递过来的" />
	<jsp:getProperty property="name" name="demo" />
	<%-- <h2>测试网页的重定向</h2>
	<jsp:forward page="success.jsp"/> --%>
	<select name="color" size="3">
		<option value="r">red</option>
		<option value="g">green</option>
		<option value="b">blue</option>
	</select>
	<form action="demoAction" method="get">
		用户名<input type="text" name="us"> 密码<input type="text"
			name="psd"> <input type="submit" value="表单提交">
	</form>
</body>
</html>
