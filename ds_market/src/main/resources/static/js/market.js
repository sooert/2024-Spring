// 가입날짜 
function formatDate(dateString) {
  const [year, month, day] = dateString.split('-');
  return `${year}년 ${parseInt(month)}월 ${parseInt(day)}일`;
}

function fetchUsers(){
	
	// 회원가입자 리스트 DB에서 가져오기
	$.ajax({
			url:'./api/user/findByAll',
			type:'get',
			data:{},
			success:function(response){
			console.log(response);
			var users = response;
							
							
	$.each(users, function(index,user){
								
	var date = user.created_date.split(' ')[0];
		date = formatDate(date); 
						
		
			// 유저 리스트에 가져온 DB 내용 보내기
			// user-box 각 리스트 선택시 이동	
			//data-user-code를 통해 DB 가져오기	
			$('#user-list').append(`
			<tr class="user-box" data-user-code="${user.user_code}">
				<th scope="row">${user.user_code}</th>
				<td>${user.id}</td>
				<td>${user.nick}</td>
				<td>${user.address}</td>
				<td>${user.point}</td>
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
	
	//클릭시 해당 프로필로 이동
	$(document).on('click', '.user-box > *', function(){
		
		// .user-box에 대한 데이터 내용 찾기
		var parentBox = $(this).closest('.user-box')
		
		//데이터 코드 찾기
		var usercode = parentBox.data('user-code');
		//alert(usercode);
		
		location.href = './detail-user?code=' + usercode;
	});
	
		
	// 버튼 누르면 회원가입 페이지로 이동
	$('#join-btn').on('click', function(){
		location.replace('./save-user');
	});
	
});