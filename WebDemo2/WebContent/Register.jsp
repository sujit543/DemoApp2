<%@ page language="java" contentType="text/html"%>
<%@ include file="CommonHeader.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>

<form action="RegisterController" method="post">
   <table align="right" cellspacing="2">
      <tr bgcolor="gray">
         <td colspan="2">
           <h2>
              <font face="monotype corsiva" color="blue" size="15">Sing in Here</font>
            </h2>
          </td>
        </tr>
        <tr bgcolor="gray">
        <td colspan="2">
        <h2>
        <font face="monotype corsiva" color="red" size="15">${errorInfo}</font>
        </h2>
</td>
</tr>
<tr>
<td>loginId</td>
<td><input type="text" name="loginId" required/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="passwd" required/></td>
</tr>
<tr>
<td>CustomerName</td>
<td><input type="text" name="customerName" required/></td>
</tr>
<tr>
<td>Email ID</td>
<td><input type="email" name="emailid" required/></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobileNo"pattern="[789]\d{9}" 
placeholder="Enter Mobile No of 10 digits" required/></td>
</tr>
<tr>
<td>Address</td>
<td><textarea cols="30" rows="5" name="addr"></textarea></td>
</tr>
<tr>
<td>Country</td>
<td><select name="country">
<option value="India">India</option>
<option value="Srilanka">Srilanka</option>
<option value="Bangladesh">Bangladesh</option>
<option value="Australia">Australia</option>
</select>
</td>
</tr>
<tr bgcolor="gray">
<td colspan="2"><Center>
<input type="submit" value="Sing in"/>
</Center></td>
</tr>
</table>
</form>


</body>
</html>