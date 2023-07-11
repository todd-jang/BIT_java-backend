<%@ page language="java" contentType "text/html"; charset="UTF-8"
	pageEncoding="UTF-8"%>
<% import  %>	
<% 
	EmaillistDao dao=new EmaillistDao();
	List<EmaillistVo> list= dao.findALLll();
%>
<!Doctype html>
<html>
<head>
<meta charset ="utf-8">
<title> Insert title here</title>	
</head>
<body>
	<h1><%=s.upperCase %></h1> /* 스크립트 표현식
</body>
</html>