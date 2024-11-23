<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 추가, 조회</title>

<!-- jQuery 문서  -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<!-- 주소 검색창  -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<!-- CDN코드 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<!-- style sheet : front.css 로 연결 -->
<link rel="stylesheet" href="./css/front.css"/>

<!-- script : front.js 로 연결 -->
<script src="./js/front.js"></script>
</head>
<body>
	<!-- 회원 추가 -->
	<div>
		<input id="name" placeholder="이름"></input>
		<input id="age" placeholder="나이"></input>
		<input id="address" style ="width:300px;"  placeholder="주소" readonly></input>
		<button id ="save-btn" class="btn btn-success" >회원등록</button>
	</div>
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">목록</th>
      <th scope="col">이름</th>
      <th scope="col">나이</th>
      <th scope="col">주소</th>
    </tr>
  </thead>
  <tbody id="list">
    <!-- <tr>
      <th scope="row">1</th>
      <td>철수</td>
      <td>24</td>
      <td>@mdo</td>
    </tr> -->
  </tbody>
</table>

	<!-- 조회 창  -->
<button id ="search-btn">조회하기</button>
<table class="table">
  <thead>
    <tr>
      <th scope="col">게시글 아이디</th>
      <th scope="col">회원 아이디</th>
      <th scope="col">제목</th>
    </tr>
  </thead>
  <tbody id="post-list">
   <tr>
      <th scope="row">|</th>
      <td>아이디</td>
      <td>@mdo</td>
    </tr>
  </tbody>
</table>	
	

</body>
</html>