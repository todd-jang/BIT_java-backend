<%@ page language="java" contentType "text/html"; charset="UTF-8"
	pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
	String email= request.getParameter("email");
%>
<!doctype html>
<html>
<body>
	<br><br>
	<%=profile.replaceAll("\n","<br>") %>
	<%
		for(String hobby : hobbies){
	%>
		<h4><%=hobby %></h4>
	<%
		}
	%>	
	<br><br>
	<a href="/emaillist01">바로 가기</a>
</body>
</html>