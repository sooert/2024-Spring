function reset() {
	$('#id').val('');
	$('#nick').val('');
	$('#pw').val('');
	$('#address').val('');
	$('#pwcheck').val('');
	
	$('#pw-result-txt').val('');
}

// 비밀번호 타이핑했을때 확인
function validatePassword(password, passwordCheck) {
	
	// 비밀번호 길이 확인 (6자리 이상)
	const lengthValid = password.length >= 6;
	if(lengthValid==false) {
		return "short";
	}

	// 특수문자 포함 여부 확인
	const specialCharValid = /[!@#$%^&*()_+~`|}{[\]:;?><,./\\\-]/.test(password);
	if(specialCharValid==false) {
		return "special";
	}
	// 비밀번호가 일치하지 않을 경우
	if(password != passwordCheck) {
		return 'notmatch';
	}
	// 문제 없으면 ok 요청
	return "ok";
}

// 비밀번호 경고 창 표시 
var enablePw=false;
function buildResultText(result){
	if(result=='short'){
		enablePw=false;
		$('#pw-result-txt')
			.html('비밀번호는 6자리 이상 적어주세요.(특수문자 포함)')
			.css('color','#f01200');
			
	}else if(result=='special'){
		enablePw=false;
		$('#pw-result-txt')
			.html('비밀번호는 6자리 이상 적어주세요.(특수문자 포함)')
			.css('color','#f01200');
			
	}else if(result=='notmatch'){
		enablePw=false;
		$('#pw-result-txt')
			.html('비밀번호가 일치 하지 않습니다.')
			.css('color','#f01200');
			
	}else if(result=='ok'){
		enablePw=true;
		$('#pw-result-txt')
			.html('비밀번호가 일치합니다.')
			.css('color','#006bea');
	}
}


// id : #
// class : .

$(document).ready(function() {
	
	// 비밓번호 특수 문자 타이핑 쳤을때 확인
	$('#pw, #pwcheck').on('keyup', function() {
		var pw = $('#pw').val();
		var pwcheck = $('#pwcheck').val();
		
		var result = validatePassword(pw, pwcheck);
		console.log(result);
		
		// 경고창 요청
		buildResultText(result);
		
	});
	
		
		
	// 회원 가입 
	$('#save-btn').on('click', function(){
		var id = $('#id').val();
		var nick = $('#nick').val();
		var pw = $('#pw').val();
		var pwcheck = $('#pwcheck').val();
		var address = $('#address').val();
	
		// 회원 유효성 검사 
		if(id.length==0 || id.length>200) {
			alert('아이디를 적어주세요');
			return;
		}
		if(nick==0) {
			alert('닉네임을 적어주세요');
			return;
		}
		if(pw==0) {
			alert('비밀번호를 적어주세요');
			return;
		}
		if(address==0) {
			alert('주소를 적어주세요');
			return;
		}
				
		// 비밀번호 일치 여부 체크	
		if(pw != pwcheck) {
			alert('비밀번호가 일치하지 않습니다.'); 
			return;  
		}
		
		// 비밀번호 경고창부분에서 일치하지 않는지 체크
		if(enablePw==false) {
			alert('비밀번호가 일치하지않습니다.');
			return;
		}
		
		// 백엔드로 요청
		$.ajax({
			url : './api/user/create',
			type :'post',
			data : {
				id: id,
				pw: pw,
				nick: nick,
				address: address
			},
			success:function(response) {
				if(response == 'ok') {
					alert("회원가입에 완료 되었습니다.");
					//완료되면 홈 페이지로 이동
					location.replace('./market');
					
				}else if(response == 'id') {
					alert("이미 가입된 아이디가 존재합니다.");
				}else if(response == 'pw') {
					alert("이미 가입된 비밀번호가 존재합니다.");
				}
							
			},
		// 오류 출력
		error:function(error){
			
		}
	});		
	

});

//주소창 검색
$('#address').on('click', function() {
	new daum.Postcode({
		 oncomplete: function(data) {
		 // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
		 // 예제를 참고하여 다양한 활용법을 확인해 보세요.
		     
			console.log(data.address);
			$('#address').val(data.address);
			   
			  }
		  }).open();
	});

});