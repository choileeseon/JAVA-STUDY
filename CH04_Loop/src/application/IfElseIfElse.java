package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("����� ������?");
		int apple = scanner.nextInt();
		System.out.println("�ٳ����� ������?");
		int banana = scanner.nextInt();
		scanner.close(); //��ĳ�� ����(���̻�Ⱦ���)
		
		
		if(apple > banana) {
			System.out.println("����� �ٳ��� ���� ����");
		}
		else if (apple < banana){
			System.out.println("�ٳ����� ��� ���� ����");
		}
		else {
			System.out.println("�ٳ����� ����� ����");
		}
		System.out.println("���α׷� ����");
	}

}


