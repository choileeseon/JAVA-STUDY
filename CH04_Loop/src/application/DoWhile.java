package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while�� ó�� �ѹ��� ���ǰ� ������� ����

//		int count = 2;
//		
//		System.out.println("do while �ݺ���");
//		
//		do {
//			System.out.println("ī��Ʈ : " + count); // 100���� �س��� ó�� 100�� ����̵�
//		} while(count++ < 5);
		
		// ���� 2,3,4
		
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; // (��������)���ڿ� ����� �ʱⰪ�� �������� //�ڵ� �� password�� �ۿ��� �����Ͽ� ��������
		
		do {
			System.out.print("��� �Է� > ");
			password = scanner.nextLine();
			// scanner.close(); �� ��ġ�� ���� �ѹ����� ����Ǵ�..
			
		} while(!password.equals(USER_PASSWORD) == true); // ����� ���� ������ true�� �ݺ�, ������ false�� �������� 
		
		//while(password.equals(USER_PASSWORD) == false); // ����� ������ true�ε� ���������� ���� false
		
		scanner.close();
		System.out.println("���ӽ���"); // ���hello(true) = false �������ͼ� ���ӽ��� 
	}

}
