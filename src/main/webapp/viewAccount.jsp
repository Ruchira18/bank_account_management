<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BANK ACCOUNT MANAGEMENT SYSTEM</title>
</head>
<body>
<body>
<h1 style="color:red">BANK ACCOUNT MANAGEMENT SYSTEM</h1>
<h2 style="color:blue">VIEW ACCOUNT</h2>
<form action="viewAccount" method="get">
	Enter BANK ACCOUNT NO:<br> <input type="text" name="AccNo"><br><br>
	<input type="submit" value="VIEW ACCOUNTS"><br><br>
</form>
<h2 style="color:blue">VIEW ALL BOOKS</h2>
<form action="viewAccounts" method="get">
	<input type="submit" value="VIEW ALL ACCOUNTS">
</form>
</body>
</html>