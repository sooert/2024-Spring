<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>물건등록</title>

<!-- jQuery 문서  -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<!-- 주소 검색창  -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<!-- CDN코드 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<!-- style sheet : front.css 로 연결 -->
<link rel="stylesheet" href="./css/save-user.css"/>

<!-- script : front.js 로 연결 -->
<script src="./js/save-item.js"></script>
</head>
<body>
		<!--  회원 가입 UI -->
	 <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center mb-4">DS 마켓 - 물건등록</h2>
        <div>
       		
       		 <!-- user_idx  -->
          <div class="mb-3">
            <label for="user_idx" class="form-label">아이디</label>
            <input type="text" class="form-control" id="user_idx" placeholder="수량을 입력하세요">
          </div>
       		
       		<!-- 물건이름 -->
          <div class="mb-3">
            <label for="name" class="form-label">상품이름</label>
            <input type="text" class="form-control" id="name" placeholder="상품이름을 입력하세요">
          </div>
          
          <!-- 제조사  -->
           <div class="mb-3">
            <label for="maker" class="form-label">제조사</label>
            <input type="text" class="form-control" id="maker" placeholder="제조사를 입력하세요">
          </div>
          
          <!-- 가격  -->
          <div class="mb-3">
            <label for="price" class="form-label">가격</label>
            <input type="number" class="form-control" id="price" placeholder="가격을 입력하세요">
          </div>
          
         
          
           <!-- 수량  -->
          <!-- <div class="mb-3">
            <label for="price-c" class="form-label">수량</label>
            <input type="number" class="form-control" id="price-c" placeholder="수량을 지정해주세요">
          </div> -->

          <button id="save-btn" type="submit" class="btn btn-primary w-100">등록하기</button>
        </div>
      </div>
    </div>
  </div>
          
        

	

</body>
</html>