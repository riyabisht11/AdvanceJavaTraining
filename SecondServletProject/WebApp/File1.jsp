<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n=request.getParameter("uname");
out.print("welcome on first page:"+n);
session.setAttribute("key",n);
String n1=config.getInitParameter("name1");

out.print("<br/><br/><h3>Name1 in config implicit Obj= </h3>"+n1);

String n2=application.getInitParameter("name2");
out.print("<br/><h3>Name2 in implict Obj</h3>"+n2);

%>
<br><br>
<!--  
<a href="second.jsp">click here</a>
-->


</body>
</html>