package ds_java;

//Person 에 Korea 데이터 상속(extends 를 사용)
//Korea 의 정보도 사용 가능하다.
class Person extends Korea {
	String name;
	int age;

	// 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 함수(메소드)
	void getInfo() {
		System.out.println(super.name);
	}
}

class Korea extends Other {
	String nationName = "대한민국";
	String captial = "서울";
	int population = 5174000;
	// +1000개 데이터

	String name = "김코딩";

}

class Other {
	String name = "김철수";
}

// 상속 extends 로 사용
//class A extends B {
//	String aName = "a";
//
//}
//
//class B {
//	String bName = "b";
//
//}
//
//class C {
//	String cName = "c";
//
//}

// 추상 클래스(abstract) = 인터페이스 비슷
abstract class Device {
	int birth = 2024;

	abstract void sound();

}

class smartPhone extends Device {
	// Device sound 상속
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Ring Ring Ring");

	}

}

class Desktop extends Device {
	// Device sound 상속
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dong Dong Dong");
	}

}

// public : 공개
// protected : 같은 패키지
// default 
// private : 비공개(캡슐화) - public 에서 불러와야함(getInfo)

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person man1 = new Person("김철수", 24);
		Person man2 = new Person("김코딩", 23);

		// Korea 의 정보도 사용 가능하다.
//		System.out.println(man1.name);
//		System.out.println(man1.age);
//
//		System.out.println(man2.name);
//		System.out.println(man2.age);

//		A a = new A();

	}

}
