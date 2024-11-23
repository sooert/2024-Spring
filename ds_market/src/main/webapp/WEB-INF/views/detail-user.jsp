<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DS 마켓</title>

<!-- jQuery 문서  -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<!-- 주소 검색창  -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<!-- CDN코드 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<!-- style sheet : detail.css 로 연결 -->
<link rel="stylesheet" href="./css/detail-user.css"/>

<!-- script : front.js 로 연결 -->
<!-- <script src="./js/detail-user.js"></script> -->
</head>
<style>
h3{

	color : #222;
	font-weight:700;
	font-size:20px;
	padding-top : 20px;
	
	

}

.font-box{
	margin-bottom : 3px;
	margin-top : 2px;
	height : 60px;
	
	

}

.d-font{
	font-size : 10px;
	color: #c2b0b0;


}

.d-box{

	font-weight:700;
	font-size:14px;
	

}
	


</style>

<body>

	<div class="container" style = "margin-top:50px; padding-left:20px; width:700px; background:#f0ebeb;" >
	
		<h3>회원정보</h3>
		
		<div class="font-box">
			<label class="d-font">아이디</label>
			<div class="d-box">${user.user_code}</div>
			
		</div>
		
		<div class="font-box">
			<label  class="d-font">닉네임</label>
			<div class="d-box">${user.nick}</div>
		</div>
		
		<div class="font-box">
			<label class="d-font">포인트</label>
			<div class="d-box">${user.point}</div>
		</div>
		
		<div class="font-box">
			<label class="d-font">주소</label>
			<div class="d-box">${user.address}</div>
		</div>
		
		<div class="font-box">
			<label class="d-font">가입날짜</label>
			<div class="d-box">${user.created_date}</div>
		</div>
	
	
	
	
	
	
	
	
	
	
	
	
		
	

	
	</div>
</body>
</html>