package application;

import java.util.Scanner; //java.util ��Ű�� �ȿ� ScannerŬ������ �ҷ��ͼ� ��밡��

public class UserInput {

	public static void main(String[] args) {
		// �Է��� �޴� Ŭ����
		Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü�� ����

		System.out.print("�µ��� �Է��� �ּ���");

		double c =scanner.nextDouble(); //���� ���� c�ʱⰪ�� 25
		double f = (c * 9/5) + 32; //ȭ�� ������ f
		
		System.out.printf("���� %.1f�� ȭ�� %.1f �̴�",c,f);
	}

}
