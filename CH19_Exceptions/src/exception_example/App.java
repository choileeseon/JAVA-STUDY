package exception_example;

public class App {
	//throws InterruptedException 예외를 이렇게 처리하겟다
	public static void main(String[] args) throws InterruptedException {
		// 자바 예외
		System.out.println("하나");
		Thread.sleep(2000); //2초 대기
		System.out.println("둘");
		
	}

}
