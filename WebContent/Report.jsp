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
		<s:if test="noData==true">
			<table>
				<thead>
					<tr>
						<th>Product ID</th>
						<th>Product Name</th>
						<th>Product Description</th>						
					</tr>
				</thead>
				<s:iterator value="detailsList">
					<tr>
						<td><s:property value="prodId" /></td>
						<td><s:property value="prodName" /></td>
						<td><s:property value="prodDesc" /></td>						
						<td>
							<a href="updatedetails.action?submitType=updatedata&prodId=<s:property value="prodId"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?prodId=<s:property value="prodId"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div>No Data Found</div>
		</s:else>
	</div>

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
    background-color: lighblue;
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