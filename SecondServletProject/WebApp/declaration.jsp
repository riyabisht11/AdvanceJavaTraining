<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
<%!
int cube(int n){
return n*n*n;
}
%>
<%="Cube of 3 is: "+cube(3) %></h1>

</body>
</html>