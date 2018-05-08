<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>

	<form action="loginaction" method="post">
		<table>
			<tr>
				<td>Please Enter Username</td>
				<td><input type="text" name="userName" required></td>
			</tr>
			<tr>
				<td>Please Enter Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>

</body>
</html>

<style>
body {
	background-color: lightblue;
}

input[type=text], select {
	width: 75%;
	padding: 10px 20px;
	margin: 6px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=password], select {
	width: 75%;
	padding: 10px 20px;
	margin: 6px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=submit] {
	width: 75%;
	background-color: green;
	color: white;
	padding: 14px 20px;
	margin: 6px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
</style>