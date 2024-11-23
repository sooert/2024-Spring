// 파이어베이스 설정
const firebaseConfig = {
    apiKey: "AIzaSyD0qbd50bRKylrlXfyInH73euD3qqwdCBI",
    authDomain: "open-market-82ccb.firebaseapp.com", 
    projectId: "open-market-82ccb",
    storageBucket: "open-market-82ccb.firebasestorage.app",
    messagingSenderId: "153123476480",
    appId: "1:153123476480:web:a627a0fdaaeb6d01efb4e5",
    measurementId: "G-YPHBM9TV1S"
};

$(document).ready(function() {

    // 파이어베이스 초기화
    firebase.initializeApp(firebaseConfig);
    var storage = firebase.storage();

    // 이미지 업로드 버튼 클릭 이벤트
    $('#item_img_url').on('click', function() {
        $('#file').trigger('click');
    });

    // 파일 선택 변경 이벤트
    $('#file').on('change', function() {
        var file = $(this)[0].files[0];
        console.log(file);

        // 파일을 base64로 변환
        getBase64(file).then(function(base64) {
            $('#item_img_url').attr('src', base64);
        });
    });

    // 폼 제출 이벤트 
    $('#item-save-btn').on('click', async function(e) {
        e.preventDefault(); // 폼 기본 제출 동작 방지\
        
        
        // 이미지 업로드 및 주소 확보
        var base64 = $('#item_img_url').attr('src');
        if (base64.length < 100) {
            // 이미지 없을 경우 빈 문자열 전달
            saveItemToDB('');
        }else {
            // 이미지 업로드    
            var img_url = await uploadImage(storage, base64, $('#item_code').val());
            // 백엔드로 요청
            saveItemToDB(img_url);
        }
    });
});

// 이미지 업로드 함수
function uploadImage(strg, base64){
    // 동기 함수 이용해 이미지 업로드 성공
    return new Promise(function(resolve, reject){
        // 현재 시간을 밀리초로 가져옴
        var d = Date.now();
        // 파일 이름 설정
        var ref = strg.ref('item').child($('#item_code').val()).child(d + ".png");

        //base64 형식으로 업로드
        ref.putString(base64, 'data_url').then(function(snapshot){
            ref.getDownloadURL().then(function(url){
                // 업로드 완료 후 백엔드로 요청
                resolve(url);
            }).catch(function(err){
                reject(err);
            });
        });
    });
}   

// 상품 등록
function saveItemToDB(img_url) {
    const itemData = {
        item_code: $('#item_code').val().trim(),
        name: $('#name').val().trim(),
        item_img_url: img_url,
        price: $('#price').val().trim(),
        discount_rate: $('#discount_rate').val().trim(),
        content: $('#content').val().trim(),
        m_rate: $('#m_rate').val().trim()
    };

    // 더 구체적인 유효성 검사
    if (!itemData.name) {
        alert('상품명을 입력해주세요.');
        return;
    }
    if (!itemData.price || isNaN(itemData.price)) {
        alert('올바른 가격을 입력해주세요.');
        return;
    }
    if (!itemData.discount_rate || isNaN(itemData.discount_rate) || itemData.discount_rate < 0 || itemData.discount_rate > 100) {
        alert('올바른 할인율을 입력해주세요. (0-100)');
        return;
    }

    // 필수 필드 검증
    if (!itemData.name || !itemData.item_img_url || !itemData.price || !itemData.discount_rate || !itemData.content || !itemData.m_rate) {
        alert('모든 필수 항목을 입력해주세요.');
        return;
    }

    $.ajax({
        url: './api/item/create',
        type: 'POST',
        data: {
            item_code: itemData.item_code,
            name: itemData.name,
            item_img_url: itemData.item_img_url,
            price: itemData.price,
            discount_rate: itemData.discount_rate,
            content: itemData.content,
            m_rate: itemData.m_rate
        },
        success: function(response) {
            alert('상품 등록이 완료되었습니다.');
            location.href = './home'; // 홈페이지로 이동
        },
        error: function(xhr) {
            if (xhr.status === 400) {
                alert('로그인이 필요합니다.');
            } else {
                alert('상품 등록 중 오류가 발생했습니다.');
            }
        }
    });
}

// 프로필 이미지 파일을 base64 로 변환하는 함수
//JM 정리 코드 promise 활용
function getBase64(file) {
    return new Promise(function(resolve, reject){
        
		var reader = new FileReader();
        reader.readAsDataURL(file);
        
        // 파일 읽기 성공 시
        reader.onload = function () {
            resolve(reader.result);
        };

        // 파일 읽기 실패 시
        reader.onerror = function (error) {
            reject('Error: ', error);
        };
    });
}