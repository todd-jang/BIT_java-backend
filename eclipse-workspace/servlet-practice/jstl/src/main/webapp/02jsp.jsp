<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>scope</title>
</head>
<body>
	<h4>존속범위</h4>
	${vo.no} <br>
	${vo.name }<br>
	
	====request scope=======<br>
	${requestScope.vo.no}<br>
	${requestScope.vo.name }<br>
</body>	
</html>