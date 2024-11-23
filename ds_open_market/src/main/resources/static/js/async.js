let a = 0;
$(document).ready(async function() {

    // 비동기 함수를 동기로 바꾸는 함수
    // var result = await changeAAfter2Sec();
    // alert(result);
    
    try{
        await changeAAfter2Sec();
    }catch(e){
        alert('에러 발생');
    }

    console.log(a);

    // 2초뒤 a가 변경됨.
    // changeAAfter2Sec().then(function() {
    //     //resolve 된 값을 받아옴
    //     console.log(a);
    // }).catch(function(error){
    //     //reject 된 값을 받아옴
    //     console.log(error);
    // });
}); 



function asyncFunc(){
    return new Promise(function(resolve, reject){
        $.ajax({
            url: 'http://localhost:8080/api/test',
            success: function(data){
                resolve(data);
            },
            error: function(error) {
                reject(error);
            }
        });
    });
}   

// 2초뒤 a가 변경됨.
function changeAAfter2Sec(){

    // 비동기 함수를 동기로 바꾸는 함수
    return new Promise(function(resolve, reject){

        // 비동기 함수
    setTimeout(function(){
        a = 1;
        console.log('2초뒤 a가 변경됨.');
        resolve('good');
        },2000);

    });
}