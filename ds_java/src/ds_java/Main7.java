package ds_java;

//// static  어플에서 주로 사용
//class ProjectConfig {
//	static String verison = "1.0.0";
//	static String severIP = "14.25.209.11";
//
//}
//
//class Information {
//	// 글자, 함수
//	String data = "data";
//}
//
//class GoodDBConnector {
//
//}
//
//class Mybackend extends GoodDBConnector {
//
//}

//인터페이스에 추상 메소드가 들어감 
interface Action {
	void run();

	void eat(String food);

}

// 인터페이스를 사용할때 implements 를 필수로 사용후,
// 기본 public void 추가
class SoccerPlayer implements Action {
	String name;
	int food = 12;

	SoccerPlayer(String name) {
		this.name = name;

	}

	// 인터페이스 추가
	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println(this.name + " 뛰는중... ");

	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(this.food + " 가지의 음식을 " + food);
	}
}

class BaseballPlayer implements Action {
	String name;
	int food = 0;

	BaseballPlayer(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " 달리는 중,, ");

	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(this.food + " 먹지 " + food);
	}
}

class GolfPlayer implements Action {
	String name;
	int food = 1;

	GolfPlayer(String name) {

		this.name = name;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println(this.name + " 치는중,,, ");

	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(this.food + " 가지의 " + food);
	}
}

public class Main7 {

	// 메인 보드
	public static void main(String[] args) {

		// 객체 지향 - name 이 되는곳
		SoccerPlayer sp = new SoccerPlayer("김철수");
		BaseballPlayer ba = new BaseballPlayer("맹구");
		GolfPlayer go = new GolfPlayer("수지");

		// 인터페이스 run 와 객체 실행.
		sp.run();
		ba.run();
		go.run();

		sp.eat("섭취..");
		ba.eat("않음,,,");
		go.eat("마시는 중,,,");

	}
}
