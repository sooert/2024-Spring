<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	//alert('home');
	//console.log('home');
	
	// 데이터 > 동적타임
	var a = 10;
	var b = 'hello';
	var check = true;
	
	var d;
	d = 20;
	
	//alert(b);
	
	// 1. var : 재선언(o), 재할당(o)
	var v1 = 10;
	var v1 = 'a';
	v1 = 20;
	
	// 2. let : 재선언(x), 재할당(o)
	let v2 = 10;
	//let v2 = 20; -> (X)
	v2 = 30;
	
	// 3. const : 재선언(x), 재할당(x), 초기값 필수
	const pi = 3.14;
	
	// 배열
	var arr = ['a', 'b', 'c'];
	//alert(arr[1]);
	
	//오브젝트(맵)
	var person = { 
		name:'정수',
		age:'나이',
		asset:['노트북', '키보드', '마우스']
	};
	
	// 모든 언어는 '' 사용 필수 
	var pname : person['name'];
	
	// 문자일땐 사용 (요게 더 간편)
	var pname : person.name;
	
	// 예시 
	var mouse : person['assset'][3];
	var mouse : person.assset[3];
	
	/*                                                 */
	
	// 함수
	// function 함수 선언 필수
	function add10_20() {
		var sum = 10+20;
		console.log(sum);
	}
	// 출력
	add10_20();
	
	
	function addTwoNumbers(a,b) {
		var sum = a+b;
		return sum;
	}
	
	 var result = addTwoNumbers(10,20);
	alert(result);
	
	/*                                                 */

	// 조건문
	/* if() {
		
	}else if() {
		
	}else {
	
	}  */
	
	// 조건문 식
	/* for(var i = 0; i<100; i++) {
	
		consol.log(i);
	} */
	
	// 조건문 + 배열
	var teams = ['철수', '짱구', '유리', '맹구']
	for(var i =0; i<team.length; i++) {
		var members = team[0];
		console.log(members)
		
	}
	
	var users = [
		{
			// 오브젝트
			id:'test1',
			pw:'1234',
			nick:'테스트1'
		},
		{
			// 오브젝트
			id:'test2',
			pw:'1234',
			nick:'테스트2'
		},
		{
			// 오브젝트
			id:'test3',
			pw:'1234',
			nick:'테스트3'
		}
	];
	
	// 이렇게도 var, 배열, 조건문을 이렇게 사용 가능
	for(var i = 0; i<users.length i++) {
		var user = users[1];
		console.log('${users.id}의 닉네임은 ${users.nick}입니다.');
	}
	
	/*                                                 */
	
	// 반복문
	
	
</script>
	

<body>
	
	
	
	
</body>
</html>