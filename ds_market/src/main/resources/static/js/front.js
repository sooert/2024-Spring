function reset() {
	$('#name').val('');
	$('#age').val('');
	$('#address').val('');
}


// id : #
// class : .

$(document).ready(function() {
	
	// serarch-btn 을 눌러서 조회
	$('#search-btn').on('click', function() {
	
		//백엔드 서버 불러오기 ajax 사용 필요
		// https://jsonplaceholder.typicode.com/posts
		$.ajax({
			url : 'https://jsonplaceholder.typicode.com/posts',
			type :'get',
			data : {},
			success:function(response) {
			console.log(response);
					
			//each를 사용할수도 있음
			$.each(response, function(index, post){
				$('#post-list').append(`
					<tr>
						<th scope="row">${post.id}</th>
						<td>${post.userId}</td>
						<td>${post.title}</td>
					</tr>
							
				`);
				//1~100까지 호출
				//반복문으로 풀기
				for(var i =0; i<response.length; i++){
					var post = response[i];
					console.log(post.title);
												
					}	
	
				});	
				
			},
			error:function(error){}
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
	
// 회원 기록 증가
var number = '0';	
	
// 회원 
$('#save-btn').on('click', function(){
	var name = $('#name').val();
	var age = $('#age').val();
	var address = $('#address').val();
	
	// 회원 유효성 검사
	if(name.length==0) {
		alert('이름을 적어주세요');
		return;
	}
	if(age==0) {
		alert('나이를 적어주세요');
		return;
	}
	if(address==0) {
		alert('주소를 적어주세요');
		return;
	}
	
	
// 회원 추가
number++;
	
$('#list').append(`	
	<tr>
	  <th scope="row">${number}</th>
	   <td>${name}</td>
	   <td>${age}</td>
	   <td>${address}</td>
	 </tr> `
);
	

});
});