package method_Overloading;

public class Person {
	//이름이 같은 그리트 메소드가 2개
	//매개변수가 다르면 다른메소드
	public void greet() {
		System.out.println("헬로우!");
	}
	public void greet(String name) {
		System.out.println("헬로우!" + name);
	}
	public void greet(int heigth) {
		if(heigth > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우~~");
	}
	
	
	public void greet(String name, int heigth) {
		if(heigth > 185) {
			System.out.println("키가 크군요!");
		}
		System.out.println("헬로우~~" + name);
	}
}
