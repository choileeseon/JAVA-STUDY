package application;

public class printf {

	public static void main(String[] args) {
		// printf���

		int age = 25;
		String addr = "�λ�����";
		double pi =3.14;
		
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n", age);
		System.out.printf("�� ���̴� %d�� �̰� %s�� ����ֽ��ϴ�.\n", age,addr);
		System.out.printf("������ ���� : %.2f",pi); // %.2f �Ҽ��� 2�ڸ�����
	}

}