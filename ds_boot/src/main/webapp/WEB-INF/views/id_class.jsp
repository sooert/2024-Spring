<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>아이디 클래스</title>
	</head>
	<style>
		
		#big.my-box.good{
			color:red;
		
		}
	
		.my-Box{
			width:300px; 
			height:100px; 
			background:red; 
			margin-bottom:20px;
		
		}
		
		.round {
			border-radius : 20px;
			background : green;
			
		}
		
		#one-box {
			width : 80px;
			height : 80px;
			background: #ffd3ca;
			margin-bottom : 20px;
			
		} 
		
		h1 {
			font-size : 20px;
		}
		
		h2{
			font-sizw: 10px;
		}
	
		.yellow-box {
			background : yellow;
		}
		
		.parent-box  div  .y {
			background : yellow;
		}
		
	</style>
	
	<body>
		<!-- 선택자 > 선택자 | 선택자 선택자 선택자 | 태그#선택자.선택자 -->
		<div class ="parent-box ">
			
			<div>
				<span class ="y">span1</span>
				<span class ="y">span2</span>
				<span class ="y">span3</span>
			</div>
		</div>
		
		<span>span4</span>
	
	
		<!-- 선택자  -->
		<!-- id 속성 사용 -->
		<div id="one-box"></div>
		
		<!-- class 속성 사용 -->
		<div class="my-Box good"></div>
		
		<div id="big" class="my-Box good"></div>
		
		<div class="my-Box" style="background:yellow;"></div>
		<div class="my-Box round"></div>
		<div class="my-Box"></div>
		<div class="my-Box"></div>
		
		
		
		


	</body>
</html>