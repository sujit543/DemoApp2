<%@ page language="java" contentType="text/html" import="java.util.*" %>
<%@ include file="CommonHeader.jsp" %>
<html><head>

<meta charset="ISO-8859-1">

<title>Scriplet</title>
</head>
<body>
<h2>Declaration Scriplet</h2>
<%!
ArrayList<String>person=new ArrayList<String>();
%>
<hr widht="100%" height="5" color="blue"/>
<h2>Normal Scriplet</h2>
<hr widht="100%" height="5" color="blue"/>
<p align="right">
<%
person.add("puneet");
person.add("rahul");
person.add("rakul");
out.println("persons"+person);
Date today=new Date();
out.println("Today:"+today);
%>
</p>
<hr widht="100" height="5" color="blue"/>;
<h3>Expression Scriplet</h3>
100+50=<%=(100+50)%>
</body>
</html>