package abstract_Class;

public class App {
	public static void main(String[] args) {
		// 추상클래스
		// GameObject obj = new GameObject(); 객체를 만들수 없다. 추상클래스는 객체xx
		
		GameObject[] objs = { new Player(), new Monster() };

		for (GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); //구현된 추상 메소드
		}

	}

}
