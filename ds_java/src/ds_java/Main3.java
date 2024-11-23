package ds_java;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자
		// == : 동등
		// != : 다름
		// >,< : 대소 비교

		// 논리 연산자
		// ! : 부정
		// && : 곱(and)
		// || : 합(or)

//		// 조건문(if, switch)
//		int a = 10;
//
//		// if
//		if (a < 0) {
//			// a 가 0보다 큰 경우
//			int x = 200;
//			System.out.println(x + a);
//		}
//
//		// if, else
//		int b = 10;
//
//		if (b > 0) {
//			// a 가 0보다 큰 경우
//			System.out.println("크다");
//		} else {
//			// a 가 0보다 작은 경우
//			System.out.println("작다");
//		}
//
//		// if, else if
//		int score2 = 100;
//
//		if (score2 == 100) {
//			// 100인 경우
//			System.out.println("골 : 100점");
//
//		} else if (score2 == 200) {
//			// 200인 경우
//			System.out.println("골 : 200점");
//		} else {
//			// 100, 200 둘다 아닌 경우
//			System.out.println("파울");
//		}
//
//		// if 중첩..
//		int score3 = 95;
//
//		if (score3 >= 90) {
//			// score3가 90보다 크거나 같을 경우
//		}
//		if (score3 >= 95) {
//			// score3가 95보다 크거나 같을 경우
//			System.out.println("A+");
//		} else {
//			// score3 작은 경우
//			System.out.println("A0");
//		}

//
//		// switch 문 - case - break
//		int c = 10;
//		switch (c * 2) {
//		case 10:
//			System.out.println("10점");
//			break;
//		case 20:
//			System.out.println("20점");
//			break;
//		case 30:
//			System.out.println("30점");
//			break;
//		case 40:
//			System.out.println("40점");
//			break;
//		{	

		// 수업중에 한 내용
		// 조건문
		// if
		int score = 100;

		if (score == 100) {
			System.out.println("100점");
		} else if (score > 0) {
			System.out.println("0보다 큽니다.");
		} else {
			System.out.println("0점");
		}

		// switch
		switch (score) {
		case 100:
			System.out.println("골");
			break;
		case 200:
			System.out.println("파울");
			break;
		}

	}
}
