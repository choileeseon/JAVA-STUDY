package method;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		// 인스턴스 변수의 값이 없을때 자동으로 0,null 초기화 됨 
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		p1.sayHello(); // 메소드(클래스 안의 만든 함수를 메소드) 호출
		
		p1.name = "펭수";
		p1.age = 7; 
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		p1.sayHello();
		
		Person p2 = new Person();
		p2.name = "라이언";
		p2.age = 11;
		
		p2.sayHello();
	}

}

