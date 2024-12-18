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

// 입력 초기화
function reset() {
    $('#id').val('');
    $('#nick').val('');
    $('#pw').val('');
    $('#address').val('');
    $('#pwcheck').val('');

    // 중복체크
    $('#id-result-txt').text('');
    $('#nick-result-txt').text('');
    $('#pw-result-txt').text('');
}

// 비밀번호 타이핑했을때 확인 
function validatePassword(password, passwordCheck) {
    // 첫 번째 비밀번호 입력란일 경우
    if (!passwordCheck) {
        if (!password) return "empty";
        if (password.length < 8) return "short";
        const passwordRegex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$/;
        if (!passwordRegex.test(password)) return "invalid";
        return "ok";
    }
    // 비밀번호 확인란일 경우
    else {
        if (password !== passwordCheck) return "notmatch";
        return "match"; 
    }
}

// 비밀번호 경고 창 표시
var enablePw = false;
function buildResultText(result, isPasswordCheck) {
    const resultText = $('#pw-result-txt');
    
    // 비밀번호 확인란이 아닐 경우
    if (!isPasswordCheck) {
        switch(result) {
            case 'empty':
                resultText.text('비밀번호를 입력해주세요.').css('color','#f01200');
                enablePw = false;
                break;
            case 'short':
                resultText.text('비밀번호는 8자 이상이어야 합니다.').css('color','#f01200');
                enablePw = false;
                break;
            case 'invalid':
                resultText.text('영문/숫자/특수문자를 모두 포함해야 합니다.').css('color','#f01200');
                enablePw = false;
                break;
            case 'ok':
                if ($('#pw').val() === $('#pwcheck').val() && $('#pwcheck').val() !== '') {
                    resultText.text('비밀번호가 일치합니다.').css('color','#006bea');
                    enablePw = true;
                }
                break;
        }
    } else if ($('#pw').val() === $('#pwcheck').val() && $('#pwcheck').val() !== '') {
        resultText.text('비밀번호가 일치합니다.').css('color','#006bea');
        enablePw = true;
    } else {
        resultText.text('비밀번호가 일치하지 않습니다.').css('color','#f01200');
        enablePw = false;
    }
}

