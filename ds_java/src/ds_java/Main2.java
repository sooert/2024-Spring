package ds_java;

public class Main2 {

	// 함수 선언
//		 * 1. void 함수 
//		 * 2. 로직 
//		 * 3. 매게변수 (선택사항)
//		   4. 리턴 (선택사항)

	// 함수 선언
	static void add10With20() {
		int a = 10;
		int b = 20;
		int c = a + b;

		System.out.println(c);

	}

	// 함수 매게 변수
//		 static void addTwoNumber(int num1, int num2) {
//			 int sum = num1 + num2;
//			 
//			 System.out.println(sum); 
//		}

	// String 추가
//		 static void addTwoNumber(int num1, int num2, String name) {
//			 int sum = num1 + num2;
//			 
//			 System.out.println(sum); 
//		}

	// 함수 리턴 (void 사용 X - 데이터 타입으로 사용)
	// 리턴값의 데이터타입 함수명 ( 데이터타입 변수명, …){}
	static int addTwoNumber(int num1, int num2) {
		int sum = num1 + num2;

//			 System.out.println(sum);

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실행 F11

		// 함수
//			int a = 10; 
//			int b = 20; 
//			int c = a+b; 
//			System.out.println(c);

		// 함수 선언 호출(void)
		add10With20();

//			addTwoNumber(1, 2);

//			addTwoNumber(1,2,"");

		// 함수 리턴 호출(데이터 타입) - int, Spring, boolean,...등
		int result = addTwoNumber(1, 2);
		System.out.println(result);

		int abc = addTwoNumber(1, 4);
		System.out.println(abc);

	}

}
