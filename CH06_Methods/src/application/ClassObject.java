package application;

// 하나의 파일에 여러개의 클래스를 만들 수 있다 (앞에 public을 쓰면 안됨)
class Person {
	String name; // 인스턴스 변수

	

	
}

// public class는 한 파일에 하나만 생성가능, 파일이름과 같음
public class ClassObject {

	public static void main(String[] args) { // static 이 있어야 메모리에 생성이 된다
		// 클래스와 객체
		// 클래스는 설계도이고 실제 사용가능한 객체를 생성(객체는 실제 메모리에 생성됨 = 인스턴스)
		Person p1 = null;// 참조변수 펄슨 클래스 타입 p1선언, 초기값 없음
		System.out.println(p1);
		p1 = new Person(); // Person의 실제 객체를 생성하여 그 주소값을 p1에 대입
		
		System.out.println(p1); // 주소값 나옴 application.Person@606d8acf 

		p1.name = "펭수";
		
		Person p2 = new Person();
		p2.name = "길동";
		
		Person p3 = new Person();
		p3.name = "라이온";

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}

}
