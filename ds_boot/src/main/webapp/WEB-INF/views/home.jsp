<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Spring start</title>
	</head>
	<body>
	<!-- 모형  -->
		<div style="border:2px solid silver;box-sizing:border-box;width:678px;height:150px;background:white;margin-top:100px;margin-left:100px;">
	 		<div style="border:1px solid silver;width:50px;height:50px;background:black;"></div>
	 		<div style="border:1px solid silver;width:100px;height:100px;background:gray;"></div>
	 	</div>
	 	
	 	<div style="border:1px solid black; width: 300px; height:150px; margin-top:20px;">
	 		<div style="background:blue; color:white; width:50%;">1</div>
	 		<div style="background:blue; color:white;">2</div>
	 		
	 		<span style="background:red; color:white; display:block;">span1</span>
	 		<span style="background:red; color:white; ">span2</span>
	 	</div>
	 	
	 	<header></header>
	 	<main></main>
	 	<footer></footer>
	 	<section></section>
	 	<nav></nav>
	 	<aside></aside>
	 	<article></article>
	 	
	 	<!-- 이미지넣고 색감&크기조정하기, 케두리 동그랗게(radius) -->
	 	
	 	<div style="width:300px; hegiht:200px; background:gray; border: 2px solid sliver;">
	 	<img style="width:300px; height:200px; object-fit:contain; " src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRm7w_Qc7Ai84rX_dJ-c_Z7KrFs5L7iINtkPQ&s"/>
	 	</div>
	 	
	 	<!-- 줄 바꿈 -->
	 	
		<hr/>
		
		<!-- 아이디, 패ㅡ워드, 이메일, 날짜, 파일 * ()value="hello" 벨류값 가능 -->
		<input type="text" placeholder="아아디" /><hr/>
		<input type="password" placeholder="패스워드"/> <hr/>
		<input type="email" placeholder="이메일"/> <hr/>
		<input type="date"/> <hr/>
		<input type="file"/><hr/>
		<input type="text" placeholder="아아디" value="hello"/> <hr/>
		
		<!-- 중복체크 불가능하게 하는 코드 -->
		<input type="radio" name="size" value="s"/>
		<span>S</span>
		
		<input type="radio" name="size" value="m"/>
		<span>M</span>
		
		<input type="radio"  name="size" value="l"/>
		<span>L</span>
		
		<!-- 체크박스  -->
		<input type="checkbox" value="s"/>
		<span>S</span>
		
		<input type="checkbox" value="m"/>
		<span>M</span>
		
		<input type="checkbox" value="l"/>
		<span>L</span>
		
		<!-- 스크롤박스 -->
		<select>
			<option value="s">small</option>
			<option value="m">medium</option>
			<option value="l">large</option>
		</select>
	
		<!-- 글꼴 -->
		<div style="font-size:10px; font-weight:100; color:black;">안녕하세요.</div>
		
		<!-- 텍스쳐 상자(한줄로 로딩) -->
		<textarea style="width:300px; height:150px; resize:none;" ></textarea>
		<textarea style="width:300px; height:150px; value: ;" >50자이내</textarea>
		
		<!-- 버튼 & url 연동 코드 -->
		<button>회원가입</button>
		<a href="https://www.naver.com/">네이버 이동</a>
		
		<!-- 버튼 -->
		<button>로그인</button>
		<a href="http://127.0.0.1:8080/ds_boot/login">로그인 이동</a>
		
		<!-- 버튼 누르면 네이버사이트로 이동 -->
		<a href="https://www.naver.com/">
		<button style="width:100px; height:50px;"><p>버튼<p></button></a>
		
		
		

	</body>
</html>