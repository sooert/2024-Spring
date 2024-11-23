<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="./image/logo-icon.png"/>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Back</title>
</head>
<body>
	<h2>회원 상세 페이지</h2>
	
	<!-- ${key}를 사용해서 DB 데이터 옮기기  -->
	<h5>아이디 : ${user.id}</h5>
	<h5>비밀번호 : ${user.pw}</h5>
	<h5>닉네임 : ${user.nick}</h5>
	<h5>가입날짜 : ${user.created_date}</h5>
	

</body>
</html>