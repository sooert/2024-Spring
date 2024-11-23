package ds_java;

class Animal {
	// 필드(멤버변수)
	String type;
	String name;
	int age;

	// 생성자
	Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}

	// 함수(메소드)
	void sayAge() {
		System.out.println(name + " 의 나이는 " + age);

	}

	// 리턴 | 필요한것
	// this.(선택 사항)
	boolean eat(String food) {
		System.out.println(name + " 먹은 " + food);
		return true;
	}

}

public class Main5 {

	public static void main(String[] args) {

		Animal dog = new Animal("강아지", "멍멍이", 2);
		Animal cat = new Animal("고양이", "토비", 2);

		System.out.println(dog.name + " 의 나이 : " + dog.age);
		System.out.println(cat.name + " 의 나이 : " + cat.age);

		dog.sayAge();
		cat.sayAge();

		cat.eat("사료");

		dog.eat("사료");
		boolean issuCuccess = cat.eat("사료");

	}

}
