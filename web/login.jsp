<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>from表单提交</title>
</head>
<script>
	//表单提交前进行的校验
	function checkUser() {
		var result = document.getElementById("userid").value;
		var password = document.getElementById("passid").value;

		if (result == "") {
			alert("用户名不能为空");
			return false;
		}
		if (password == "") {
			alert("密码不能为空");
			return false;
		}
		document.getElementById("formid").submit();
	}
</script>
<body>
	<form id="formid" name="myform" method='get' action='Login.do'
		onsubmit="return checkUser();">
		<table width="100%" border="0">
			<tr>
				<td width="60" height="40" align="right">用户名&nbsp;</td>
				<td><input type="text" value="" class="text2" name="username"
					id="userid" /></td>
			</tr>
			<tr>
				<td width="60" height="40" align="right">密&nbsp;&nbsp;码&nbsp;</td>
				<td><input type="password" value="" class="text2"
					name="userpass" id="userpassid" /></td>
			</tr>
			<tr>
				<td width="60" height="40" align="right">&nbsp;</td>
				<td><div class="c4">
						<input type="submit" value="登录" class="btn2" />
					</div></td>
			</tr>
		</table>
	</form>
</body>
</html>