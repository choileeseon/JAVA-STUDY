package NullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 널포인트 예외는 RunTimeException으로 예외처리 안해도 됨
		

		// 런타임 예외 예
		// System.out.println(5/0);
		
		//널포인트 예외, 객체가 널값인데 사용할 경우
		Scanner scanner = null; //객체 생성안됨
		scanner.nextInt(); // 주소값이 없어서 NullPointerException
		
	}

}
