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
<h2 style="color:blue">VIEW ACCOUNT</h2>
	<%
	String mode = (String) request.getAttribute("mode");
	if (mode.equals("single")) {
		boolean flag = (Boolean) request.getAttribute("flag");
		if (flag) {
			BankAcc a = (BankAcc) request.getAttribute("result");
			out.println("<table border=1px><tr><th>ACC_NO</th><th>NAME</th><th>ACC_TYPE</th><th>BALANCE</th></tr>");
			out.println("<tr><td>" + a.getAccNo() + "</td><td>" + a.getName() + "</td><td>" + a.getAccType()
			+ "</td><td>+ a.getBalance() + "</td></tr></table>");
		} else {
			out.println("<h1> " + (String) request.getAttribute("result") + "</h1>");
		}
	} else if (mode.equals("list")) {
		ArrayList<BankAcc> clist = (ArrayList<BankAcc>) request.getAttribute("result");
		out.println("<table border=1px><tr><th>ACC_NO</th><th>NAME</th><th>ACC_TYPE</th><th>BALANCE</th></tr>");
		for(Book b:blist)
		{
			out.println("<tr><td>" + a.getAccNo() + "</td><td>" + a.getName() + "</td><td>" + a.getAccType()
			+ "</td><td>" + a.getBalance() + "</td></tr>");
		}
		out.println("</table>");
	}
	%>
	<h1>${result}</h1>
</body>
</html>