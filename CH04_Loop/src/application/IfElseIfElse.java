package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// 스캐너
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("사과의 개수는?");
		int apple = scanner.nextInt();
		System.out.println("바나나의 개수는?");
		int banana = scanner.nextInt();
		scanner.close(); //스캐너 종료(더이상안쓸때)
		
		
		if(apple > banana) {
			System.out.println("사과가 바나나 보다 많음");
		}
		else if (apple < banana){
			System.out.println("바나나가 사과 보다 많음");
		}
		else {
			System.out.println("바나나가 사과와 같음");
		}
		System.out.println("프로그램 종료");
	}

}