$(document).ready(function() {

    //firebase 초기화
    if (!firebase.apps.length) {
        firebase.initializeApp(firebaseConfig);
    }

    //스토리지 초기화
    var storage = firebase.storage();

    // 프로필 이미지 클릭 시 파일 업로드 창 띄우기
    $('#profile-img').on('click', function() {
        $('#file').click();
    });
    
    // 프로필 이미지 업로드
    $('#file').on('change', function() {
        var file = $(this)[0].files[0];
        console.log(file);

        // 파일을 base64 로 변환
        getBase64(file).then(function(base64){
            $('#profile-img').attr('src', base64);
        })
    });
    
    // 한글 입력 방지
    $('#id, #pw').on('keyup', function(e) {
        var id = $(this).val();
        var pw = $(this).val();

        $(this).val(id.replace(/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g, ''));
        $(this).val(pw.replace(/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/g, ''));
    });
    
    // 비밓번호 특수 문자 타이핑 쳤을때 확인
    $('#pw, #pwcheck').on('keyup', function() {
        var pw = $('#pw').val();
        var pwcheck = $('#pwcheck').val();
        var isPasswordCheck = $(this).attr('id') === 'pwcheck';
        
        var result = validatePassword(pw, pwcheck);
        
        if (isPasswordCheck) {
            // 비밀번호 확인란일 경우
            if (pwcheck) {
                if (result === 'match') {
                    $('#pw-result-txt').text('비밀번호가 일치합니다.').css('color','#006bea');
                    enablePw = true;
                } else {
                    $('#pw-result-txt').text('비밀번호가 일치하지 않습니다.').css('color','#f01200');
                }
            }
        }
        
        // 경고창 요청
        buildResultText(result, isPasswordCheck);
    });
    
    // 회원 가입
    $('#signup-btn').on('click', function(e) {
        // 기본 폼 제출 동작 방지
        e.preventDefault();
        
        const userData = {
            id: $('#id').val(),
            nick: $('#nick').val(), 
            pw: $('#pw').val(),
            pwcheck: $('#pwcheck').val(),
            address: $('#address').val(),
        };

        // 각 필드 유효성 검사
        if (!validateInput(userData.id, '아이디')) {
            return;
        }
        if (!validateInput(userData.pw, '비밀번호')) {
            return;
        }
        if (!validateInput(userData.nick, '닉네임')) {
            return;
        }
        if (!validateInput(userData.address, '주소')) {
            return;
        }

        // 비밀번호 일치 여부 체크
        if(userData.pw != userData.pwcheck) {
            alert('비밀번호가 일치하지 않습니다.');
            return;
        }
        
        // 비밀번호 경고창부분에서 일치하지 않는지 체크
        if(enablePw==false) {
            alert('비밀번호가 일치하지 않습니다.');
            return;
        }
        
        if (!isIdVerified) {
            alert('아이디 중복 확인이 필요합니다.');
            return;
        }
        
        if (!isNickVerified) {
            alert('닉네임 중복 확인이 필요합니다.');
            return;
        }
        
        // 이미지 업로드 및 주소 확보
        var base64 = $('#profile-img').attr('src');
        if (base64.length < 100) {
            // 이미지 없을 경우 빈 문자열 전달
            saveUserToDB('');
        }else {
            //firebase 업로드
            var ref = storage.ref('some_path').child("img.png");

            //base64 형식으로 업로드
            ref.putString(base64, 'data_url').then(function(snapshot){
                ref.getDownloadURL().then(function(url){
                    // 업로드 완료 후 백엔드로 요청
                    saveUserToDB(url);
                }).catch(function(err){
                    console.log(err);
                });
            });
        }
    });

    //주소창 검색
    $('#address').on('click', function() {
        new daum.Postcode({
            oncomplete: function(data) {
                console.log(data.address);
                $('#address').val(data.address);
            }
        }).open();
    });

    // 중복 확인 상태를 저장할 변수 추가
    let isIdVerified = false;
    let isNickVerified = false;

    function checkDuplicateId() {
        const id = $('#id').val();
        
        if (!id) {
            alert('아이디를 입력해주세요.');
            return;
        }
        
        $.ajax({
            url: './api/user/getById',
            type: 'get',
            data: { id: id },
            success: function(response) {
                if (!response) {
                    $('#id-result-txt')
                        .text('사용 가능한 아이디입니다.')
                        .css('color', 'green');
                    isIdVerified = true;
                } else {
                    $('#id-result-txt')
                        .text('이미 사용중인 아이디입니다.')
                        .css('color', 'red');
                    $('#id').val('');
                    isIdVerified = false;
                }
            },
            error: function() {
                alert('서버 오류가 발생했습니다.');
                isIdVerified = false;
            }
        });
    }

    function checkDuplicateNick() {
        const nick = $('#nick').val();
        
        if (!nick) {
            alert('닉네임을 입력해주세요.');
            return;
        }
        
        $.ajax({
            url: './api/user/getByNick',
            type: 'get',
            data: { nick: nick },
            success: function(response) {
                if (!response) {
                    $('#nick-result-txt')
                        .text('사용 가능한 닉네임입니다.')
                        .css('color', 'green');
                    isNickVerified = true;
                } else {
                    $('#nick-result-txt')
                        .text('이미 사용중인 닉네임입니다.')
                        .css('color', 'red');
                    $('#nick').val('');
                    isNickVerified = false;
                }
            },
            error: function() {
                alert('서버 오류가 발생했습니다.');
                isNickVerified = false;
            }
        });
    }

    // 입력값 유효성 검사 함수 추가
    function validateInput(value, fieldName) {
        if (!value || value.length === 0) {
            alert(`${fieldName}을(를) 입력해주세요.`);
            return false;
        }
        return true;
    }

    // ID 입력 필드 변경 감지
    $('#id').on('input', function() {
        isIdVerified = false;
        $('#id-result-txt').text('중복 확인이 필요합니다.').css('color', 'orange');
    });

    // 닉네임 입력 필드 변경 감지
    $('#nick').on('input', function() {
        isNickVerified = false;
        $('#nick-result-txt').text('중복 확인이 필요합니다.').css('color', 'orange');
    });

    // 아이디 중복확인 버튼 클릭 이벤트
    $('.idcheck').on('click', function() {
        checkDuplicateId();
    });
    
    // 닉네임 중복확인 버튼 클릭 이벤트
    $('.nickcheck').on('click', function() {
        checkDuplicateNick();
    });

    // 엔터키 이벤트 처리 수정
    $('#id').on('keypress', function(e) {
        if (e.keyCode === 13) {
            e.preventDefault();
            $('.idcheck').click();
        }
    });

    $('#nick').on('keypress', function(e) {
        if (e.keyCode === 13) {
            e.preventDefault();
            $('.nickcheck').click();
        }
    });

    $('#pw, #pwcheck').on('keypress', function(e) {
        if (e.keyCode === 13) {
            e.preventDefault();
            if ($('#id').val() && $('#nick').val() && $('#pw').val() && $('#pwcheck').val()) {
                $('#signup-btn').click();
            } else {
                let nextInput = $(this).parent().next().find('input');
                if (nextInput.length > 0) {
                    nextInput.focus();
                }
            }
        }
    });
});

// 회원가입 & 이미지 업로드 후 백엔드로 요청
function saveUserToDB(img_url){
    // 필요한 데이터를 다시 가져옵니다
    const userData = {
        id: $('#id').val(),
        pw: $('#pw').val(),
        nick: $('#nick').val(),
        address: $('#address').val()
    };

    // 백엔드로 요청
    $.ajax({
        url : './api/user/create',
        type :'post',
        data : {
            id: userData.id,
            pw: userData.pw,
            nick: userData.nick,
            address: userData.address,
            img_url: img_url
        },
        success: function(response) {
            if(response == 'ok') {
                alert("회원가입이 완료되었습니다.");
                window.location.href = './home';
            } else if(response == '동일한 id') {
                alert("이미 가입된 아이디가 존재합니다.");
            } else if(response == '동일한 nick') {
                alert("이미 사용중인 닉네임입니다.");
            } 
        },
        error: function(error) {
            console.error('Error:', error);
            alert('서버 통신 중 오류가 발생했습니다. 잠시 후 다시 시도해주세요.');
        }
    });
}

// 프로필 이미지 파일을 base64 로 변환하는 함수
//JM 정리 코드 promise 활용
function getBase64(file) {
    return new Promise(function(resolve, reject){
        // 파일을 읽어오는 객체 생성
        var reader = new FileReader();

        // 파일을 읽어오는 객체 생성
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