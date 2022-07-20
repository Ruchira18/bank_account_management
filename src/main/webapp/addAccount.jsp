<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Account Management System</title>
</head>
<body>
<h1 style="color:red">Bank Account Management System</h1>
<h2 style="color:blue">ADD A ACCOUNT</h2>
<form action="addAccount" method="get">
	Enter Bank Account No.:<br> <input type="text" name="AccNo"><br><br>
	Enter Bank Account Holder Name:<br> <input type="text" name="Name"><br><br>
	Enter Bank Account Type:<br> <input type="text" name="AccType"><br><br>
    Enter Balance:<br> <input type="text" name="Balance"><br><br>
	<input type="submit" value="ADD ACCOUNT">
</form>
</body>
</html>