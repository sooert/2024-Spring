<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Layout Page</title>
	</head>
	<style>
		@font-face {
		    font-family: 'pt';
		    src: url('https://fastly.jsdelivr.net/gh/Project-Noonnu/noonfonts_2107@1.1/Pretendard-Regular.woff') format('woff');
		    font-weight: 400;
		    font-style: normal;
			}
	
	
		.kko-btn{
			width:250px;
			height:50px;
			background : #f7d600;
			
			display:flex;
			justify-content: center;
			align-items: center;
			font-size: 15px;
			font-weight:700;
			color:#222;
			border-radius: 8px;
			cursor: pointer;
			transition-duration:0.15;
			border: 1px solid #deded;
		}
		
		.kko-btn > img{
			width:30px;
			marign-right:120px;
		}
		
		body{
		font-family : 'pt';
		
		}
		
		.kko-btn:hover{
			background: #eab500;
		
		}
		
		btn-shadow {
			box-shadow : 9px 0px 5px -7px rgba(0,0,0,0,.34);
		
		}
	
	</style>
	<body  style="position:relative;"> 
	
		<h3>카카오톡 로그인 버튼</h3>
		<div class="kko-btn btn-shadow">
			<img src="https://cdn-icons-png.flaticon.com/512/2564/2564690.png"/>
			<span>카카오톡 시작하기</span>
		</div>
		
		
		<div style="width:300px; height:200px; color:white; background:gray; display:flex; flex-direction: row;
					 justify-content:space-between;">
			<span>레이아웃1</span>
			<span>레이아웃2</span>
			<span>레이아웃3</span>
		
		</div>
		
		<!--  -->
		<h3>flex</h3>
		<div style="width:300px; height:150px; color:white; background: blue; display:flex; 
							flex-direction:row; justify-content: center; align-items:center; margin-top:10px;">
			<span>login1</span> 
			
		</div>
		<!--  -->
		<h3>position</h3>
		<div style="width:200px; height:200px; background:green;">
			<div style="width:100px; height:100px; background:yellow;">
					<div style="width:80px; height:80px; background:red; position:obsolute; top:0; left:10;"></div>			
			</div>
			
		</div>
	
	
	
		<div style="width:300px; height:200px; background:gray; position:relative;">
			<div style="width:50px; height:50px; background:black; position:absolute; top:0px; right:0px;" ></div>
		</div>
		<div style="width:200px; height:100px; background:green; position:relative;">
			<div style="width:100px; height:50px; background:yellow; position:absolute; top:0px;bottom:0px; right:28%; border-radius:10px;"></div>
		</div>
		
		
		
		
	</body>
</html>