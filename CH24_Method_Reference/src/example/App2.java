package example;

@FunctionalInterface
interface Greeter {
	void greet();
}

public class App2 {
	public static void main(String[] args) {
		
		Greeter g = () -> System.out.println("헬로우!");
		g.greet();
		
		Greeter g2 = App2::sayHello; //메소드 레퍼런스
		g2.greet();
		
	}

	private static void sayHello() {
		System.out.println("헬로우!");
	}
}
