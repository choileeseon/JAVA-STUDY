package multiThread2;

public class App {

	private int value = 0;
	
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for(int i=0; i<1000; i++) {
				value++; //value를 1씩 증가
			}
		};
		
		Thread t1 = new Thread(runnable); //새 스레드 t1생성
		Thread t2 = new Thread(runnable); //새 스레드 t2생성
		
		t1.start(); //t1 실행
		t2.start(); //t2 실행 = 둘다 합해짐 t1+t2=value
		
//		System.out.println("Value " + value); //메인 스레드 실행
		
		t1.join(); //메인 스레드가 t1을 실행할때까지 대기
		t2.join(); //메인 스레드가 t2을 실행할때까지 대기
		
		System.out.println("Value " + value); //t1,t2가 끝난 다음 출력
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// 멀티 쓰레드2
		new App().run(); //앱 객체를 만들고 run()메소드 실행
			
	}

}
