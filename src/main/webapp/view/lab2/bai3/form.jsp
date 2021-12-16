<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Đăng ký</h1>
	<form action="/SANGTMPH17730_LAB/registers" method= "post">
		Tên đăng nhập: <input type="text" name="name"><br>
		Mật khẩu: <input type="password" name="pass"><br>
		Giới tính: <input type="radio" name="gender" value="1">Nam 
		<input type="radio" name="gender" value="0">Nữ <br>
		<input type="checkbox" name="simple" value="1">Đã có gia đình <br>
		Quốc tịch: <select name="country">
			<option value="vn">Việt Nam</option>
			<option value="nb">Nhật Bản</option>
			<option value="hq">Hàn Quốc</option>
		</select> <br>
		Sở thích: <input type="checkbox" name="hobbies" value="Đi nhậu">Đi nhậu
		<input type="checkbox" name="hobbies" value="Chơi game">Chơi game
		<input type="checkbox" name="hobbies" value="Nghe nhạc">Nghe nhạc
		<input type="checkbox" name="hobbies" value="Khác">Khác <br>
		Ghi chú:
		<textarea name="note"></textarea>
		<hr>
		<button>Gửi</button>
	</form>
</body>
</html>