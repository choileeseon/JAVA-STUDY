package application;

import game.Game;


public class App {

	public static void main(String[] args) {
		// 여기서부터 프로그램 시작
//		Game game = new Game();
//		game.run();
		new Game().run(); // 참조변수를 안써도 됨(but 실행은 되나 주소를 모름)
		
		// 클래스 불러오기 할때 Ctrl + 스페이스 or Ctrl + Shift + o (여러개 한꺼번에)
	}

}
