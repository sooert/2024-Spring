function reset() {
	$('#user_idx').val('');
	$('#name').val('');
	$('#maker').val('');
	$('#price').val('');
}

// id : #
// class : .


$(document).ready(function() {
	
	// 상품등록 
	$('#save-btn').on('click', function(){
		var user_idx = $('#user_idx').val();
		var name = $('#name').val();
		var maker = $('#maker').val();
		var price = $('#price').val();
	
		// 상품등록 유효성 검사
		if(user_idx==0) {
			alert('아이디를 적어주세요');
			return;
		}
		if(name==0) {
			alert('상품이름을 적어주세요');
			return;
		}
		if(maker==0) {
			alert('제조사를 적어주세요');
			return;
		}
		if(price==0) {
			alert('가격을 적어주세요');
			return;
		}
		
		// 백엔드로 요청
		$.ajax({
			url : './api/item/create',
			type :'post',
			data : {
				user_idx: user_idx,
				name: name,
				maker: maker,
				price: price
			},
			success:function(response) {
				if(response == 'ok') {
					alert("상품등록이 완료 되었습니다.");
					//완료되면 홈 페이지로 이동
					location.replace('./item');
					
				}else if(response == 'user_idx') {
					alert("이미 등록된 아이디가 존재합니다.");
				}
							
			},
		// 오류 출력
		error:function(error){
			
		}
	});		
	

});

//주소창 검색
/*$('#address').on('click', function() {
	new daum.Postcode({
		 oncomplete: function(data) {
		 // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
		 // 예제를 참고하여 다양한 활용법을 확인해 보세요.
		     
			console.log(data.address);
			$('#address').val(data.address);
			   
			  }
		  }).open();
	});*/

});