package application;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ɼ��� ���� > ");
		int input = scanner.nextInt();
		scanner.close();
		
		if (input == 1) {
			System.out.println("��ο�");
		}
		else if (input == 2) {
			System.out.println("�ȳ�?");
		}
		else if (input == 3) {
			System.out.println("���α׷� ����");			
		}
		else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		//Switch case������ ����
		switch(input) {
		case 1: 
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ�??");
			break;
		case 3:
			System.out.println("���α׷� ����");
			break;
		default :
			System.out.println("�߸��� �����Դϴ�.");
			break;			
			
		}
	}
}
