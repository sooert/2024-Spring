<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- jQuery를 먼저 로드 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="./js/header.js"></script>
<link rel="stylesheet" href="./css/style.css">

<header class="header">
		<div class="inner">
			<div class="top">
				<span class="logo-txt">웹 포트폴리오</span>
				
				<div>
					<!-- 로그인 전 -->
					<c:if test="${empty sessionScope.me}">
						<button id="login-btn">로그인</button>
						<button id="save-user-btn">회원가입</button>
					</c:if>

					<!-- 로그인 후 -->
					<c:if test="${not empty sessionScope.me}">
						<img style="width: 24px;height: 24px;border-radius: 50%;margin-right: 8px; position: relative; top: 5px;" 
						src="${sessionScope.me.img_url}"/>
						<span style="color:var(--color-purple);">${sessionScope.me.nick} 님</span>
						
						<!-- 현재 페이지가 save-item이면 홈 버튼을, 그렇지 않으면 상품등록 버튼을 표시 -->
						<c:choose>
							<c:when test="${pageContext.request.servletPath eq '/WEB-INF/views/save-item.jsp'}">
								<button id="home-btn">홈</button>
							</c:when>
							<c:otherwise>
								<button id="save-item-btn">상품등록</button>
							</c:otherwise>
						</c:choose>
						
						<button id="log-out-btn">로그아웃</button>
					</c:if>
					
				</div>
			</div>
			
			<div class="bottom">
				<div style="display: flex;align-items: center;">
					<img class="logo-img" src="./image/store.png"/>
					
					
					<!-- 검색창 -->
					<div class="header-input">
						<input placeholder="상품명을 입력하세요."/>
						<i class="fa-solid fa-magnifying-glass"></i>
					</div>
				</div>
			</div>
		</div>
	</header>