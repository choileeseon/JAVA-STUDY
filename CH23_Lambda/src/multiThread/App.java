package multiThread;

public class App {

	public static void main(String[] args) {
		// 멀티 쓰레드
		Runnable runnable = () -> {
			for(int i=0; i<100; i++) {
				System.out.println("i : "+i);
				try {
					Thread.sleep(500); //0.5초대기
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		};
		
		// t1은 runnable의 for문을 실행시킴
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start(); // 한번씩 t1t2순서로 출력
		t2.start(); 
		
		System.out.println("헬로우!"); //먼저실행
		
		
	}

}
