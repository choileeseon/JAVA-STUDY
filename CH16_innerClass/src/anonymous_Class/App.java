package anonymous_Class;

public class App {

	private String name = "펭수";
	public static void main(String[] args) {
		// 익명클래스는 이름없는 클래스
		new App().start();
	}
	private void start() {
		//System.out.println(name);
		//Runnable 인터페이스는 객체를 만들 수 없지만 익명클래스를 바로 만들어 추상메소드를 구현하여 사용가능
//		Runnable runner = new Runnable() {
//			public void run() {
//				System.out.println(name); //내부클래스로서 익명클래스
//			}
//		};
//		Runnable runner2 = new Runnable() {
//			public void run() {
//				System.out.println("헬로우 "+name); 
//			}
//		};
		
//		runner.run();
//		runner2.run();
//		activate(runner);
//		activate(runner2);
		
		activate(new Runnable() {			
			public void run() {
				System.out.println(name);
			}
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run(); //인터페이스의 추상메서드 실행
	}

}
