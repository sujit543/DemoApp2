<%@ page language="java" contentType="text/html"%>
<%@ include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="post">
<table align="right" cellspacing="2">
<tr bgcolor="gray">
<td colspan="2">
<h2>
<font face="monotype corsiva">Sing Up Here</font>
</h2>
</td>
</tr>
<tr>
<td>Login</td>
<td><input type="text" name="loginid" required/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="Password" name="passwd" required/></td>
</tr>
<tr bgcolor="gray">
<td colspan="2"><center>
<input type="Submit" value="Sing up"/>
</center></td>
</tr>
</table>
</form>
</body></html>