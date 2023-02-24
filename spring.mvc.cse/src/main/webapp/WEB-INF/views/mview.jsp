<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Inside ModelAndVie</h1>
<% 
String str=(String)request.getAttribute("uname");
%>
<h2>welcome: <%=str %></h2>

</body>
</html>