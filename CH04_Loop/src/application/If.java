package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����� ������?");
		int apple = scanner.nextInt();
		System.out.println("�ٳ����� ������?");
		int banana = scanner.nextInt();
		scanner.close(); //��ĳ�� ����(���̻�Ⱦ���)
//		// IF ���ǹ�
//		int apple =10;
//		int banana = 5;
		
		//if������ ���ϰ�� {}���� ��ɹ��� �����Ѵ�.
		if(apple > banana) {
			System.out.println("����� �ٳ��� ���� ����");
		}
		if(apple < banana) {
			System.out.println("�ٳ����� ��� ���� ����");
		}
		System.out.println("���α׷� ����");
	}

}
