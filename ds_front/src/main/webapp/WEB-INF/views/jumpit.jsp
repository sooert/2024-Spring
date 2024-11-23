<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" href="./image/logo-icon.png"/>
<title>프론트 디자인</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<!-- <link rel="stylesheet" href="./css/bootstrap.min.css"/> -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css" 
integrity="sha512-Kc323vGBEqzTmouAECnVceyQqyqdsSiqLQISBL29aUW4U/M7pSPA/gEUZQqv1cwx4OnYxTxve5UMg5GT6L4JJg==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<link rel="stylesheet" href="./css/jumpit-style.css"/>
</head>

<body>
	
	
	<header>
		<div class="inner">
			<div class="top">
				<img class="logo" src="./image/j.png"/>
				
				
				<div class="search-box">
					<i class="fa-solid fa-magnifying-glass"></i>
					<input placeholder="프론트엔드 개발자"/>
				</div>
			</div>
			<div class="bottom">
			
			
				<div>
					<span class="menu-item active">개발자 채용</span>
					<span class="menu-item">이력서</span>
					<span class="menu-item">합격족보</span>
					<span class="menu-item">#꿀 피드</span>
					<span class="menu-item">개발자 인터뷰</span>
					<span class="menu-item">개취콘</span>
				</div>
				<div>
					<span class="menu-item" onclick="location.href='http://127.0.0.1:8081/ds_front/l'">회원가입/로그인</span>
					<span class="menu-item" style="margin-right:0px">기업서비스</span>
				</div>
			
				
				
				
			</div>
		</div>
	</header>
	
	
	<section class="section" style="margin-top:130px;">
		<div class="inner">
			<div class="sec-title">개발 직무 탐색</div>
			<div>
				<span class="type-btn active">웹 개발자</span>
				<span class="type-btn">프론트엔드 개발자</span>
				<span class="type-btn">백엔드 개발자</span>
				<span class="type-btn">풀스택 개발자</span>
				<span class="type-btn">모바일 앱 개발자</span>
				<span class="type-btn">데이터 엔지니어</span>
				<span class="type-btn">데이터 과학자</span>
				<span class="type-btn">AI/ML 엔지니어</span>
				<span class="type-btn">데브옵스 엔지니어</span>
				<span class="type-btn">클라우드 엔지니어</span>
				<span class="type-btn">소프트웨어 엔지니어</span>
				<span class="type-btn">임베디드 시스템 엔지니어</span>
				<span class="type-btn">시스템 엔지니어</span>
				<span class="type-btn">보안 엔지니어</span>
				<span class="type-btn">QA 엔지니어</span>
				<span class="type-btn">프로그래밍 강사</span>
				<span class="type-btn">RPA 개발자</span>
				<span class="type-btn">게임 개발자</span>
				<span class="type-btn">UI/UX 디자이너</span>
				<span class="type-btn">기술 지원 엔지니어</span>
			</div>
		</div>
	</section>
	
	
	
	<section class="section gray">
		<div class="inner">
		
			<div>
				<span class="slt-btn" style="position: relative;">
					기술스택
					<i class="fa-solid fa-angle-down"></i>
					
					
					<!-- <div style="z-index:9999;width:300px;
					height:200px;background: #fff;
					position: absolute;top:40px;left:0;">
					</div> -->
					
					
				</span>
				
				<span class="slt-btn">
					경력
					<i class="fa-solid fa-angle-down"></i>
				</span>
				
				<span class="slt-btn">
					지역
					<i class="fa-solid fa-angle-down"></i>
				</span>
				
				
			</div>
			<div style="margin-top:20px;">
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>
					기술스택
				</span>
				
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>
					경력
				</span>
				
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>	
					지역
				</span>
				
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>	
					기술스택
				</span>
				
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>
					경력
				</span>
				
				<span class="slt-btn dark">
					<img src="./image/icons/com.png"/>
					지역
				</span>
			
			</div>
			<div style="display: flex;justify-content: flex-end;margin-top:30px;">
				<span class="order-btn active">응답률</span>
				·
				<span class="order-btn">최신순</span>
				·
				<span class="order-btn">인기순</span>
			</div>
			
			
			
			
			<div id="card-list-container">
				<nav class="card">
					<div>
					
						<div class="img-box">
							<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
							<span class="tag">D-5</span>
						</div>
						<div class="t1">골프존카운티</div>
						<div class="t2">안드로이드 개발자</div>
						<div class="t3">Android OS · Java · Kotlin · REST API</div>
						<div class="t4">서울 강남구 경력 5~15년</div>
					</div>
				</nav>
				 <!-- 카드 1 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			                <img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-3</span>
			            </div>
			            <div class="t1">회사 1</div>
			            <div class="t2">풀스택 개발자</div>
			            <div class="t3">JavaScript · React · Node.js · AWS</div>
			            <div class="t4">서울 · 경력 3-8년</div>
			        </div>
			    </nav>
			    
			    <!-- 카드 2 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-8</span>
			            </div>
			            <div class="t1">회사 2</div>
			            <div class="t2">iOS 개발자</div>
			            <div class="t3">iOS · Swift · Objective-C · REST API</div>
			            <div class="t4">부산 · 경력 4-10년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 3 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			                <img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-15</span>
			            </div>
			            <div class="t1">회사 3</div>
			            <div class="t2">백엔드 개발자</div>
			            <div class="t3">Python · Django · PostgreSQL · Docker</div>
			            <div class="t4">서울 · 경력 5-12년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 4 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-2</span>
			            </div>
			            <div class="t1">회사 4</div>
			            <div class="t2">프론트엔드 개발자</div>
			            <div class="t3">HTML · CSS · JavaScript · Angular</div>
			            <div class="t4">인천 · 경력 2-6년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 5 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-7</span>
			            </div>
			            <div class="t1">회사 5</div>
			            <div class="t2">데이터 사이언티스트</div>
			            <div class="t3">Python · 머신러닝 · TensorFlow</div>
			            <div class="t4">대전 · 경력 3-10년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 6 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-20</span>
			            </div>
			            <div class="t1">회사 6</div>
			            <div class="t2">DevOps 엔지니어</div>
			            <div class="t3">AWS · Kubernetes · CI/CD · Linux</div>
			            <div class="t4">서울 · 경력 4-8년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 7 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-10</span>
			            </div>
			            <div class="t1">회사 7</div>
			            <div class="t2">UI/UX 디자이너</div>
			            <div class="t3">Figma · Adobe XD · 사용자 리서치</div>
			            <div class="t4">대구 · 경력 5-15년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 8 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-5</span>
			            </div>
			            <div class="t1">회사 8</div>
			            <div class="t2">모바일 개발자</div>
			            <div class="t3">React Native · Java · REST API</div>
			            <div class="t4">광주 · 경력 3-7년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 9 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-13</span>
			            </div>
			            <div class="t1">회사 9</div>
			            <div class="t2">게임 개발자</div>
			            <div class="t3">Unity · C# · 3D 모델링</div>
			            <div class="t4">서울 · 경력 2-10년</div>
			        </div>
			    </nav>
			
			    <!-- 카드 10 -->
			    <nav class="card">
			        <div>
			            <div class="img-box">
			            	<img src="https://springfall.cc/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fi1.270a7ca5.jpeg&w=3840&q=75"/>
			                <span class="tag">D-18</span>
			            </div>
			            <div class="t1">회사 10</div>
			            <div class="t2">AI 엔지니어</div>
			            <div class="t3">딥러닝 · Python · 컴퓨터 비전</div>
			            <div class="t4">서울 · 경력 4-10년</div>
			        </div>
			    </nav>	
			</div>
			
		</div>
	</section>
	
	
	
	
	
	
	
	
</body>
</html>