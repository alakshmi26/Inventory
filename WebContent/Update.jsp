<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>
<div>
	<form action=updatedetails method="post">
		<table>
			<tr>
				<td>Product ID</td>
				<td><input type="text" name="prodId" value='<s:property value="prodId"/>' required>
				<input type="hidden" name="prodIdhidden" value='<s:property value="prodId"/>'></td>
			</tr>
			<tr>
				<td>Product Name</td>
				<td><input type="text" name="prodName" value='<s:property value="prodName"/>' required></td>
			</tr>
			<tr>
				<td>Product Description</td>
				<td><input type="text" name="prodDesc" value='<s:property value="prodDesc"/>' requireds></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
</div>

	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
	
<div>
	<form action="report" method="post">
		<input type="submit" value="Report">
	</form>
</div>	
	
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>


</body>
</html>
<style>
body {background-color: lightblue;}

input[type=text], select {
    width: 25%;
    padding: 10px 20px;
    margin: 6px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=password], select {
    width: 25%;
    padding: 10px 20px;
    margin: 6px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=submit] {
    width: 25%;
    background-color: #32CD32;
    color: white;
    padding: 10px 20px;
    margin: 6px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=button] {
    width: 25%;
    background-color: #32CD32;
    color: white;
    padding: 10px 20px;
    margin: 6px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=submit]:hover {
    background-color: #32CD32;
}

div {
    border-radius: 5px;
    background-color: lightblue;
    padding: 20px;
}
table {
    font-family: verdana, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 6px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>