<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<center>
	<h1>login</h1>
	<hr>
	<form action="login.do" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange">ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td bgcolor="orange">PASSWORD</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="send">
				</td>
			</tr>
		</table>
	</form>
	<hr>
</center>
</body>
</html>