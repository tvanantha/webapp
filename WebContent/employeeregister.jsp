<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Username</td>
     <td><input type="text" name="Username" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="Password" /></td>
    </tr>
    <tr>
     <td>Confirm_Password</td>
     <td><input type="password" name="Confirm__Password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>

</body>
</html>