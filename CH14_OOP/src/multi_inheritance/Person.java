package multi_inheritance;

public class Person implements speaker, greeter {

	@Override
	public void greet() {
		System.out.println("환영합니다~");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 사람입니다.");
	}

}