<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	file: ${fileObj.name }<br>
	desc: ${fileObj.desc }<br>
	
	<form action="download" method="post">
		<input type="hidden" name="name" value="${fileObj.name }">
		<input type="submit" value="download">
	</form>
</body>
</html>