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

<!-- style sheet : front.css 로 연결 -->
<!-- <link rel="stylesheet" href="./css/front.css"/> -->

<!-- script : front.js 로 연결 -->
<script src="./js/item.js"></script>
</head>
<body>

	<div class="container">
	
		<!-- 회원 -->
	<h3>DS 마켓</h3>
	
	<h2>판매 상품 목록</h2>

		<!-- 아이템 리스트  -->
		<button id ="home-btn">홈</button>
		<button id ="register-btn">등록하기</button>
		<button id ="search-btn">조회하기</button>
		<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">물건코드</th>
	      <th scope="col">이름</th>
	      <th scope="col">제조사</th>
	      <th scope="col">가격</th>
	       <th scope="col">만든날짜</th>
	    </tr>
	  </thead>
	  <tbody id="item-list">
	    <tr>
	      <th scope="row">@394925</th>
	      <td>솜사탕</td>
	      <td>사탕회사</td>
	      <td>100,000</td>
	      <td>2024년 11월 14일</td>
	    </tr>
	  </tbody>
	</table>

	
	</div>
</body>
</html>