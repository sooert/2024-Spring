<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="icon" href="/image/logo-icon.png"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="./css/login.css"/>
<script src="./js/login.js"></script>
</head>
<body>
	
    <!-- 로그인 페이지 -->
	<div class="center-container" style="flex-direction: column;">

        <!-- 로그인 페이지 타이틀 -->
        <div style="margin-top: 50px; text-align: center;">
            <img src="./image/store.png" style="width: 100px;" />
            <h2>로그인</h2>
        </div>
        
		<!-- 로그인 폼 -->
		<div class="form-container">
			<form id="signupForm">

				<!-- 아이디 입력 -->
				<div class="input-with-btn">
					<input id="id" name="id" type="text" placeholder="아이디" required autocomplete="username"/>
				</div>
				
				<!-- 비밀번호 입력 -->
				<div class="input-with-btn">
					<input id="pw" name="password" type="password" placeholder="비밀번호를 입력하세요" 
						required autocomplete="new-password" minlength="8"/>
				</div>

				<button id="login-btn" type="submit">로그인</button>
			</form>
		</div>
	
	</div>

</body>
</html>