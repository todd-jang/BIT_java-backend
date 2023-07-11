<%@ page language="java" contentType "text/html"; charset="UTF-8"
	pageEncoding="UTF-8"%>
<% 
	String s= "Hello World";
%>
<!Doctype html>
<html>
<head>
<meta charset ="utf-8">
<title> Insert title here</title>	
</head>
<body>
	<h1><%=s.upperCase %></h1> 
	<h2><%=s.upperCase %></h2>
	<h3><%=s.upperCase %></h3>
	
	<table>
	<tr>
        <td>2</td>
        
    </tr>    
		<td>1</td>
	<tr>
		<td>2</td>
	</tr>	
	</table>
	<br>
	
	<img src="helloweb/webapp/assets/images/cats.jpg"> style="width:200px>
	
	<p>
		문장입니다.
		문장입니다 <br>
		문장입니다
	</p>
	
	<a href="/helloweb/hello">hello로 가기 </a>
	<br>
	<a href="/helloweb/form.jsp">form으로 가기 </a>
		
</body>
</html>