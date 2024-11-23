<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>상품등록</title>
<!-- 제이쿼리 -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- 파이어베이스 -->
<script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/8.10.0/firebase-storage.js"></script>
<!-- 폰트어웨이스 -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.0/css/all.min.css" integrity="sha512-9xKTRVabjVeZmc+GUW8GgSmcREDunMM+Dt/GrzchfN8tkwHizc5RP4Ok/MXFFy5rIjJjzhndFScTceq5e6GvVQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!-- 스타일 -->
<link rel="stylesheet" href="./css/save-item.css"/>
<!-- 자바스크립트 -->
<script src="./js/save-item.js"></script>

</head>
<body>
	<!-- 헤더 파일 포함 -->
	<%@ include file="./include/header.jsp" %>	
  <div class="form-container" style="width: 600px; margin-bottom: 100px;">
    <h1>상품등록</h1>
    <p><strong>상품정보를 입력해주세요.</strong></p>
    
    <form>
      <div class="form-group">
        <label for="name">상품 제목*</label>
        <input type="text" id="name" name="name" style="width: 95%;" placeholder="상품 제목을 입력하세요."/>
      </div>
      
      <div class="form-group">
        <label>이미지*</label>
        <div type="file">
          <!-- 프로필 이미지 업로드 -->
				<img id="item_img_url" src="./image/default_profile.png" style="margin-bottom: 10px;"/>
				<input type="file" id="file" style="padding-top: 10px; width: 30%;">
        </div>
      </div>

      <div class="form-group">
        <label for="item_code">상품 코드*</label>
        <input type="text" id="item_code" name="item_code" style="width: 95%;" placeholder="상품 코드를 입력하세요.">
      </div>

      <div class="form-group">
        <label for="price">가격*</label>
        <input type="number" id="price" name="price" style="width: 95%;" placeholder="가격을 입력하세요.">
      </div>

      <div class="form-group">
        <label for="discount_rate">할인가격*</label>
        <input type="number" id="discount_rate" name="discount_rate" style="width: 95%;" placeholder="할인가격을 입력하세요.">
      </div>
      
      <div class="form-group">
        <label for="content">상품 내용*</label>
        <textarea id="content" name="content" style="width: 96%;" placeholder="상품 내용을 자세히 적어주세요."></textarea>
      </div>

	
      <div class="form-group">
        <label for="m_rate">멤버쉽 포인트*</label>
        <input type="number" id="m_rate" name="m_rate" style="width: 95%;" placeholder="멤버쉽 포인트를 입력하세요.">
      </div>
      
      <button id="item-save-btn" style="display: block; margin: 0 auto;" type="submit">상품 등록</button>
    </form>
  </div>

</body>
</html>