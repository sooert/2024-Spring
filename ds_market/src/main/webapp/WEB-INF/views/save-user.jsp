<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<!-- jQuery 문서  -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<!-- 주소 검색창  -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<!-- CDN코드 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<!-- style sheet : front.css 로 연결 -->
<link rel="stylesheet" href="./css/save-user.css"/>

<!-- script : front.js 로 연결 -->
<script src="./js/save-user.js"></script>
</head>
<body>
		<!--  회원 가입 UI -->
	 <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <h2 class="text-center mb-4">DS 마켓 - 회원가입</h2>
        <div>
       
       		<!-- 아아ㅣ디 -->
          <div class="mb-3">
            <label for="id" class="form-label">아이디</label>
            <input type="text" class="form-control" id="id" placeholder="사용자 이름을 입력하세요">
          </div>
          
          <!-- 닉네임  -->
           <div class="mb-3">
            <label for="nick" class="form-label">닉네임</label>
            <input class="form-control" id="nick" placeholder="이메일을 입력하세요">
          </div>
          
          <!-- 비밀번호  -->
          <div class="mb-3">
            <label for="pw" class="form-label">비밀번호</label>
            <input type="password" class="form-control" id="pw" placeholder="비밀번호를 입력하세요">
          </div>
          
          <!-- 비밀번호 확인  -->
          <div class="mb-3">
            <label for="pwcheck" class="form-label">비밀번호 확인</label>
            <input type="password" class="form-control" id="pwcheck" placeholder="비밀번호를 다시 입력하세요">
          	<div id ="pw-result-txt" style = "font-size : 14px; margin-top : 2px; "></div>
          </div>
          
          <!-- 주소  -->
          <div class="mb-3">
            <label for="address" class="form-label">주소</label>
            <input type="text" class="form-control" id="address" placeholder="주소를 입력하세요">
          </div>
          
          <!-- 이메일  -->
          <!-- <div class="mb-3">
            <label for="email" class="form-label">이메일</label>
            <input type="text" class="form-control" id="email" placeholder="이메일을 입력하세요">
          </div> -->
          
          <button id="save-btn" type="submit" class="btn btn-primary w-100">가입하기</button>
        </div>
      </div>
    </div>
  </div>
          
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>