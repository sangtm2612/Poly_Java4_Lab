<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Tam Giác</h1>
	<form action="/SANGTMPH17730_LAB/TamGiacServlet/tamgiac" method="post">
		<input type="text" name="a" placeholder="Nhập cạnh a"><br>
		<input type="text" name="b" placeholder="Nhập cạnh b"><br>
		<input type="text" name="c" placeholder="Nhập cạnh c"><br>
		<hr>
		<input type="submit" formation="dientich" value="Tính diện tích">
		<input type="submit" formation="chuvi" value="Tính chu vi">
	</form>
	
	<h1>${message }</h1>
</body>
</html>