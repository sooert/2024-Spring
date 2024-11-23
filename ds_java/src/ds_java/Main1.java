package ds_java;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("안녕하세요");
		// 데이터타입(String, int, double,...) 변수명(즉, 이름) = 값;
		// int 와 long
		int a = 1000000000;

		int b;

		long bigNumber = 1001324235;

		int num1 = 10;
		int num2 = 20;

		// 더하기
		int ans1 = num1 + num2;
		// 빼기
		int ans2 = num1 - num2;
		// 곱하기
		int ans3 = num1 * num2;
		// 나누기
		int ans4 = num1 / num2;
		// 모듈려
		int ans5 = num1 % num2;

		// 실수 타입 ( 부동 소수점 타입을 가짐)
		// float 는 끝 f 필수 - float 를 사용하여 형변환(데이터 변환)
		// 4byte (32bit)
		float p1 = 3.14f;
		float ans6 = (float) num1 / num2;

		// double
		// 8byte (64bit)
		double rank = 4.11;
		double ans7 = num1 * num2;

		// 문자
		String name = "철수";
		String first = "김";
		String full = first + name;

		// boolean 는 true or false 만 사용 가능하다.
		boolean check1 = true;
		boolean check2 = false;

		// 배열고 리스트는 인덱스로 사용(순서대로 : 0,1,2,...)
		// 이름 - 멤버
		String[] members = { "철수", "대한", "민수" };
		// 불러오기
		String man = members[0];
		String man1 = members[1];
		String man2 = members[2];

		int[] numbers = { 1, 22, 33, 44, 55, 66 };

		// HashMap 키값
		// String - 문자 / Integer - 숫자 / Object - 다됨
		Map<String, Object> human = new HashMap();
		human.put("name", "김씨표");
		human.put("age", "30");
		human.put("point", "3000");
		human.put("bityh", "2001");
		// 형변환
		String humanName = (String) human.get("name");

		System.out.println();

	}

}
