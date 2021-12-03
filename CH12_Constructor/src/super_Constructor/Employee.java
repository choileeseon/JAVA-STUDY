package super_Constructor;

public class Employee extends Person{
	public Employee() {
		// 부모 클래스의 생성자
		super("익명"); // 상속을 받았을때 생략이 돼있음 / 1번째 Person생성자
		System.out.println("Employee 생성자"); //2번째 Employee생성자
	}
	
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
