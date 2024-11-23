// 가입날짜 
function formatDate(dateString) {
  const [year, month, day] = dateString.split('-');
  return `${year}년 ${parseInt(month)}월 ${parseInt(day)}일`;
}

function fetchUsers(){
	

	// 물건판매 리스트 DB에서 가져오기
	$.ajax({
			url:'./api/item/findByAll',
			type:'get',
			data:{},
			success:function(response){
			console.log(response);
			var users = response;
							
							
	$.each(users, function(index,item){
								
	var date = item.created_date.split(' ')[0];
		date = formatDate(date);
						
		
		// 유저 리스트에 가져온 DB 내용 보내기		
			$('#item-list').append(`
			<tr>
				<th scope="row">${item.user_idx}</th>
				<td>${item.price}</td>
				<td>${item.name}</td>
				<td>${item.maker}</td>
				<td>${date}</td>
			</tr>
					`);
				});	
			},
				// 에러 생기면 확인 표시
				error:function(error){
					consol.log('DB 연결 문제');
				}			
		});
};


$(document).ready(function(){
	
	var d = '2024-11-14 12:00:22';

	var a = d.split(' ')[0];
	
	console.log(a);
	
	fetchUsers();
	
	// 버튼 누르면 상품등페이지로 이동
	$('#register-btn').on('click', function(){
		location.replace('./save-item');
	});
	
	// 버튼 누르면 홈페이지로 이동
	$('#home-btn').on('click', function(){
		location.replace('./market');
	});
	
});
