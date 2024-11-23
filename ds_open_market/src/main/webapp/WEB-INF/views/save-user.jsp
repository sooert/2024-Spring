<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<!-- 아이콘 -->
<link rel="icon" href="./image/logo-icon.png"/>

<!-- 폰트어썸 -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

<link rel="stylesheet" href="./css/save-user.css"/>

<!-- 제이쿼리 -->	
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<!-- 파이어베이스 -->
<script src="https://www.gstatic.com/firebasejs/7.3.0/firebase.js"></script>
<script src="https://www.gstatic.com/firebasejs/7.3.0/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/7.3.0/firebase-storage.js"></script>

<!-- 다음 주소 api -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script src="./js/save-user.js"></script>
<script src="./js/async.js"></script>
</head>
<body>
	
    <!-- 회원가입 페이지 -->
	<div class="center-container" style="flex-direction: column;">

        <!-- 회원가입 페이지 타이틀 -->
        <div style="margin-top: 50px; text-align: center;">
            <img src="./image/store.png" style="width: 100px;" />
            <h2>회원가입</h2> 
        </div>
        
		<!-- 회원가입 폼 -->
		<div class="form-container">
			<form id="signupForm">

				<!-- 프로필 이미지 업로드 -->
				<img id="profile-img" src="./image/default_profile.png" style="margin-bottom: 10px;"/>
				<input type="file" id="file" style="padding-top: 10px;">

				<!-- 아이디 입력 -->
				<div class="input-with-btn">
					<input id="id" name="id" type="text" placeholder="아이디" required autocomplete="username"/>
					<button class="idcheck" type="button" aria-label="아이디 중복확인">중복확인</button>
				</div>
				<div id="id-result-txt" class="validation-message" style="margin-bottom: 15px;"></div>

				<!-- 비밀번호 입력 -->
				<div class="input-with-btn">
					<input id="pw" name="password" type="password" placeholder="비밀번호를 입력하세요" 
						required autocomplete="new-password" minlength="8"/>
				</div>
				
				<!-- 비밀번호 확인 -->
				<div class="input-with-btn">
					<input id="pwcheck" type="password" placeholder="비밀번호를 다시 입력하세요" 
						required autocomplete="new-password"/>
				</div>
				<div id="pw-result-txt" class="validation-message" style="margin-bottom: 15px;"></div>
				
				<!-- 닉네임 입력 -->
				<div class="input-with-btn">
					<input id="nick" name="nickname" type="text" placeholder="닉네임" required/>
					<button class="nickcheck" type="button" aria-label="닉네임 중복확인">중복확인</button>
				</div>
				<div id="nick-result-txt" class="validation-message" style="margin-bottom: 15px;"></div>
				
				<!-- 주소 입력 -->
				<input id="address" name="address" type="text" placeholder="주소" required/>

				<!-- 회원가입 버튼 -->
				<button type="submit" id="signup-btn">
					<div id="loader" class="loader" style="margin-right: 8px;display: none;"></div>
					회원가입
				</button>
			</form>
		</div>
	
	</div>

</body>
</html>