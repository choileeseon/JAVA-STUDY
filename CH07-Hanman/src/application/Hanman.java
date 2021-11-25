package application;

import java.util.Scanner;
public class Hanman {
	private boolean running = true; // ������ ��� ����
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayword(); //ȭ�鿡 �ܾ�ǥ��
			getUserInput(); // �Է¹���
			checkUserInput(); // �´��� üũ (���� ������ running = false)
		}while(running);
	}

	private void displayword() {
//		 System.out.println("ȭ�鿡 �ܾ�ǥ��");
		// 2. ���� ���� ��ü�� ������ �������� �� �ܾ ����Ѵ�.

		System.out.println(word.toString());
		
	}

	private void getUserInput() {
		// �������� �� ���� �Է¿䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ�
		// Randomword ��ü�� ���� ( addGuess(����) �޼ҵ带 ������)
		System.out.print("�ѹ��� �Է� : ");
		String guess = scanner.nextLine(); // �Է¹��� ���ڿ��� guess�� ����
		// �ܾ�� �Է¹��� ���ڰ� �ִ��� Ȯ�̳��ؼ� ġ���Ϥ���.(�ܾ�� Randomword ��ü word�� ���)
		word.addGuess(guess.charAt(0));
	}
	private void checkUserInput() {
		// System.out.println("�´��� üũ");
		// �������� Ȯ���� �ϴ� �޼ҵ� isCompleted �� Randomword Ŭ������ �����
		if(word.inCompleted()) {
			System.out.println("�߸�����!");
			System.out.println("������ " + word.toString());
			running = false;
		}
	}
	/**
	 * ��ĳ�ʸ� �ݴ� �ޙ���
	 */
	public void close() {
		scanner.close();
	}

}
