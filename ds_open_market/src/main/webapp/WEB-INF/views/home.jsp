<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>네이버 쇼핑몰</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<link rel="icon" href="./image/logo-icon.png"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.0/css/all.min.css" integrity="sha512-9xKTRVabjVeZmc+GUW8GgSmcREDunMM+Dt/GrzchfN8tkwHizc5RP4Ok/MXFFy5rIjJjzhndFScTceq5e6GvVQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="./css/style.css"/>
<script src="./js/home.js"></script>

</head>
<body>

	<!-- 헤더 파일 포함 -->
	<%@ include file="./include/header.jsp" %>	

	<div class="home-container">
		<div class="inner">
			<div class="title">
				<h2>상품리스트</h2>
			</div>
			<section class="product-list">
				<!-- 동적으로 상품이 로드될 영역입니다 -->
			</section>
		</div>
	</div>

	
</body>
</html>