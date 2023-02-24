<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<%
String name=(String)request.getAttribute("niet");
int rank=(Integer)request.getAttribute("nirf");
ArrayList<String> str=(ArrayList<String>)request.getAttribute("kyc");
out.print("Name:"+name+"Rank:"+rank);
%>
<h2>My college is:<%=name %></h2><br>
<h2>Its nirf rank is:<%=rank %></h2>
<h1>Courses in NIET</h1>
<% for(String s:str){ %>
<h2><%=s%></h2>
<%}%>

</body>
</html>