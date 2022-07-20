<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Account Management System</title>
</head>
<body>
<h1 style="color:red">BANK ACCOUNT MANAGEMENT SYSTEM</h1>
<h2 style="color:blue">UPDATE ACCOUNT</h2>
<form action="updateAccount" method="get">
	Enter Bank Account No.:<br> <input type="text" name="AccNo"><br><br>
	Enter Bank Account Holder Name:<br> <input type="text" name="Name"><br><br>
	Enter Bank Account Type:<br> <input type="text" name="AccType"><br><br>
    Enter Balance:<br> <input type="text" name="Balance"><br><br>
	<input type="submit" value="UPDATE ACCOUNT">
</form>
</body>
</html>