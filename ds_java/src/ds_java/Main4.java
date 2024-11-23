package ds_java;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교 연산자
		// == : 동등
		// != : 다름
		// >,< : 대소 비교

		// 논리연산자
		// ! : 부정
		// && : 곱(and)
		// || : 합(or)

//		// 반복문
//		// for
//		for (int i = 0; i <= 100; i++) {
//			System.out.println("i");
//		}
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("hello");
//		}
//		int b;
//		for (b = 0; b < 3; b++) {
//			System.out.println("world");
//		}
//		for (b = 0; b < 6; b += 2) {
//			System.out.println("global");
//		}

		// 수업내용
		// 반복문
		// 글자 배열(리스트) - 7개 리스트
		String[] team = { "맹구", "철수", "짱구", "수지", "훈이" };

		// 초기값 | 조건식 | 증강식(++, --)
		// 사이즈 length 를 사용(글자 7이상 표기해줌)
		for (int i = 0; i < team.length; i++) {
			// 데이터 타입 member 호출
			String member = team[i];
			System.out.println(member);
		}

		// break; 와 continue; 도 사용 가능
		// 사용후 데이터 타입 적용(선택 사항) - 모를시 서치해서 찾기

	}
}
