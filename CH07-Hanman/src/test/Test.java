package test; // 테스트용 패키지

import java.util.Random;
import application.Randomword;

public class Test { 
	public static void main(String[] args) {
		Randomword r = new Randomword();
//		r.getWords();
//		System.out.println(r.toString());
//		랜덤으로 단어를 가져오는 방법?
		Random random = new Random();
		
		String[] words = {"펭수","소","고양이","라이언","늑대"};
		
		for(int i =0; i<100; i++ ) {
			int randomIndex = random.nextInt(words.length); // 0~(배열갯수-1)랜덤으로 출력
			System.out.println(words[randomIndex]);
		}
	}
}
