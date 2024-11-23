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
<link rel="stylesheet" href="./css/front.css"/>

<!-- script : front.js 로 연결 -->
<script src="./js/market.js"></script>
</head>

<style>

tr:hover > *{
	cursor : pointer;
	background-color : #f6d3d3 !important;
}

th:hover {
	

}


</style>
<body>

	<div class="container">
	
		<!-- 회원 -->
	<h3>DS 마켓</h3>
	
	<h2>회원</h2>
	
	<!-- 회원가입 링크 -->
	<button id ="join-btn">회원가입</button>
		
	 <!-- 회원 기록 리스트  -->
		<button id ="search-btn">조회하기</button>
		<table class="table">
	  <thead>
	    <tr>
	      <th scope="col">회원코드</th>
	      <th scope="col">아이디</th>
	      <th scope="col">닉네임</th>
	      <th scope="col">주소</th>
	       <th scope="col">보유 포인트</th>
	       <th scope="col">가입날짜</th>
	    </tr>
	  </thead>
	  <tbody id="user-list">
	    <tr class="user-box" >
	      <th scope="row">@394925</th>
	      <td>test12</td>
	      <td>철수</td>
	      <td>짱구마을</td>
	      <td>100,000</td>
	      <td>2024년 11월 14일</td>
	    </tr>
	  </tbody>
	</table>

	
	</div>
</body>
</html>