package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// �н����尡 Ʋ���� 3�� ��ȸ�� �ش�
		// ������ "���ӽ���"
		// 3�� Ʋ���� "���Ӱź�"

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false;
		String password = "";
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("��� �Է� > ");
			password = scanner.nextLine();

			if (password.equals(USER_PASSWORD)) {
				System.out.println("���ӽ���");
				accessOK = true; 
				break; // true�� ���������� ����Է� �ȳ�����
			} else {
				System.out.printf("����� %d�� Ʋ��\n", i);
			}
		}
		scanner.close();


		//for�� ���� ������ else �� false�� �� ���¿��� if(true){���Ӱź�} ������
		if (!accessOK) {
			System.out.println("���Ӱź�");
		}

	}

}
